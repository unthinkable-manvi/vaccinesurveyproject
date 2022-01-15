package com.vaccine.login.service;

import com.vaccine.login.entity.DetailsOfUser;
import com.vaccine.login.entity.VaccineDetails;
import com.vaccine.login.repository.DetailsRepo;
import com.vaccine.login.repository.VaccineDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VaccineDetailsService {
    @Autowired
    private VaccineDetailsRepo vaccineDetailsRepo;
    @Autowired
    private DetailsRepo detailsRepo;


    public VaccineDetails addVaccineDetails(VaccineDetails vaccineDetails) {
        VaccineDetails vaccineDetails1=vaccineDetailsRepo.save(vaccineDetails);
        System.out.println(vaccineDetails1);
     DetailsOfUser detailsOfUser=detailsRepo.getById(vaccineDetails1.getUserUniqueId());

     detailsOfUser.setVaccineDetails(vaccineDetails1);
     detailsRepo.save(detailsOfUser);
        System.out.println(detailsOfUser);
        return vaccineDetails1;
    }


}
