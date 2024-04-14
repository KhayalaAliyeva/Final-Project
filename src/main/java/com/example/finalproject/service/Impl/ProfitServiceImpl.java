package com.example.finalproject.service.Impl;

import com.example.finalproject.dto.ResponseModel;
import com.example.finalproject.entity.Cost;
import com.example.finalproject.entity.Profit;
import com.example.finalproject.repository.ProfitRepository;
import com.example.finalproject.service.ProfitService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProfitServiceImpl implements ProfitService {
    private final ProfitRepository profitRepository;
    @Override
    public ResponseModel<List<Profit>> getAllProfits() {
        ResponseModel<List<Profit>> responseModel = new ResponseModel<>();
        responseModel.setData(profitRepository.findAll());
        responseModel.setMessage("All profits are retrieved successfully");
        return responseModel;
    }
}
