package com.example.finalproject.service.Impl;

import com.example.finalproject.dto.EmployeeDTO;
import com.example.finalproject.dto.ResponseModel;
import com.example.finalproject.entity.User;
import com.example.finalproject.repository.EmployeeRepository;
import com.example.finalproject.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;
    @Override
    public ResponseModel<List<User>> getAllEmployees() {
        ResponseModel<List<User>> responseModel = new ResponseModel<>();

        responseModel.setData(employeeRepository.findAll());
        responseModel.setMessage("All Employee");
        return responseModel;
    }
}
