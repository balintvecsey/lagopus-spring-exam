package com.greenfox.exam.spring.repos;

import com.greenfox.exam.spring.models.Solution;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Bálint on 2017. 06. 06..
 */
public interface SolutionRepo extends CrudRepository<Solution, Long> {

}
