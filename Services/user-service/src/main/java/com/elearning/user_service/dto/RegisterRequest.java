package com.elearning.user_service.dto;

import lombok.*;

@Data
public class RegisterRequest {
    private String name;
    private String email;
    private String password;
}
