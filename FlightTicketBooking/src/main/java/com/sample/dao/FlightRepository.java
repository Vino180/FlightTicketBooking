package com.sample.dao;


import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.sample.model.Flight;
@Repository
public interface FlightRepository extends JpaRepository<Flight,BigInteger>{

}