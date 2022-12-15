package com.masai.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.masai.exception.rideException;
import com.masai.mocdel.Driver;
import com.masai.repo.DriverDao;

import antlr.collections.List;

@Service
public class DriverServiceImpl implements DriverService{
	
	@Autowired
	public DriverDao ddao;
	

	@Override
	public java.util.List<Driver> fidAllAvilableride() throws rideException {
		java.util.List<Driver> drivers=ddao.findAll();
		if(drivers.size()==0) {
			throw new rideException("ride any ride avilable");
		}
		return drivers;
	}


	@Override
	public Driver RegisterDeriver(Driver driver) throws rideException {
		
		Optional<Driver> rdriver=ddao.findById(driver.getDriverid());
		if(rdriver.isPresent()) {
			throw new rideException("driver already preset by this id");
		}
		
		
		
		return ddao.save(driver);
	}


	@Override
	public Driver findRide(String driverId, Integer x, Integer y) throws rideException {
		Optional<Driver> driver=ddao.findById(driverId);
		if(driver.isEmpty()) {
			throw new rideException("driver not preseent by this id");
		}
		
		Driver driver1=driver.get();
		int xc=driver1.getXcoridname()-x;
		int yc=driver1.getYcordiname()-y;
		int d=xc*xc+yc*yc;
		int finnald=(int) Math.sqrt(d);
		if(finnald>5) {
			throw new rideException("this driver not within the range of 5KM");
		}
		
		ddao.delete(driver1);
		
		
		return driver1;
		
	}
	
	

}
