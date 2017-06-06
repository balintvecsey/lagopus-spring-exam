package com.greenfox.exam.spring.service;

import com.greenfox.exam.spring.models.ListOfQuestions;
import com.greenfox.exam.spring.models.Question;
import com.greenfox.exam.spring.models.Solution;
import com.greenfox.exam.spring.repos.QuestionRepo;
import com.greenfox.exam.spring.repos.SolutionRepo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Bálint on 2017. 06. 06..
 */
@Component
public class QuizService {

  @Autowired
  private SolutionRepo solutionRepo;

  @Autowired
  private QuestionRepo questionRepo;

  @Autowired
  private Question question;

  @Autowired
  private Solution solution;

  public long randomNumber(long range) {
    return (long) (Math.random() * range) + 1L;
  }


  public ListOfQuestions showQuestions() {
    ListOfQuestions listOfQuestions = new ListOfQuestions();


    for (long i = 1L; i <= 5L; i++) {
      solution = solutionRepo.findOne(randomNumber(solutionRepo.count()));
      questionRepo.save(new Question(i,solution.getQuestion()));
    }
    return new ListOfQuestions(questionRepo.findAll());
  }
}
