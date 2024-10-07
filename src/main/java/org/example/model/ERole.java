package org.example.model;

public enum ERole {

    ADMIN("admin"),
    MODERATOR("moderator"),
    USER("user");

    private final String name;

     ERole(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return this.name;
    }

    public static ERole fromString(String value) {
        for (ERole status : ERole.values()) {
            if (status.name.equalsIgnoreCase(value)) {
                return status;
            }
        }
        throw new IllegalArgumentException("No enum constant with value " + value);
    }

}
