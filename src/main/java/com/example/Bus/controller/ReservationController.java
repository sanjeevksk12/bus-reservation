package com.example.Bus.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Bus.dto.ReservationDTO;
import com.example.Bus.entity.Reservation;
import com.example.Bus.service.ReservationService;

import jakarta.validation.Valid;


@RestController
public class ReservationController {

	@Autowired
	private ReservationService reservationService;

	@PostMapping("/reservation")
	public ResponseEntity<Reservation> addReservation(@Valid @RequestBody ReservationDTO reservationDTO ,@RequestParam(required = false) String key) {
		Reservation savedReservation =reservationService.addReservation(reservationDTO,key);
		return new ResponseEntity<Reservation>(savedReservation,HttpStatus.ACCEPTED);
	}
		

	
	





}

