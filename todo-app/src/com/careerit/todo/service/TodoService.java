package com.careerit.todo.service;

import java.util.List;

import com.careerit.todo.domain.Todo;

public interface TodoService {

	
		public List<Todo> getActiveTodos(String username);
}
