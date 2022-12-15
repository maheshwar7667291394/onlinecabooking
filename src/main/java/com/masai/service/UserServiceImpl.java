package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.masai.exception.UserException;
import com.masai.mocdel.User;
import com.masai.repo.UserDao;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	public UserDao udao;

	@Override
	public User registerUser(User user)throws UserException {
		
		User suser=udao.findBymobile(user.getMobile());
		if(suser!=null) {
			throw new UserException("user already present by this email");
		}
		
		
		return udao.save(user);
	}

	@Override
	public List<User> GetAlluser() throws UserException {
	       List<User> ulist=udao.findAll();
	       if(ulist.size()==0) {
	    	   throw new UserException("no user presernt");
	       }
		return ulist;
	}

	

}
