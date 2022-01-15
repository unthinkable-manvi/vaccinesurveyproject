package com.vaccine.login.repository;

import com.vaccine.login.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositry extends JpaRepository<AppUser,Long> {
     public AppUser findAppUserByEmailId(String emailId);

}
