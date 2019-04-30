package com.petresource.Furever.Models;

import lombok.Data;

import javax.persistence.*;

import static javax.persistence.CascadeType.ALL;

@Data
@Entity
public class VeterinaryHospital {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne(cascade = ALL, fetch = FetchType.EAGER)
    private HospitalType hospitalType;
    private String name;
    private String address;
    private String city;
    private String state;
    private String phoneNumber;
    private String website;

    public VeterinaryHospital() {
    }

    public VeterinaryHospital(HospitalType hospitalType, String name, String address, String city, String state, String phoneNumber, String website) {
        this.hospitalType = hospitalType;
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.phoneNumber = phoneNumber;
        this.website = website;
    }
}
