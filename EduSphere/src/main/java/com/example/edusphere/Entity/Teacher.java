package com.example.edusphere.Entity;


import org.springframework.stereotype.Component;

@Component
public class Teacher {
    private String name;
    private String password;

    public Teacher(){}
    public Teacher(String name, String password){
        this.name=name;
        this.password=password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
