package mx.com.metalsa.spx.rest.api.service;

import mx.com.metalsa.spx.rest.api.model.TblControl;
import mx.com.metalsa.spx.rest.api.model.TblControlId;
import mx.com.metalsa.spx.rest.api.model.WSResponse;
import mx.com.metalsa.spx.soap.service.reports.wsdl.RunReportResponse;

import java.util.List;
import java.util.Map;

public interface IntegrationService {

    List<TblControl> getTblControl();
    TblControl createTblControl(TblControl tblControl);
    TblControl getTblControlById(TblControlId id);
    TblControl updateTblControltById(String tableName, TblControl tblControl);
    void deleteTblControlById(TblControl tblControl);

    RunReportResponse queryRunReport(String absolutePath);

    Map<String, Object> callProcedure(TblControl tblControl, RunReportResponse runReportResponse);

    public WSResponse callIntegration(String tableName);

}
