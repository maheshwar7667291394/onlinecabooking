package com.masai.exception;

import java.lang.reflect.Method;
import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Myerror> PtternMatcherException(MethodArgumentNotValidException ce,WebRequest req){

		Myerror err=new Myerror();
		err.setMessage(ce.getMessage());
		err.setData(LocalDate.now());
		err.setDescription(req.getDescription(false));
		return new ResponseEntity<Myerror>(err,HttpStatus.BAD_REQUEST);
		
	}
	
	
	@ExceptionHandler(rideException.class)
	public ResponseEntity<Myerror> handleRideExceptioEntity(rideException ce,WebRequest req){
		
		Myerror err=new Myerror();
		err.setMessage(ce.getMessage());
		err.setData(LocalDate.now());
		err.setDescription(req.getDescription(false));
		return new ResponseEntity<Myerror>(err,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(UserException.class)
	public ResponseEntity<Myerror> getuserException(UserException ce,WebRequest req){
		Myerror err=new Myerror();
		err.setMessage(ce.getMessage());
		err.setData(LocalDate.now());
		err.setDescription(req.getDescription(false));
		return new ResponseEntity<Myerror>(err,HttpStatus.BAD_REQUEST);
	}
	
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Myerror> HandleAllExcetion(Exception ce,WebRequest req){
		
		Myerror err=new Myerror();
		err.setMessage(ce.getMessage());
		err.setData(LocalDate.now());
		err.setDescription(req.getDescription(false));
		return new ResponseEntity<Myerror>(err,HttpStatus.BAD_REQUEST);
		
	}

}
