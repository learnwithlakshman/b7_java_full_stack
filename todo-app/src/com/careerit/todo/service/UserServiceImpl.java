package com.careerit.todo.service;

import com.careerit.todo.dao.UserDao;
import com.careerit.todo.dao.UserDaoImpl;
import com.careerit.todo.domain.RegUser;

public class UserServiceImpl implements UserService{

	private UserDao userDao;
	
	public UserServiceImpl() {
			userDao = new UserDaoImpl();
	}
	
	@Override
	public String login(String username, String password) {
	
		if(username == null || username.isEmpty() || password == null || password.isEmpty()) {
			throw new IllegalArgumentException("Login username or password can't empty");
		}
		return userDao.selectUser(username, password);
	}

	@Override
	public String register(RegUser regUser) {
		
		if(regUser == null || regUser.getUsername().isEmpty() || regUser.getPassword().isEmpty()) {
			throw new IllegalArgumentException("Registered username or password can't empty");
		}else {
			return userDao.insertUser(regUser);
		}
	
	}

	
		
}

