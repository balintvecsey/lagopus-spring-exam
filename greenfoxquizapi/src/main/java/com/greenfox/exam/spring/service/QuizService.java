package com.greenfox.exam.spring.service;

import com.greenfox.exam.spring.models.JSONAnswers;
import com.greenfox.exam.spring.models.JSONQuestions;
import com.greenfox.exam.spring.models.Question;
import com.greenfox.exam.spring.models.ResponseMessage;
import com.greenfox.exam.spring.models.Solution;
import com.greenfox.exam.spring.repos.AnswerRepo;
import com.greenfox.exam.spring.repos.QuestionRepo;
import com.greenfox.exam.spring.repos.SolutionRepo;
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
  private AnswerRepo answerRepo;

  @Autowired
  private Question question;

  @Autowired
  private Solution solution;

  public long randomNumber(long range) {
    return (long) (Math.random() * range) + 1L;
  }

  public JSONQuestions showQuestions() {
    for (long i = 1L; i <= 5L; i++) {
      solution = solutionRepo.findOne(randomNumber(solutionRepo.count()));
      questionRepo.save(new Question(i,solution.getQuestion()));
    }
    return new JSONQuestions(questionRepo.findAll());
  }

  public ResponseMessage sendAnswers(JSONAnswers jsonAnswers) {
    answerRepo.save(jsonAnswers.getAnswers());
    return new ResponseMessage();
  }
}
