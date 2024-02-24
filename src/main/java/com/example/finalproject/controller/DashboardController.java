package com.example.finalproject.controller;

import com.example.finalproject.dto.ResponseModel;
import com.example.finalproject.entity.Cost;
import com.example.finalproject.service.Impl.DashboardServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dashboard")
@RequiredArgsConstructor
public class DashboardController {
    private final DashboardServiceImpl dashboardService;
    @GetMapping("/costs")
    ResponseEntity<ResponseModel<List<Cost>>> listAll(){
        return new ResponseEntity<>(dashboardService.getAllCosts(), HttpStatus.OK);
    }
}
