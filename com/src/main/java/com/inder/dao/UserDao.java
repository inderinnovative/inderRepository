package com.inder.dao;

import java.util.List;

import com.inder.orm.User;

public interface UserDao {

	 void save(User user);
	 List<User> list();
}
