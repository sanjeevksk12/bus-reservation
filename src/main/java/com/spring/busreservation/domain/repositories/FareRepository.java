package com.spring.busreservation.domain.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.busreservation.domain.entities.Fare;
import com.spring.busreservation.domain.entities.Route;
@Repository
public interface FareRepository extends JpaRepository<Fare, Long> {
	
	
	@Query("from Route where source=:source and destination=:destination and date=:date")
	List<Route> findRoute(@RequestParam("source") String from,@RequestParam("destination") String to,
			@RequestParam("date") Date date);

}
