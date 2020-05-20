package com.pogorelov.ratingdata.web;

import com.pogorelov.ratingdata.domain.Rating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingDataResource {

    @GetMapping("/{movieId}")
    public Rating getRatingForMovie(@PathVariable String movieId) {
        return new Rating(movieId, 4);
    }
}
