package com.hotel.hotelservice.service;




import java.util.List;
import java.util.Optional;

import com.hotel.hotelservice.entities.Hotel;

public interface HotelService {

    // Method to create a new hotel
    Hotel create(Hotel hotel);

    // Method to get all hotels
    List<Hotel> getAll();

    // Method to get a hotel by its ID
    Optional<Hotel> get(String id);
}
