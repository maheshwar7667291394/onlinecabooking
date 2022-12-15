package com.masai.exception;

import javax.persistence.Entity;


public class rideException extends Exception{
	public rideException() {}
	
	public rideException(String message) {
		super(message);
	}

}
