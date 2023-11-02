package com.example.dynamodbtest.models.dto;

import lombok.Data;

@Data
public class MovieDetailDTO {
    private String id;
    private String year;
    private String title;
    private String genre;
    private String country;
    private Integer duration;
    private String language;
}