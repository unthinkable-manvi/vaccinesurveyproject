package com.vaccine.login.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DetailsOfUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String name;
    @NotNull
    private String email;
    private String city;
    private String state;
    private Date date;
    private int mobileNo;
    private String gender;
    @ManyToOne
    @JoinColumn(name = "vaccId")
    private VaccineDetails vaccineDetails;

}
