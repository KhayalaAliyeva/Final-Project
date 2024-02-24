package com.example.finalproject.service;

import com.example.finalproject.dto.ResponseModel;
import com.example.finalproject.entity.Cost;

import java.util.List;

public interface DashboardService {

    ResponseModel<List<Cost>> getAllCosts();
}
