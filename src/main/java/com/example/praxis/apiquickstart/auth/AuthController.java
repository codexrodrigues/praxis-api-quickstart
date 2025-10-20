package com.example.praxis.apiquickstart.auth;

import com.example.praxis.apiquickstart.auth.dto.LoginRequest;
import com.example.praxis.apiquickstart.security.JwtTokenService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseCookie;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.time.Duration;
import java.util.Objects;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final JwtTokenService jwtTokenService;
    private final String adminUser;
    private final String adminPass;
    private final String sessionCookieName;
    private final boolean sessionSecure;
    private final String sameSite;
    private final JwtTokenService tokenService;

    public AuthController(JwtTokenService jwtTokenService,
                          @Value("${spring.security.user.name:admin}") String adminUser,
                          @Value("${spring.security.user.password:changeMe!}") String adminPass,
                          @Value("${app.session.cookie-name}") String sessionCookieName,
                          @Value("${app.session.secure}") boolean sessionSecure,
                          @Value("${app.session.samesite}") String sameSite) {
        this.jwtTokenService = jwtTokenService;
        this.adminUser = adminUser;
        this.adminPass = adminPass;
        this.sessionCookieName = sessionCookieName;
        this.sessionSecure = sessionSecure;
        this.sameSite = sameSite;
        this.tokenService = jwtTokenService;
    }

    @PostMapping("/login")
    public ResponseEntity<Void> login(@RequestBody LoginRequest body) {
        if (!StringUtils.hasText(body.username()) || !StringUtils.hasText(body.password())) {
            return ResponseEntity.status(401).build();
        }
        if (!Objects.equals(adminUser, body.username()) || !Objects.equals(adminPass, body.password())) {
            return ResponseEntity.status(401).build();
        }
        String token = jwtTokenService.generate(body.username(), "ADMIN");
        ResponseCookie cookie = ResponseCookie.from(sessionCookieName, token)
                .httpOnly(true)
                .secure(sessionSecure)
                .path("/")
                .sameSite(sameSite)
                .maxAge(Duration.ofSeconds(tokenService.getExpirationSeconds()))
                .build();
        return ResponseEntity.noContent().header(HttpHeaders.SET_COOKIE, cookie.toString()).build();
    }

    @PostMapping("/logout")
    public ResponseEntity<Void> logout() {
        ResponseCookie cookie = ResponseCookie.from(sessionCookieName, "")
                .httpOnly(true)
                .secure(sessionSecure)
                .path("/")
                .sameSite(sameSite)
                .maxAge(Duration.ZERO)
                .build();
        return ResponseEntity.noContent().header(HttpHeaders.SET_COOKIE, cookie.toString()).build();
    }
}
