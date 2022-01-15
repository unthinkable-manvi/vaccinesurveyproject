package com.vaccine.login.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VaccineDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String adharCardNum;
    private String vaccinated;
    private String noOfDose;
    private Long userUniqueId;
    private String nameOfVaccine;
    private Date dateOfFirstDose;
    private Date dateOfSecondDose;
    @OneToMany
    private List<DetailsOfUser> detailsOfUsers=new ArrayList<>();
    public VaccineDetails(Long id) {
        this.id=id;
    }
}
