package com.santiago.tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class DemoApplication {

  @GetMapping("/hello")
  public String hello() {
    return "Hola Santiago Rayo, Spring Boot está arriba 🚀";
  }

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }
}
