package com.bee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bee.model.Users;
import com.bee.repository.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo userrepo; 
	
	public boolean checkuser(Users user)
	{
		
		if(userrepo.existsById(user.getUser_id()))
		{
			Users temp = userrepo.findById(user.getUser_id()).get();
			if(temp.getPassword().equals(user.getPassword()))
				return true;
		}
		return false;
	}
	public boolean checkuserid(Users user)
	{
		
		if(userrepo.existsById(user.getUser_id()))
			return true;
		return false;
	}
	public void save(Users user)
	{
		userrepo.save(user);
	}
	
	public Users getUser(String user_id)
	{
		Users temp = userrepo.findById(user_id).get();
		return temp;
	}
	
}
