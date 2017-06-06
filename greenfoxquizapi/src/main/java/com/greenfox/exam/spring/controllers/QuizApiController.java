package com.greenfox.exam.spring.controllers;

import com.greenfox.exam.spring.models.ListOfQuestions;
import com.greenfox.exam.spring.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Bálint on 2017. 06. 06..
 */
@RestController
public class QuizApiController {

  @Autowired
  QuizService quizService;

  @GetMapping("/questions")
  public ListOfQuestions provideQuestions() {
    return quizService.showQuestions();
  }

}
