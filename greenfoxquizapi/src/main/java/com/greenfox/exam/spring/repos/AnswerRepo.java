package com.greenfox.exam.spring.repos;

import com.greenfox.exam.spring.models.Answer;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Bálint on 2017. 06. 06..
 */
public interface AnswerRepo extends CrudRepository<Answer, Long> {

}
