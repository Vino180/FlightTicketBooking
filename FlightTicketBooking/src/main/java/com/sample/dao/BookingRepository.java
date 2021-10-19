package com.sample.dao;


import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.sample.model.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, BigInteger> {

}
