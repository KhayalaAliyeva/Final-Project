package com.example.finalproject.controller;

import com.example.finalproject.dto.ResponseModel;
import com.example.finalproject.entity.Cost;
import com.example.finalproject.entity.Profit;
import com.example.finalproject.service.Impl.ProfitServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/profit")
@RequiredArgsConstructor
public class ProfitController {
    private final ProfitServiceImpl profitService;
    @GetMapping("/all")
    ResponseEntity<ResponseModel<List<Profit>>> listAll(){
        return new ResponseEntity<>(profitService.getAllProfits(), HttpStatus.OK);
    }
}
