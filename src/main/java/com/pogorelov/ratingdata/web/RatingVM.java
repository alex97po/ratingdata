package com.pogorelov.ratingdata.web;

import com.pogorelov.ratingdata.domain.Rating;
import lombok.Data;

import java.util.List;

@Data
public class RatingVM {

    private List<Rating> ratings;
}
