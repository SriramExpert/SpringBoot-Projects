package com.example.edusphere;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EduSphereApplication {

    public static void main(String[] args) {
       ApplicationContext context= SpringApplication.run(EduSphereApplication.class, args);
    }

}
