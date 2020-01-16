package com.inder.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.inder.orm.User;

@Repository
public class UserDaoImp implements UserDao{
	 @Autowired
	   private SessionFactory sessionFactory;
	 
	   public void save(User user) {
	      sessionFactory.getCurrentSession().save(user);
	   }
	 

	   public List<User> list() {
	      @SuppressWarnings("unchecked")
	      List<User> query = sessionFactory.getCurrentSession().createQuery("from User").list();
	      return query;
	   }
}
