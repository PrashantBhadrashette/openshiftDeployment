package com.bharat.flightreservation.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.bharat.flightreservation.dto.ReservationRequest;
import com.bharat.flightreservation.entities.Flight;
import com.bharat.flightreservation.entities.Passenger;
import com.bharat.flightreservation.entities.Reservation;
import com.bharat.flightreservation.repos.FlightRepository;
import com.bharat.flightreservation.repos.PassengerRepository;
import com.bharat.flightreservation.repos.ReservationRepository;

public class ReservationServiceImpl implements ReservationService {

	@Autowired
	FlightRepository flightRepository;

	@Autowired
	PassengerRepository passengerRepository;

	@Autowired
	ReservationRepository reservationRepository;

	@Override
	public Reservation bookFlight(ReservationRequest request) {

		int flightId = request.getFlightId();
		Flight flight = flightRepository.findById(flightId).get();

		Passenger passenger = new Passenger();
		passenger.setFIRST_NAME(request.getPassengerFirstName());
		passenger.setLAST_NAME(request.getPassengerLastName());
		passenger.setEMAIL(request.getPassengerEmail());
		passenger.setPHONE(request.getPassengerPhone());

		passengerRepository.save(passenger);

		Reservation reservation = new Reservation();
		reservation.setFLIGHT(flight);
		reservation.setPASSENGER_ID(passenger);
		reservation.setCHECKED_IN(false);

		Reservation savedReservation = reservationRepository.save(reservation);

		return savedReservation;
	}

}
