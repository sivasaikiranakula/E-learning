package com.elearning.user_service.dto;

import lombok.*;

@Data
public class LoginRequest {
    private String email;
    private String password;
}
