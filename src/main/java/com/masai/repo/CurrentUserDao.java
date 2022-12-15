package com.masai.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.mocdel.CurrentUserSesson;

public interface CurrentUserDao extends JpaRepository<CurrentUserSesson, String>{
	
	public CurrentUserSesson findByuuid(String uuid);
	public CurrentUserSesson findBymobile(String mobile);

}
