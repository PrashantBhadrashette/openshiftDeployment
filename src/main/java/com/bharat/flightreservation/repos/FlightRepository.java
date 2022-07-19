package com.bharat.flightreservation.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bharat.flightreservation.entities.Flight;

public interface FlightRepository extends JpaRepository<Flight, Integer> {

	@Query(" from Flight where DEPARTURE_CITY=:departureCity and ARRIVAL_CITY=:arrivalCity and  DATE_OF_DEPARTURE=:dateOfDeparture ")
	List<Flight> findFlight(@Param("departureCity")String from, @Param("arrivalCity")String to, @Param("dateOfDeparture") String departureDate);

}
