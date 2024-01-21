package com.example.finalproject.dto;

import lombok.Data;

@Data
public class ResponseModel<T> {
    T data;
    String message;
}
