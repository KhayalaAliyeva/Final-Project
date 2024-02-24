package com.example.finalproject.service.Impl;

import com.example.finalproject.dto.ResponseModel;
import com.example.finalproject.entity.Cost;
import com.example.finalproject.repository.DashboardRepository;
import com.example.finalproject.service.DashboardService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DashboardServiceImpl implements DashboardService {
    private final DashboardRepository dashboardRepository;

    @Override
    public ResponseModel<List<Cost>> getAllCosts() {
        ResponseModel<List<Cost>> responseModel = new ResponseModel<>();

        responseModel.setData(dashboardRepository.findAll());
        responseModel.setMessage("All costs are retrieved successfully");
        return responseModel;
    }
}
