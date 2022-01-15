package com.vaccine.login.service;

import com.vaccine.login.entity.AppUser;
import com.vaccine.login.repository.UserRepositry;
import com.vaccine.login.request.RequestUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepositry userRepositry;
    public AppUser addUser(AppUser user) {
        List<AppUser> users = userRepositry.findAll();
        System.out.println("New user: " + user.toString());
        for (AppUser user1 : users) {
            System.out.println("Registered user: " + user1.toString());
            if (user1.equals(user)) {
                System.out.println("User Already exists!");

            }
        }
      return   userRepositry.save(user);

    }


    public boolean loginUser(RequestUser requestUser) {
        try {
            AppUser appUser = userRepositry.findAppUserByEmailId(requestUser.getName());
            if (((appUser.getPassword()).equals(requestUser.getPassword())) && (appUser.getEmailId().equals(requestUser.getName()))) {
                return true;
            }else{
                return  false;
            }
        }catch (Exception e){
            return false;
        }

    }
    public List<AppUser> getUser() {
        return  userRepositry.findAll();
    }


}
