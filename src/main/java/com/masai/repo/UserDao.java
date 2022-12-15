package com.masai.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.exception.UserException;
import com.masai.mocdel.User;
@Repository
public interface UserDao extends JpaRepository<User, String>{
	
	public User findBymobile(String mobile);

}
