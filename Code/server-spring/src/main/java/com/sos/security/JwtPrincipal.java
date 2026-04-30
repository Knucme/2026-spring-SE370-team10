package com.sos.security;

// Holds the logged-in user's info after token validation
public class JwtPrincipal {
    private final int id;
    private final String username;
    private final String role;
    private final String name;
    private final long loginAt;

    public JwtPrincipal(int id, String username, String role, String name, long loginAt) {
        this.id = id;
        this.username = username;
        this.role = role;
        this.name = name;
        this.loginAt = loginAt;
    }

    public int getId() { return id; }
    public String getUsername() { return username; }
    public String getRole() { return role; }
    public String getName() { return name; }
    public long getLoginAt() { return loginAt; }
}
