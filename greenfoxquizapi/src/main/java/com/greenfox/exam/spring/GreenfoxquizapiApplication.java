package com.greenfox.exam.spring;

import com.greenfox.exam.spring.repos.SolutionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GreenfoxquizapiApplication {

  @Autowired
  private SolutionRepo solutionRepo;

  public static void main(String[] args) {
    SpringApplication.run(GreenfoxquizapiApplication.class, args);
  }
}
