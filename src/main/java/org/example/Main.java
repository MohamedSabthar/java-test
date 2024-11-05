package org.example;

public class Main {
    public static void main(String[] args) {
        String username = "abc";
        String password = "xyz";
        Login login = new Login();
    }
}

class Login {
    private final String username = "abc";
    private final String password = "xyz";

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }
}