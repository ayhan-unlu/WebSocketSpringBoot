package com.ayhanunlu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
// Security Active
@SpringBootApplication
*/

//Security Inactive
@SpringBootApplication(exclude = {
        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class,
        org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration.class})
public class WebSocketSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebSocketSpringBootApplication.class, args);
    }

}
