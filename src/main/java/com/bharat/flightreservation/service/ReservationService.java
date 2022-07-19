package com.bharat.flightreservation.service;

import com.bharat.flightreservation.dto.ReservationRequest;
import com.bharat.flightreservation.entities.Reservation;

public interface ReservationService {
	
	public Reservation bookFlight(ReservationRequest request);

}
