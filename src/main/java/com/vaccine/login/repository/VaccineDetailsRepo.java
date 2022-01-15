package com.vaccine.login.repository;

import com.vaccine.login.entity.VaccineDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VaccineDetailsRepo extends JpaRepository<VaccineDetails,Long> {
}
