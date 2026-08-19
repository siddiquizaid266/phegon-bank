package com.phegon.phegonbank.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.phegon.phegonbank.dtos.LoginRequest;
import com.phegon.phegonbank.dtos.LoginResponse;
import com.phegon.phegonbank.dtos.RegistrationRequest;
import com.phegon.phegonbank.dtos.ResetPasswordRequest;
import com.phegon.phegonbank.res.Response;
import com.phegon.phegonbank.service.AuthService;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<Response<String>> register(@RequestBody @Valid RegistrationRequest registrationRequest ){
        return ResponseEntity.ok(authService.register(registrationRequest));
    }

    @PostMapping("/login")
    public ResponseEntity<Response<LoginResponse>> login(@RequestBody @Valid LoginRequest loginRequest ){
        return ResponseEntity.ok(authService.login(loginRequest));
    }

    @PostMapping("/forgot-password")
    public ResponseEntity<Response<?>> forgotPassword(@RequestBody ResetPasswordRequest resetPasswordRequest ){
        return ResponseEntity.ok(authService.forgetPassword(resetPasswordRequest.getEmail()));
    }

    @PostMapping("/reset-password")
    public ResponseEntity<Response<?>> resetPassword(@RequestBody ResetPasswordRequest resetPasswordRequest ){
        return ResponseEntity.ok(authService.updatePasswordViaResetCode(resetPasswordRequest));
    }

}
