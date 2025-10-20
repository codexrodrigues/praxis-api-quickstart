package com.example.praxis.apiquickstart.security;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.List;

@Component
public class CookieJwtAuthenticationFilter extends OncePerRequestFilter {

    private final JwtTokenService jwtTokenService;
    private final String sessionCookieName;

    public CookieJwtAuthenticationFilter(JwtTokenService jwtTokenService,
                                         @Value("${app.session.cookie-name}") String sessionCookieName) {
        this.jwtTokenService = jwtTokenService;
        this.sessionCookieName = sessionCookieName;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

        if (SecurityContextHolder.getContext().getAuthentication() == null) {
            String token = extractSessionCookie(request);
            if (token != null && !token.isBlank()) {
                JwtTokenService.JwtValidationResult result = jwtTokenService.validate(token);
                if (result.valid()) {
                    var auth = new UsernamePasswordAuthenticationToken(
                            result.subject(), null, List.of(new SimpleGrantedAuthority("ROLE_" + result.role()))
                    );
                    auth.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                    SecurityContextHolder.getContext().setAuthentication(auth);
                }
            }
        }

        filterChain.doFilter(request, response);
    }

    private String extractSessionCookie(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        if (cookies == null) return null;
        for (Cookie c : cookies) {
            if (sessionCookieName.equals(c.getName())) {
                return c.getValue();
            }
        }
        return null;
    }
}
