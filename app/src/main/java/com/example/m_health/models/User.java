// app/src/main/java/com/example/m_health/models/User.java
package com.example.m_health.models;

public class User {
    private String email;
    private String fullName;
    private String role;

    public User() {
        // Required empty constructor for Firestore
    }

    public User(String email, String fullName, String role) {
        this.email = email;
        this.fullName = fullName;
        this.role = role;
    }

    // Getters and setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}