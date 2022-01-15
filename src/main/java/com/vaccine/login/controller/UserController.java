package com.vaccine.login.controller;
import com.vaccine.login.entity.AppUser;
import com.vaccine.login.entity.DetailsOfUser;
import com.vaccine.login.entity.VaccineDetails;
import com.vaccine.login.request.RequestUser;
import com.vaccine.login.service.DetailsService;
import com.vaccine.login.service.UserService;
import com.vaccine.login.service.VaccineDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private DetailsService detailsService;
    @Autowired
    private VaccineDetailsService vaccineDetailsService;
    @CrossOrigin
    @PostMapping("/addUser")
    public AppUser addUser(@RequestBody AppUser user){
            return userService.addUser(user);
    }

    @CrossOrigin
    @GetMapping("/getUser")
    public List<AppUser> getUser(){
        return  userService.getUser();
    }

    @CrossOrigin
    @PostMapping("/login")
    public  boolean loginUser(@RequestBody RequestUser requestUser){

        return userService.loginUser(requestUser);
    }

    @CrossOrigin
    @PostMapping("/personaldetails")
    public DetailsOfUser addUserDetails(@RequestBody  DetailsOfUser detailsOfUser){
        return detailsService.addUserDetails(detailsOfUser);
    }

    @CrossOrigin
    @PostMapping("/vaccinedetais")
    public VaccineDetails addVaccineDetails(@RequestBody VaccineDetails vaccineDetails){
        return vaccineDetailsService.addVaccineDetails(vaccineDetails);
    }

    @CrossOrigin
    @GetMapping("/getpersoncount/{city}")
    public int  getpersoncountbystate(@PathVariable String city){

        return detailsService.getpersoncountbystate(city);
    }

}
