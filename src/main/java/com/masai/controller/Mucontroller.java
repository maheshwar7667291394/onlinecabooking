package com.masai.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.UserException;
import com.masai.exception.rideException;
import com.masai.mocdel.CurrentUserSesson;
import com.masai.mocdel.Driver;
import com.masai.mocdel.LoginDao;
import com.masai.mocdel.User;
import com.masai.service.CurrentUserSessonService;
import com.masai.service.DriverService;
import com.masai.service.UserService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/masaicab")
public class Mucontroller  {
	@Autowired
	public UserService uservice;
	
	@Autowired
	public CurrentUserSessonService cuservice;
	
	@Autowired
	public DriverService dservice;
	
	
	@PostMapping("/user/register")
	public ResponseEntity<User> Registeruser(@Valid @RequestBody User user) throws UserException{
		
		User ruser=uservice.registerUser(user);
		return new ResponseEntity<>(ruser,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/users")
	public ResponseEntity<List<User>> FindAlluser() throws UserException{
		List<User> listuser=uservice.GetAlluser();
		return new ResponseEntity<List<User>>(listuser,HttpStatus.OK);
		
		
	}
	

	@PostMapping("/user/login")
	public ResponseEntity<CurrentUserSesson> Login(@RequestBody LoginDao cuser) throws UserException{
		
		  CurrentUserSesson cuserlogin=cuservice.LoginUser(cuser);
		  
		  return new ResponseEntity<>(cuserlogin,HttpStatus.OK);
		
	}
	
	@DeleteMapping("/user/logout/{key}")
	public ResponseEntity<String> Logout(@PathVariable String key) throws UserException{
		
		String result=cuservice.logout(key);
		return new ResponseEntity<String>(result,HttpStatus.OK);
		
	}
	
	@GetMapping("/user/findDrive")
	public ResponseEntity<List<Driver>> getAllAvilableRide() throws rideException{
		
		List<Driver> drivers=dservice.fidAllAvilableride();
		return new ResponseEntity<>(drivers,HttpStatus.OK);
		
	}
	
	@PutMapping("/user/book/{driverid}/{x}/{y}")
	public ResponseEntity<Driver> bookDriver(@PathVariable String driverid ,@PathVariable Integer x,@PathVariable Integer y) throws rideException{
		
		Driver driver=dservice.findRide(driverid, x, y);
		return new ResponseEntity<Driver>(driver,HttpStatus.OK);
		
		
	}
	
	

}
