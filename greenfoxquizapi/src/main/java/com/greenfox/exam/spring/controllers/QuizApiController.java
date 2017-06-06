package com.greenfox.exam.spring.controllers;

import com.greenfox.exam.spring.models.JSONAnswers;
import com.greenfox.exam.spring.models.JSONQuestions;
import com.greenfox.exam.spring.models.ResponseMessage;
import com.greenfox.exam.spring.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Bálint on 2017. 06. 06..
 */
@RestController
public class QuizApiController {

  @Autowired
  QuizService quizService;

  @GetMapping("/questions")
  public JSONQuestions provideQuestions() {
    return quizService.showQuestions();
  }

  @PostMapping("/answers")
  public ResponseMessage provideAnswers(@RequestBody JSONAnswers jsonAnswers) {
    return quizService.sendAnswers(jsonAnswers);
  }
}
