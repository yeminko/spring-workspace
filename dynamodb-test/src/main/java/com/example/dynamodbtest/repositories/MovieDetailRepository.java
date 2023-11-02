package com.example.dynamodbtest.repositories;

import com.example.dynamodbtest.models.MovieDetail;
import com.example.dynamodbtest.models.MovieDetailId;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface MovieDetailRepository extends CrudRepository<MovieDetail, MovieDetailId> {
}