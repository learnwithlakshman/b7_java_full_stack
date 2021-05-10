package com.careerit.todo.service;

import com.careerit.todo.domain.RegUser;

public interface UserService {
	
		public String login(String username,String password);
		public String register(RegUser regUser);
		 

}
