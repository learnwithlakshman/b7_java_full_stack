package com.careerit.todo.service;

import java.util.List;

import com.careerit.todo.dao.TodoDao;
import com.careerit.todo.dao.TodoDaoImpl;
import com.careerit.todo.domain.Todo;

public class TodoServiceImpl implements TodoService {
	
	private TodoDao todoDao;
	
	public TodoServiceImpl() {
		this.todoDao = new TodoDaoImpl();
	}

	@Override
	public List<Todo> getActiveTodos(String username) {
		if(username !=null) {
			List<Todo> todoList = todoDao.getActiveTodos(username);
			System.out.println("Total :"+todoList.size()+" active todos found for user :"+username);
			return todoList;
		}
		throw new IllegalArgumentException("Username can't be empty or null");
	}

}
