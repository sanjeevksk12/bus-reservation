package com.reservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reservation.dto.ReservationRequest;
import com.reservation.entities.Reservation;
import com.reservation.services.ReservationService;

@Controller
public class ReservationController {

	@Autowired
	private ReservationService reservationService;
	
	@RequestMapping("/confirmReservation")
	public String confirmReservation (ReservationRequest request,ModelMap model) {
	Reservation reservationId =	reservationService.bookBus(request);
	model.addAttribute("reservationId", reservationId.getId());
	return "confirmReservation";
	
	
	}
	
	
}
