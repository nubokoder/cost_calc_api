package com.example.keihiapi.repository;

import com.example.keihiapi.model.Category;
import com.example.keihiapi.model.Cost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CostRepository  extends JpaRepository<Cost, Long> {

}
