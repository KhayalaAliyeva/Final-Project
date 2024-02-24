package com.example.finalproject.repository;

import com.example.finalproject.entity.Cost;
import com.example.finalproject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DashboardRepository extends JpaRepository<Cost, Integer> {
    List<Cost> findAll();
}
