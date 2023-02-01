package com.reservation.entities;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Reservation extends AbstractEntity  {

	@OneToOne
	private Passenger passenger;

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	
	
}
