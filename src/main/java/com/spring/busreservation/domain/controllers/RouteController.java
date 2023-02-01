package com.spring.busreservation.domain.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
  import com.spring.busreservation.domain.entities.Route;
//import com.spring.busreservation.domain.repositories.FareRepository;
import com.spring.busreservation.domain.repositories.RouteRepository;

@Controller 
public class RouteController {
	@Autowired
	private RouteRepository routeRepo;

	@RequestMapping("/searchRoute")
	public String viewSerchRoute() {
		return "searchroute"; 
	}

	@RequestMapping("/findRoute")
	public String findRoute(@Param("from") String from, @Param("to") String to,
			@Param("date") @DateTimeFormat(pattern = "MM-dd-yyyy") Date date, ModelMap model) {
		List<Route> findRoute = routeRepo.findRoute(from, to, date);
		model.addAttribute("findRoute", findRoute);
		return "displayroute";

	}

}
  