package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InsuranceRepository extends JpaRepository<Insurance,Integer>{
	List<Insurance>findByPassword(String password);

	

}
