package com.petresource.Furever.Services;


import com.petresource.Furever.Models.VeterinaryHospital;
import com.petresource.Furever.Repository.VetHospitalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VetHospitalService {

    private VetHospitalRepo repo;

    @Autowired
    public VetHospitalService(VetHospitalRepo repo){
        this.repo = repo;
    }

    public VeterinaryHospital createHospital(VeterinaryHospital hospital){
        return repo.save(hospital);
    }

    public VeterinaryHospital getHospital(int id){
        return repo.findById(id).get();
    }

    public VeterinaryHospital updateHospital(VeterinaryHospital update, int id){
        VeterinaryHospital original = repo.findById(id).get();
        original.setName(update.getName());
        original.setHospitalType(update.getHospitalType());
        original.setAddress(update.getAddress());
        original.setState(update.getState());
        original.setTown(update.getTown());
        original.setPhoneNumber(update.getPhoneNumber());
        original.setWebsite(update.getWebsite());
        return original;
    }

    public boolean deleteHospital(int id){
        repo.delete(repo.findById(id).get());
        return true;
    }
}
