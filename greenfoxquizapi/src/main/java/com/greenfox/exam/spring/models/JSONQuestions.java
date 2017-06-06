package com.greenfox.exam.spring.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by Bálint on 2017. 06. 06..
 */
@Getter
@Setter
@NoArgsConstructor
public class JSONQuestions {

  long id = 1L;
  Iterable<Question> questions;

  public JSONQuestions(Iterable<Question> questions) {
    this.questions = questions;
  }
}
