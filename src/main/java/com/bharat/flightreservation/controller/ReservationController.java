package com.bharat.flightreservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bharat.flightreservation.dto.ReservationRequest;
import com.bharat.flightreservation.entities.Flight;
import com.bharat.flightreservation.entities.Reservation;
import com.bharat.flightreservation.repos.FlightRepository;
import com.bharat.flightreservation.service.ReservationService;

@Controller
public class ReservationController {
	
	@Autowired
	FlightRepository flightRepository;
	
	@Autowired
	ReservationService reservationService; 

	@RequestMapping("/showCompleteReservation")
	public String showCompleteReservation(@RequestParam("FLIGHT_ID")int flightId,ModelMap modelMap)
	{
		Flight flight = flightRepository.findById(flightId).get();
		modelMap.addAttribute("flight", flight);
		
		return "completeReservation";
	}
	
	@RequestMapping(value="/completeReservation",method=RequestMethod.POST)
	public String reservation(ReservationRequest request,ModelMap modelMap)
	{
		
		Reservation reservation = reservationService.bookFlight(request);
		modelMap.addAttribute("msg", "Reservation created Succesfully with id "+reservation.getID());
		
		return "reservationConfirmation";
	}
	
	
}
