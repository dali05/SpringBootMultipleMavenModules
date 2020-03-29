package com.lma.flad.controller;

import com.lma.flad.entity.Hotel;
import com.lma.flad.repository.HotelRepository;
import com.lma.flad.service.IHotelService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class HotelController {

    private HotelRepository hotelRepository;
    /*
     * inject service
     */
    @Resource
    private IHotelService hotelService;

    public HotelController(HotelRepository hotelRepository){
        this.hotelRepository = hotelRepository;
    }

    @GetMapping("/hotels")
    public List<Hotel> getHotels(){
        List<Hotel> hotels = this.hotelRepository.findAll();

        return hotels;
    }
}
