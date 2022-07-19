package com.bharat.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bharat.flightreservation.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

}
