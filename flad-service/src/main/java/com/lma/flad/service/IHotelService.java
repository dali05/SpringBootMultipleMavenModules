package com.lma.flad.service;

import com.lma.flad.entity.Hotel;

import java.util.List;

public interface IHotelService {
    void addHotel(Hotel hotel);
    List<Hotel> getAllHotels();
}
