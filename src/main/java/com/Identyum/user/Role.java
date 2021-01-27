package com.Identyum.user;


import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    USER, PRE_VERIFICATION_USER;

    @Override
    public String getAuthority() {
        return "ROLE_" + this.name();
    }
}