package com.bharat.flightreservation.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Reservation {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ID;
	private boolean CHECKED_IN;
	private int NUMBER_OF_BAGS;
	
	@OneToOne
	private Passenger PASSENGER_ID;
	
	

	@OneToOne
	private Flight FLIGHT;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public boolean isCHECKED_IN() {
		return CHECKED_IN;
	}

	public void setCHECKED_IN(boolean cHECKED_IN) {
		CHECKED_IN = cHECKED_IN;
	}

	public int getNUMBER_OF_BAGS() {
		return NUMBER_OF_BAGS;
	}

	public void setNUMBER_OF_BAGS(int nUMBER_OF_BAGS) {
		NUMBER_OF_BAGS = nUMBER_OF_BAGS;
	}

	public Passenger getPASSENGER_ID() {
		return PASSENGER_ID;
	}

	public void setPASSENGER_ID(Passenger pASSENGER_ID) {
		PASSENGER_ID = pASSENGER_ID;
	}
	
	public Flight getFLIGHT() {
		return FLIGHT;
	}

	public void setFLIGHT(Flight fLIGHT) {
		FLIGHT = fLIGHT;
	}

	
}
