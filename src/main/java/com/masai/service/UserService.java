package com.masai.service;

import java.util.List;

import com.masai.exception.UserException;
import com.masai.mocdel.User;

public interface UserService {
	
	public User registerUser(User user)throws UserException;
	
	public List<User> GetAlluser()throws UserException;

}
