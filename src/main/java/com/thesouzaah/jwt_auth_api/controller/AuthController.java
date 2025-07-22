package com.thesouzaah.jwt_auth_api.controller;

import com.thesouzaah.jwt_auth_api.dto.AuthRequest;
import com.thesouzaah.jwt_auth_api.dto.TokenDTO;
import com.thesouzaah.jwt_auth_api.service.AuthService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("api/auth")
public class AuthController {

    private final AuthService authService;

    @PostMapping("/login")
    public TokenDTO login(@RequestBody AuthRequest request) {
        return authService.login(request);
    }

    @PostMapping("token/validate")
    public TokenDTO login(@RequestHeader String accessToken) {
        return authService.validateToken(accessToken);
    }
}
