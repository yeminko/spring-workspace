package com.example.services;

import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import com.example.models.Comment;

@Service
public class CommentService {

    private Logger logger = Logger.getLogger(CommentService.class.getName());

    public String publishComment(Comment comment) {
        logger.info("Publishing comment: " + comment.getText());
        return "SUCCESS";
    }

}
