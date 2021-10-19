package com.sample.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import com.sample.model.Airport;

@Repository
public interface AirportRepository extends JpaRepository<Airport, String> {

}