package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.rideException;
import com.masai.mocdel.Driver;
import com.masai.service.DriverService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/masaicab")
public class DriverController {
	
	@Autowired
	public DriverService dservice;
	
	@PostMapping("/driver/register")
	public ResponseEntity<Driver> RegisterDriver(@RequestBody Driver driver) throws rideException{
		
		Driver drvirver=dservice.RegisterDeriver(driver);
		return new ResponseEntity<Driver>(drvirver,HttpStatus.OK);
		
	}
	
	

}
