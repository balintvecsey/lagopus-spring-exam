package com.greenfox.exam.spring.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Bálint on 2017. 06. 06..
 */
@Getter
@Setter
public class Answer {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private Object answer;

}
