package com.example.finalproject.service;

import com.example.finalproject.dto.ResponseModel;
import com.example.finalproject.entity.Profit;

import java.util.List;

public interface ProfitService {
    ResponseModel<List<Profit>> getAllProfits();
}
