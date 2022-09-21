package mx.com.metalsa.spx.soap.web.services;

import mx.com.metalsa.spx.soap.service.reports.wsdl.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;


public class ReportClient extends WebServiceGatewaySupport {

    private static final Logger log = LoggerFactory.getLogger(ReportClient.class);

    private String userId;
    private String password;
    private static final String FORMAT = "xml";

    /**
     * Metodo que ejecuta el servicio SOAP runReport para actualizar los datos del reporte
     * @param absolutePath ruta absoluta del reporte
     * @param minutes tiempo que se tiene para actualizar el reporte
     * @return Objeto RunReportResponse con la repuesta del servicio
     */
    public RunReportResponse runReport(String absolutePath, int minutes){
        // set credentials
        RunReport runReport = new RunReport();
        runReport.setUserID(userId);
        log.info("userId = " + userId);

        runReport.setPassword(password);
        log.info("password = " + password);

        ReportRequest request = new ReportRequest();
        request.setReportAbsolutePath(absolutePath);
        request.setAttributeFormat(FORMAT);
        request.setSizeOfDataChunkDownload(-1);

        ParamNameValues params = new ParamNameValues();
        ArrayOfParamNameValue arrParams = new ArrayOfParamNameValue();
        final ParamNameValue pv1 = new ParamNameValue();
        pv1.setName("P_MINUTES");
        final ArrayOfString arv1 = new ArrayOfString();
        arv1.getItem().add(String.valueOf(minutes));
        pv1.setValues(arv1);
        arrParams.getItem().add(pv1);

        params.setListOfParamNameValues(arrParams);
        request.setParameterNameValues(params);

        runReport.setReportRequest(request);

        log.info("Time for requesting: " + minutes);
        log.info("Requesting report for path: " + absolutePath);

        RunReportResponse response = (RunReportResponse)  getWebServiceTemplate()
                .marshalSendAndReceive("https://hcun-dev3.fa.us2.oraclecloud.com/xmlpserver/services/v2/ReportService", runReport);
        return response;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
