package mx.com.metalsa.spx.rest.api.service.consultant.impl;

import mx.com.metalsa.spx.rest.api.model.TblControl;
import mx.com.metalsa.spx.rest.api.model.TblControlId;
import mx.com.metalsa.spx.rest.api.model.WSResponse;
import mx.com.metalsa.spx.rest.api.repository.impl.TblControlRepository;
import mx.com.metalsa.spx.rest.api.repository.impl.TblCoreIntegratorControlRepository;
import mx.com.metalsa.spx.rest.api.service.IntegrationService;
import mx.com.metalsa.spx.soap.service.reports.wsdl.RunReport;
import mx.com.metalsa.spx.soap.service.reports.wsdl.RunReportResponse;
import mx.com.metalsa.spx.soap.web.services.ReportClient;
import org.omg.CORBA.OBJ_ADAPTER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.relation.RoleUnresolved;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class IntegrationServiceImpl implements IntegrationService {


    @Autowired
    private TblControlRepository tblControlRepository;
    @Autowired
    private TblCoreIntegratorControlRepository tblCoreIntegratorControlRepository;

    private ReportClient reportClient;

    @Autowired
    public IntegrationServiceImpl(ReportClient reportClient){
        this.reportClient = reportClient;
    }

    @Override
    public List<TblControl> getTblControl() {

        return StreamSupport.stream(tblControlRepository.findAll().spliterator(), false).collect(Collectors.toList());
    }

    @Override
    public TblControl createTblControl(TblControl tblControl) {
        return tblControlRepository.save(tblControl);
    }

    @Override
    public TblControl getTblControlById(TblControlId id) {
        Optional<TblControl> optional = tblControlRepository.findById(id);
        return optional.get();
    }

    @Override
    public TblControl updateTblControltById(String tableName, TblControl tblControl) {
        Optional<TblControl> otblControl = tblControlRepository.findOneByTableName(tableName);
        if(otblControl.isPresent()) {
            TblControl value = otblControl.get();
            value.setModule(tblControl.getModule());
            value.setTableName(tblControl.getTableName());
            value.setReportAbsolutePath(tblControl.getReportAbsolutePath());
            value.setTiempo(tblControl.getTiempo());
            tblControlRepository.save(value);
            return tblControl;
        }

        return new TblControl();

    }

    @Override
    public void deleteTblControlById(TblControl tblcontrol) {
        tblControlRepository.delete(tblcontrol);
    }

    @Override
    public RunReportResponse queryRunReport(String absolutePath) {
        RunReportResponse runReportResponse = reportClient.runReport(absolutePath);
        return runReportResponse;
    }

    @Override
    public Map<String, Object> callProcedure(TblControl tblControl, RunReportResponse runReportResponse) {
        Map<String, Object> spResult = tblCoreIntegratorControlRepository.genericIntegrator(tblControl.getModule(),
                tblControl.getTableName(), new String(runReportResponse.getRunReportReturn().getReportBytes(), StandardCharsets.UTF_8));

        return spResult;
    }

    @Override
    public WSResponse callIntegration(String tableName) {
        Optional<TblControl> optional = tblControlRepository.findOneByTableName(tableName);
        WSResponse response = new WSResponse();
        Map<String, Object> results = new HashMap<>();

        if(optional.isPresent()){
            TblControl tblControl = optional.get();
            RunReportResponse runReportResponse = queryRunReport(tblControl.getReportAbsolutePath());
            if(null != runReportResponse){
                results = callProcedure(tblControl, runReportResponse);

                response.setCode(Integer.parseInt(results.get("O_RESPONSE_CODE").toString()));
                response.setMessage(results.get("O_RESPONSE_MESSAGE").toString());
            }

        }
        return response;
    }


}
