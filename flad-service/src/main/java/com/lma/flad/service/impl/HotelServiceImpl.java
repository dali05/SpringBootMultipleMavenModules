package com.lma.flad.service.impl;

import com.lma.flad.entity.Hotel;
import com.lma.flad.repository.HotelRepository;
import com.lma.flad.service.IHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class HotelServiceImpl implements IHotelService {


    @Autowired
    private HotelRepository hotelRepository;


    @Override
    public void addHotel(Hotel hotel) {
        this.hotelRepository.save(hotel);
    }


    public List<Hotel> getAllHotels() {
        return this.hotelRepository.findAll();
    }

}
