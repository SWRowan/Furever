package com.petresource.Furever.Services;


import com.petresource.Furever.Models.HospitalType;
import com.petresource.Furever.Models.VeterinaryHospital;
import com.petresource.Furever.Repository.HospitalTypeRepo;
import com.petresource.Furever.Repository.VetHospitalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VetHospitalService {

    private VetHospitalRepo repo;
    private HospitalTypeRepo typeRepo;

    @Autowired
    public VetHospitalService(VetHospitalRepo repo, HospitalTypeRepo typeRepo){
        this.repo = repo;
        this.typeRepo = typeRepo;
    }

    public VeterinaryHospital createHospital(VeterinaryHospital hospital){
        hospital.setHospitalType(getDBHospitalType(hospital.getHospitalType()));
        return repo.save(hospital);
    }

    public VeterinaryHospital getHospital(int id){
        return repo.findById(id).get();
    }

    public VeterinaryHospital updateHospital(VeterinaryHospital update, int id){
        VeterinaryHospital original = repo.findById(id).get();
        original.setName(update.getName());
        original.setHospitalType(getDBHospitalType(update.getHospitalType()));
        original.setAddress(update.getAddress());
        original.setState(update.getState());
        original.setCity(update.getCity());
        original.setPhoneNumber(update.getPhoneNumber());
        original.setWebsite(update.getWebsite());
        return repo.save(original);
    }

    public boolean deleteHospital(int id){
        repo.delete(repo.findById(id).get());
        return true;
    }

    private HospitalType getDBHospitalType(HospitalType type){
        if(type == null){
            type.setDescription("Other");
        }
        return typeRepo.findByDescription(type.getDescription());
    }
}
