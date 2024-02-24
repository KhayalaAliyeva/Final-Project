package com.example.finalproject.controller;


import com.example.finalproject.dto.EmployeeDTO;
import com.example.finalproject.dto.ResponseModel;
import com.example.finalproject.entity.User;
import com.example.finalproject.service.Impl.EmployeeServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeServiceImpl employeeService;
    @GetMapping("/all")
    ResponseEntity<ResponseModel<List<User>>> listAllEmployees(){
        return new ResponseEntity<>(employeeService.getAllEmployees(), HttpStatus.OK);
    }
}
