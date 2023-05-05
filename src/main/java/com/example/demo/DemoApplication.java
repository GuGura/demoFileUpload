package com.example.demo;

import controller.FIleUploadController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.io.File;

@SpringBootApplication
@ComponentScan({"com.example.demo","controller"})
public class DemoApplication {

    public static void main(String[] args) {
        new File(FIleUploadController.uploadDirectory).mkdir();
        SpringApplication.run(DemoApplication.class, args);
    }

}
