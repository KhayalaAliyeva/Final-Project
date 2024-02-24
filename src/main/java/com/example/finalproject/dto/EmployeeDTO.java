package com.example.finalproject.dto;

import lombok.Data;

import java.time.LocalDateTime;


public class EmployeeDTO {
    private String fullName;
    private String  email;
    private  String roles;
    private LocalDateTime date;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public EmployeeDTO(String fullName, String email, String roles, LocalDateTime date) {
        this.fullName = fullName;
        this.email = email;
        this.roles = roles;
        this.date = date;
    }
    public EmployeeDTO(){

    }
}
