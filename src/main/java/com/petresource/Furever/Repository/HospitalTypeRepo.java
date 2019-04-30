package com.petresource.Furever.Repository;


import com.petresource.Furever.Models.HospitalType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface HospitalTypeRepo extends JpaRepository<HospitalType, Integer> {

    HospitalType findByDescription(String string);
}
