package com.example.Bus.exception;

import org.apache.kafka.common.errors.ResourceNotFoundException;

public class PassengerNotFoundException extends ResourceNotFoundException {

	private static final long serialVersionUID = -7428665705397767944L;

	public PassengerNotFoundException(int passengerId) {
		super("Passenger", "passenger-id");
	}
}