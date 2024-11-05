package org.example;

public class Main {
    private static final String pwd = "mySecretPassword123";  // DON'T DO THIS

    public static void main(String[] args) {
        String username = "abc";
        Login login = new Login();
        login.setPassword(pwd);
        login.setUsername(username);
        login.login();
    }
}

class Login {
    private String password = "xyz";
    private String username = "abc";

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void login() {
        password = password + "_";
        System.out.println(username + " logged in");
    }
}