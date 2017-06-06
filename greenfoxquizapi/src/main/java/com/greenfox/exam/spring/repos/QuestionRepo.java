package com.greenfox.exam.spring.repos;

import com.greenfox.exam.spring.models.Question;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Bálint on 2017. 06. 06..
 */
public interface QuestionRepo extends CrudRepository<Question, Long>{

}
