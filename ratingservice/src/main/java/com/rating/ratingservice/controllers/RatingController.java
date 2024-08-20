package com.rating.ratingservice.controllers;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.rating.ratingservice.entities.Rating;
import com.rating.ratingservice.service.RatingService;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    // Create a new rating
    @PostMapping
    public ResponseEntity<Rating> createRating(@RequestBody Rating rating) {
        Rating createdRating = ratingService.create(rating);
        return new ResponseEntity<>(createdRating, HttpStatus.CREATED);
    }

    // Get all ratings
    @GetMapping
    public ResponseEntity<List<Rating>> getAllRatings() {
        List<Rating> ratings = ratingService.getRatings();
        return new ResponseEntity<>(ratings, HttpStatus.OK);
    }

    // Get ratings by user ID
    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Rating>> getRatingsByUserId(@PathVariable String userId) {
        List<Rating> ratings = ratingService.geRatingByUserId(userId);
        return new ResponseEntity<>(ratings, HttpStatus.OK);
    }

    // Get ratings by hotel ID
    @GetMapping("/hotel/{hotelId}")
    public ResponseEntity<List<Rating>> getRatingsByHotelId(@PathVariable String hotelId) {
        List<Rating> ratings = ratingService.getRatingByHotelId(hotelId);
        return new ResponseEntity<>(ratings, HttpStatus.OK);
    }
}
