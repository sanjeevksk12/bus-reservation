package com.example.Bus.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.Bus.entity.Passenger;
import com.example.Bus.service.PassengerService;


@RestController
@RequestMapping("passengers")
public class PassengerController {
   @Autowired
	private PassengerService passengerService;
	
	@GetMapping
	public @ResponseBody List<Passenger> getAllPassengers() {
		return passengerService.getAllPassengers();
	}

	@GetMapping("/{passenger-id}")
	public @ResponseBody Passenger getPassengerById(@PathVariable("passenger-id") int passengerId) {
		return passengerService.getPassengerById(passengerId);
	}
}


