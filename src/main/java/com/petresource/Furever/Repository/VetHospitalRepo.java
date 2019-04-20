package com.petresource.Furever.Repository;


import com.petresource.Furever.Models.VeterinaryHospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VetHospitalRepo extends JpaRepository<VeterinaryHospital, Integer> {


}
