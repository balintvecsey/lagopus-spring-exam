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
public class JSONAnswers {

  private long id = 1L;
  private Iterable<Answer> answers;

  public JSONAnswers(Iterable<Answer> answers) {
    this.answers = answers;
  }
}
