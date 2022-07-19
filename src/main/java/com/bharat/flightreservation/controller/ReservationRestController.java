package com.bharat.flightreservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bharat.flightreservation.dto.ReservationUpdateRequest;
import com.bharat.flightreservation.entities.Reservation;
import com.bharat.flightreservation.repos.ReservationRepository;

@RestController
public class ReservationRestController {
	
	@Autowired
    ReservationRepository reservationRepository;
	
	@RequestMapping("/reservation/{id}")
	public Reservation findReservation(@PathVariable("id")int id)
	{
		Reservation reservation = reservationRepository.findById(id).get();
		return reservation;
	}
	
	@RequestMapping("/reservation")
	public Reservation updateReservation(ReservationUpdateRequest request)
	{
		Reservation reservation = reservationRepository.findById(request.getId()).get();
		reservation.setNUMBER_OF_BAGS(request.getNumberOfBags());
		
		Reservation updateReservation = reservationRepository.save(reservation);
		
		return updateReservation;
		
	}
	

}
