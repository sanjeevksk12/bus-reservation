package com.reservation.services;

import com.reservation.dto.ReservationRequest;
import com.reservation.entities.Reservation;

public interface ReservationService {

	Reservation bookBus(ReservationRequest request);
}
