package com.masai.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.masai.exception.rideException;
import com.masai.mocdel.Driver;


public interface DriverService {
	
	public Driver RegisterDeriver(Driver driver)throws rideException;
	
	public List<Driver> fidAllAvilableride()throws rideException;
	
	public Driver findRide(String driverId,Integer x,Integer y)throws rideException;
	
	

}
