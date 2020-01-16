package com.inder.logic;

import java.util.List;

import com.inder.orm.User;

public interface UserService {
	
	public void save(User user);
	public List<User> list();

}
