package com.github.leovd100.alura.challenge.config;

import org.springframework.context.event.EventListener;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationSuccessEventListener {

    @EventListener
    public void handleAuthenticationSuccess(AuthenticationSuccessEvent event) {
        Authentication authentication = event.getAuthentication();
        StringBuilder roles = new StringBuilder();
        for (GrantedAuthority authority : authentication.getAuthorities()) {
            roles.append(authority.getAuthority()).append(" ");
        }
        System.out.println("Usuário " + authentication.getName() + " logado com as funções: " + roles.toString());
    }
}
