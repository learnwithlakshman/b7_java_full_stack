package com.careerit.todo.dao;

import com.careerit.todo.domain.RegUser;

public interface UserDao {
	public String selectUser(String username,String password);
	public String insertUser(RegUser regUser);
	 
}
