package com.lma.flad.access;

import com.lma.flad.entity.Hotel;
import com.lma.flad.service.IHotelService;
import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.lma.flad.repository"})
@EntityScan(basePackages = {"com.lma.flad.entity"})
@ComponentScan(basePackages = { "com.lma.flad.repository", "com.lma.flad.service", "com.lma.flad.controller"})
public class FladApplication implements CommandLineRunner {


   @Autowired
   IHotelService hotelService;

    public static void main(String[] args) {
        SpringApplication.run(FladApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


        Hotel h1 = new Hotel("hotel1",1,true);
        Hotel h2 = new Hotel("hotel2",1,true);
        Hotel h3 = new Hotel("hotel3",1,true);


        hotelService.addHotel(h1);
        hotelService.addHotel(h2);
        hotelService.addHotel(h3);

    }
}
