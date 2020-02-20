package bo.edu.uagrm.soe.facturacionsoe.controllers;

import bo.edu.uagrm.soe.facturacionsoe.database.services.DataService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    private final DataService dataService;

    public DataController(DataService dataService) {
        this.dataService = dataService;
    }

    @GetMapping("/data")
    public ResponseEntity<Object> getAllData() {
        return new ResponseEntity<>(dataService.getAllData(), HttpStatus.OK);
    }

}
