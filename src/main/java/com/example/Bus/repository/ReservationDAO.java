package com.example.Bus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Bus.entity.Reservation;
@Repository
public interface ReservationDAO extends JpaRepository<Reservation, Integer> {

}
