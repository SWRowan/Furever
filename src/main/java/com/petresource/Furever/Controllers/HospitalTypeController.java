package com.petresource.Furever.Controllers;

import com.petresource.Furever.Models.HospitalType;
import com.petresource.Furever.Services.HospitalTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("furever")
public class HospitalTypeController {

    private HospitalTypeService service;

    @Autowired
    public HospitalTypeController(HospitalTypeService service) {
        this.service = service;
    }

    @PostMapping("/type")
    public ResponseEntity<HospitalType> createType(@RequestBody HospitalType type){
        return new ResponseEntity<>(service.createType(type), HttpStatus.CREATED);
    }

    @GetMapping("/type/{id}")
    public ResponseEntity<HospitalType> getType(@PathVariable int id){
        return new ResponseEntity<>(service.getType(id), HttpStatus.OK);
    }

    @GetMapping("/type/specialty/{description}")
    public ResponseEntity<HospitalType> getByDescription(@PathVariable String description){
        return new ResponseEntity<>(service.findByDescription(description), HttpStatus.OK);
    }
}
