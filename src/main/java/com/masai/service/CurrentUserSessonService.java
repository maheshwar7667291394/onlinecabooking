package com.masai.service;

import com.masai.exception.UserException;
import com.masai.mocdel.CurrentUserSesson;
import com.masai.mocdel.LoginDao;

public interface CurrentUserSessonService {
	public CurrentUserSesson LoginUser(LoginDao login)throws UserException;
	public String logout(String uuid)throws UserException;
	
	

}
