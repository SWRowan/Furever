package com.petresource.Furever.Models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class VeterinaryHospital {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private HospitalType hospitalType;
    private String name;
    private String address;
    private String town;
    private String state;
    private String phoneNumber;
    private String website;

}
