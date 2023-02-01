package com.example.Bus.service;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.Bus.entity.Passenger;

public interface PassengerService {


	Passenger getPassengerById(int passengerId);

	List<Passenger> getAllPassengers();
}
