package com.hemant.springboot.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hemant.springboot.lms.model.LiberaryManagement;

@Repository
public interface LiberaryManagementRepository extends JpaRepository<LiberaryManagement,Long>{

}
