package com.petresource.Furever.Controllers;


import com.petresource.Furever.Services.VetHospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VetHospitalController {

    private VetHospitalService service;

    @Autowired
    public VetHospitalController(VetHospitalService service) {
        this.service = service;
    }

    
}
