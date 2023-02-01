package com.reservation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reservation.dto.ReservationRequest;
import com.reservation.entities.Passenger;
import com.reservation.entities.Reservation;
import com.reservation.repository.PassengerRepository;
import com.reservation.repository.ReservationRepository;

@Service
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	private PassengerRepository passengerRepo;
	
	@Autowired
	private ReservationRepository reservationRepo;
	
	@Override
	public Reservation bookBus(ReservationRequest request) {
	
		Passenger passenger = new Passenger();
		passenger.setFirstName(request.getFirstName());
		passenger.setMiddleName(request.getMiddleName());
		passenger.setLastName(request.getLastName());
		passenger.setEmail(request.getEmail());
		passenger.setPhone(request.getPhone());
		passengerRepo.save(passenger);
		
		Reservation reservation = new Reservation();
		reservation.setPassenger(passenger);
		
		reservationRepo.save(reservation);
		
		return reservation;
	}

}
