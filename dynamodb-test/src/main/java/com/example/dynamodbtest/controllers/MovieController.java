package com.example.dynamodbtest.controllers;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.example.dynamodbtest.models.MovieDetail;
import com.example.dynamodbtest.models.MovieDetailId;
import com.example.dynamodbtest.models.dto.MovieDetailDTO;
import com.example.dynamodbtest.repositories.MovieDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieDetailRepository movieDetailRepository;

    @Autowired
    DynamoDBMapper dynamoDBMapper;

    @PostMapping
    public ResponseEntity addMovieDetails(@RequestBody MovieDetailDTO movieDetailDto) {
        MovieDetail movieDetail = MovieDetail.parseMovieDetail(movieDetailDto);
        MovieDetail updatedMovieDetail = movieDetailRepository.save(movieDetail);
        return ResponseEntity.created(URI.create("/" + updatedMovieDetail.getId())).build();
    }

    @GetMapping
    public List<MovieDetail> getAllMovieDetails() {
        return (List<MovieDetail>) movieDetailRepository.findAll();
    }

    @GetMapping("/find/{id}")
    public MovieDetail getOneMovie(@PathVariable("id") String id, @RequestHeader("year") String yearStr) {
        Optional<MovieDetail> movieDetail = movieDetailRepository.findById(new MovieDetailId(id, yearStr));
        return movieDetail.orElse(null);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteOneMovie(@PathVariable("id") String id, @RequestHeader("year") String yearStr) {
        movieDetailRepository.deleteById(new MovieDetailId(id, yearStr));
        return ResponseEntity.accepted().build();
    }

    @PostMapping("/ddb-mapper")
    public ResponseEntity addMovieDetails2(@RequestBody MovieDetailDTO movieDetailDto) {
        MovieDetail movieDetail = MovieDetail.parseMovieDetail(movieDetailDto);
        dynamoDBMapper.save(movieDetail);
        return ResponseEntity.accepted().build();
    }
}