package com.example.finalproject.repository;

import com.example.finalproject.dto.EmployeeDTO;
import com.example.finalproject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EmployeeRepository extends JpaRepository<User, Integer> {
    List<User> findAll();
}
