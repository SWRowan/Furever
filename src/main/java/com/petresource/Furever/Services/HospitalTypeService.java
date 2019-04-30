package com.petresource.Furever.Services;

import com.petresource.Furever.Models.HospitalType;
import com.petresource.Furever.Repository.HospitalTypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HospitalTypeService {

    private HospitalTypeRepo repo;

    @Autowired
    public HospitalTypeService(HospitalTypeRepo repo) {
        this.repo = repo;
    }

    public HospitalType createType(HospitalType type){
        return repo.save(type);
    }

    public HospitalType getType(int id){
        return repo.findById(id).get();
    }

    public HospitalType updateType(HospitalType type, int id){
        HospitalType original = repo.findById(id).get();
        original.setDescription(type.getDescription());
        return repo.save(original);
    }

    public boolean deleteType(int id){
        repo.delete(repo.findById(id).get());

        return true;
    }

    public HospitalType findByDescription(String desctiption){
        return repo.findByDescription(desctiption);
    }
}
