package com.masai.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.mocdel.Driver;

@Repository
public interface DriverDao extends JpaRepository<Driver, String>{

}
