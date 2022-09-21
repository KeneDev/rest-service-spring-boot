package mx.com.metalsa.spx.rest.api.controller;

import mx.com.metalsa.spx.rest.api.model.TblControl;
import mx.com.metalsa.spx.rest.api.model.TblControlId;
import mx.com.metalsa.spx.rest.api.model.WSResponse;
import mx.com.metalsa.spx.rest.api.service.InfoService;
import mx.com.metalsa.spx.rest.api.service.IntegrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class IntegrationController {

    @Autowired
    private InfoService info;

    @Autowired
    private IntegrationService integrationService;


    @RequestMapping("/test")
    public String test(){
        return info.getInfo();
    }

    @RequestMapping(value = "controls", method = RequestMethod.GET)
    public List<TblControl> list(){
        return integrationService.getTblControl();
    }

    // crud
    @RequestMapping(value = "controls", method = RequestMethod.POST)
    public TblControl create(@RequestBody TblControl tblControl){
        return integrationService.createTblControl(tblControl);
    }

    @RequestMapping( value = "controls/id", method = RequestMethod.GET)
    public TblControl get(@RequestBody TblControlId id){
        return integrationService.getTblControlById(id);
    }

    @RequestMapping(value = "controls/{id}", method = RequestMethod.PUT)
    public TblControl update(@RequestParam String tableName, @RequestBody TblControl tblControl){
        return integrationService.updateTblControltById(tableName, tblControl);
    }

    @RequestMapping(value = "controls/id", method = RequestMethod.DELETE)
    public void delete(@RequestBody TblControl tblControl){
        integrationService.deleteTblControlById(tblControl);
    }

    @RequestMapping(value = "process/{tableName}", method = RequestMethod.GET)
    @ResponseBody
    public WSResponse callIntegration(@PathVariable String tableName){
        return integrationService.callIntegration(tableName);
    }


}
