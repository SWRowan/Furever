package com.petresource.Furever.Controllers;


import com.petresource.Furever.Models.VeterinaryHospital;
import com.petresource.Furever.Services.VetHospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/furever")
public class VetHospitalController {

    private VetHospitalService service;

    @Autowired
    public VetHospitalController(VetHospitalService service) {
        this.service = service;
    }

    @PostMapping("/hospital")
    public ResponseEntity<VeterinaryHospital> createHospital(@RequestBody VeterinaryHospital hospital){
        return new ResponseEntity<>(service.createHospital(hospital), HttpStatus.CREATED);
    }

    @PutMapping("/hospital/{id}")
    public ResponseEntity<VeterinaryHospital> updateHospital(@PathVariable int id, @RequestBody VeterinaryHospital hospital){
        return new ResponseEntity<>(service.updateHospital(hospital, id), HttpStatus.OK);
    }

    @DeleteMapping("/hospital/{id}")
    public ResponseEntity<String> deleteHospital(@PathVariable int id){
        service.deleteHospital(id);
        return new ResponseEntity<>("Hospital Deleted", HttpStatus.OK);
    }
}
