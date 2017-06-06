package com.greenfox.exam.spring.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

/**
 * Created by Bálint on 2017. 06. 06..
 */
@Component
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Solution {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String question;
  private String answer;

  public Solution(String question, String answer) {
    this.question = question;
    this.answer = answer;
  }
}
