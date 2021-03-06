package com.sample.services;


import java.math.BigInteger;

import org.springframework.http.ResponseEntity;

import com.sample.model.Flight;

public interface FlightService {
	public ResponseEntity<?> addFlight(Flight flight);

	public Iterable<Flight> viewAllFlight();

	public Flight viewFlight(BigInteger flightNumber);

	public Flight modifyFlight(Flight flight);

	public String removeFlight(BigInteger flightNumber);

}
