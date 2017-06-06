package com.greenfox.exam.spring;

import com.greenfox.exam.spring.models.Solution;
import com.greenfox.exam.spring.repos.SolutionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GreenfoxquizapiApplication implements CommandLineRunner {

  @Autowired
  private SolutionRepo solutionRepo;

  public static void main(String[] args) {
    SpringApplication.run(GreenfoxquizapiApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    if (solutionRepo.findOne(1L) == null) {
      solutionRepo.save(new Solution("What is the color code of Green Fox?", "#3CB879"));
      solutionRepo.save(new Solution("When was Green Fox founded?(yyyy.mm.)", "2015.09."));
      solutionRepo.save(new Solution("When did your course start? (yyyy.mm.dd)", "2017.03.13"));
      solutionRepo.save(new Solution("What type of dog Barbi has?", "Whippet"));
      solutionRepo.save(new Solution("What is HerrNorbert's favourite color?", "Green"));
      solutionRepo.save(new Solution("How many classes are learning at Green Fox Academy at this moment?", "4"));
      solutionRepo.save(new Solution("How many mentors teach at Green Fox at this moment?", "16"));
      solutionRepo.save(new Solution("What was the name of the first Green Fox class?", "Vulpes"));
      solutionRepo.save(new Solution("How many likes do we have on facebook?", "~3300"));
      solutionRepo.save(new Solution("What is Tojas's horoscope?", "Libra"));
    }
  }
}
