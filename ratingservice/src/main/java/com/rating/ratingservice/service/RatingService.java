package com.rating.ratingservice.service;

import java.util.List;

import com.rating.ratingservice.entities.Rating;

public interface RatingService {

//create    
Rating create(Rating rating);


//all read rating
List<Rating> getRatings();

//get all by UserId
List<Rating> geRatingByUserId(String userId);

//get all by hotelId
List<Rating> getRatingByHotelId(String hotelId);


    
}
