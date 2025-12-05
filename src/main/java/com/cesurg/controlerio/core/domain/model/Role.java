package com.cesurg.controlerio.core.domain.model;

public enum Role {
    ADMIN("admin"),
    BOMBEIRO("bombeiro"),
    RADIO("radio");

    private String role;

    Role(String role) {
        this.role = role;
    }

    public String getRole(){
        return role;
    }
}
