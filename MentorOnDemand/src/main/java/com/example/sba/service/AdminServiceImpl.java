package com.example.sba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sba.dao.UserDao;
import com.example.sba.model.User;

@Service
public class AdminServiceImpl {
	
	@Autowired
	private UserDao userDao;
	
	public List<User> getList()
	{
		return userDao.findAll();
	}
	


}
