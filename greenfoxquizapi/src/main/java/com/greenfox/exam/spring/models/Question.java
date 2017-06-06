package com.greenfox.exam.spring.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
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
@AllArgsConstructor
public class Question {

  @Id
  private long id;
  private String question;

}
