package com.vaccine.login.repository;


import com.vaccine.login.entity.DetailsOfUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DetailsRepo extends JpaRepository<DetailsOfUser,Long> {
        public List<DetailsOfUser> findDetailsOfUserByCity(String city);
}
