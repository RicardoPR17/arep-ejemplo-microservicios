package com.example.aws.lambda;

import main.java.com.example.aws.lambda.User;

public class MathServices {

    public static Integer square(Integer i) {
        return i * i;
    }

    public static User login(User u) {
        System.out.println("Username: " + u.getUsername());
        System.out.println("Password: " + u.getPassword());
        u.setPassword("");
        return u;
    }
}