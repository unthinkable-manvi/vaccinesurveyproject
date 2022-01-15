package com.vaccine.login.service;

import com.vaccine.login.entity.DetailsOfUser;
import com.vaccine.login.entity.VaccineDetails;
import com.vaccine.login.repository.DetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetailsService {

    @Autowired
    private DetailsRepo detailsRepo;
    public DetailsOfUser addUserDetails(DetailsOfUser detailsOfUser) {
        return  detailsRepo.save(detailsOfUser);
    }


    public int getpersoncountbystate(String city) {
        List<DetailsOfUser> users=detailsRepo.findDetailsOfUserByCity(city);
        int count=0;
        for(DetailsOfUser dl:users){
            count++;
        }
        return  count;
    }
}
