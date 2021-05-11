package com.careerit.todo.dao;

import java.util.List;

import com.careerit.todo.domain.Todo;


public interface TodoDao {

	
			public List<Todo> getActiveTodos(String username);
}
