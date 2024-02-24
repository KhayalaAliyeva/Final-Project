package com.example.finalproject.service;

import com.example.finalproject.dto.EmployeeDTO;
import com.example.finalproject.dto.ResponseModel;
import com.example.finalproject.entity.User;

import java.util.List;

public interface EmployeeService {
    ResponseModel<List<User>> getAllEmployees();
}
