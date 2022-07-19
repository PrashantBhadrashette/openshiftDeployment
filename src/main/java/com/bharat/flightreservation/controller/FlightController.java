package com.bharat.flightreservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bharat.flightreservation.entities.Flight;
import com.bharat.flightreservation.repos.FlightRepository;

@Controller
public class FlightController {
	
	@Autowired
	FlightRepository flightRepository;
	
	@RequestMapping(value="/findFlights")
	public String searchFlight(@RequestParam("from") String from ,@RequestParam("to") String to 
			,@RequestParam("departureDate") @DateTimeFormat(pattern="MM-DD-YYYY") String departureDate, 
			ModelMap modelMap)
	{
		 List<Flight> findFlight = flightRepository.findFlight(from,to,departureDate);
		 modelMap.addAttribute("flightList",findFlight );

		return "displayFlight";
		
		
	}
	
	@RequestMapping("admin/showAddFlight")
	public String showAddFlight()
	{
		return"addFlight";
	}
	
	
	
	

}
