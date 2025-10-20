package com.example.praxis.apiquickstart.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.csrf.CsrfFilter;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import com.example.praxis.apiquickstart.security.CookieJwtAuthenticationFilter;

@Configuration
public class SecurityConfig {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http, CookieJwtAuthenticationFilter cookieFilter) throws Exception {
        http
            .csrf(csrf -> csrf
                .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
                .ignoringRequestMatchers("/auth/login", "/auth/logout")
            )
            .cors(cors -> {})
            .sessionManagement(sm -> sm.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
            .headers(headers -> headers
                .xssProtection(x -> {})
                .frameOptions(frame -> frame.deny())
                .referrerPolicy(ref -> ref.policy(org.springframework.security.web.header.writers.ReferrerPolicyHeaderWriter.ReferrerPolicy.NO_REFERRER))
                .contentTypeOptions(c -> {})
            )
            .authorizeHttpRequests(auth -> auth
                // Auth endpoints: permitir login/logout
                .requestMatchers("/auth/login", "/auth/logout").permitAll()
                // Swagger UI e OpenAPI públicas
                .requestMatchers(
                        "/swagger-ui.html",
                        "/swagger-ui/index.html",
                        "/swagger-ui/**",
                        "/v3/api-docs",
                        "/v3/api-docs/**",
                        "/v3/api-docs.yaml"
                ).permitAll()
                // Health público para health checks (Render)
                .requestMatchers(
                        "/actuator/health",
                        "/actuator/health/**"
                ).permitAll()
                // Home pública e assets estáticos
                .requestMatchers(
                        "/",
                        "/index.html",
                        "/favicon.ico",
                        "/assets/**"
                ).permitAll()
                // Demais endpoints protegidos
                .requestMatchers(HttpMethod.OPTIONS, "/**").permitAll()
                .anyRequest().authenticated()
            )
            .addFilterBefore(cookieFilter, UsernamePasswordAuthenticationFilter.class)
            .addFilterAfter(new com.example.praxis.apiquickstart.security.CsrfCookieFilter(), CsrfFilter.class);
        return http.build();
    }

    @Bean
    CorsConfigurationSource corsConfigurationSource(
            @Value("${app.cors.allowed-origins}") String allowedOrigins
    ) {
        CorsConfiguration config = new CorsConfiguration();
        if ("*".equals(allowedOrigins.trim())) {
            config.addAllowedOriginPattern("*");
            config.setAllowCredentials(false);
        } else {
            for (String origin : allowedOrigins.split(",")) {
                String o = origin.trim();
                if (!o.isEmpty()) config.addAllowedOrigin(o);
            }
            config.setAllowCredentials(true);
        }
        config.addAllowedHeader("*");
        config.addAllowedMethod("GET");
        config.addAllowedMethod("POST");
        config.addAllowedMethod("PUT");
        config.addAllowedMethod("DELETE");
        config.addAllowedMethod("OPTIONS");
        config.setMaxAge(3600L);

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", config);
        return source;
    }
}
