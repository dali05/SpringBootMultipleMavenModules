package com.lma.flad.repository;

import com.lma.flad.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {
}
