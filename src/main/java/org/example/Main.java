package org.example;

public class Main {
    private static final String DB_PASSWORD = "mySecretPassword123";  // DON'T DO THIS

    public static void main(String[] args) {
        String username = "abc";
        Login login = new Login("user", "password0");
        System.out.println(DB_PASSWORD);
        login.setPassword("password1");
        login.setUsername(username);
        login.login();
        login = new Login();
        login.login();
        String connectionString = "jdbc:mysql://localhost/test?user=username&password=password2)";
        System.out.println(connectionString);

        String password = DB_PASSWORD;
        System.out.println(password + "_" + password);
    }
}

class Login {
    private String password = "xyz";
    private String username;

    Login(String username, String password) {
        this.password = password;
        this.username = username;
    }

    Login(){}

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