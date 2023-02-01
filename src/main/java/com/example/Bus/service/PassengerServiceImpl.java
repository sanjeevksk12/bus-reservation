package com.example.Bus.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.Bus.entity.Passenger;
import com.example.Bus.exception.PassengerNotFoundException;
import com.example.Bus.repository.PassengerRepository;

@Service
public  class PassengerServiceImpl implements PassengerService{
	
	@Autowired
	private PassengerRepository passengerRepo;
	
	//@Override
	public Passenger getPassengerById(int passengerId) {
		return passengerRepo.findById(passengerId).orElseThrow(() -> new PassengerNotFoundException(passengerId));
	}

	//@Override
	public List<Passenger> getAllPassengers() {
		return passengerRepo.findAll();
	}


}
