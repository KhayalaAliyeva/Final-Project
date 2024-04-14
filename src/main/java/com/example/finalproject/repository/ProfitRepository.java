package com.example.finalproject.repository;

import com.example.finalproject.entity.Cost;
import com.example.finalproject.entity.Profit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface ProfitRepository extends JpaRepository<Profit, Integer> {
    List<Profit> findAll();
}
