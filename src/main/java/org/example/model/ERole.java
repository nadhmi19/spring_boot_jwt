package org.example.model;

public enum ERole {

    ADMIN("admin"),
    MODERATOR("moderator"),
    USER("user");

    private String name;

     ERole(String name){
        this.name=name;
    }
}
