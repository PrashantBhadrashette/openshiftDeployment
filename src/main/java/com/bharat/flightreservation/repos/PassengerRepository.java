package com.bharat.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bharat.flightreservation.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Integer> {

}
