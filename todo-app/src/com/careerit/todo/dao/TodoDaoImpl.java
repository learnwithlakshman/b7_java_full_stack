package com.careerit.todo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.careerit.todo.dao.util.DbConnection;
import com.careerit.todo.domain.Todo;

public class TodoDaoImpl implements TodoDao {

	public static final String TODOS_OF_USER = "select id,title,message from todo where username=? and status = ?";

	@Override
	public List<Todo> getActiveTodos(String username) {
		Connection con =null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		List<Todo> todoList = new ArrayList<Todo>();
		try {
			con = DbConnection.util.getConnection();
			pst = con.prepareStatement(TODOS_OF_USER);
			pst.setString(1, username);
			pst.setInt(2, 1);
			rs = pst.executeQuery();
			while(rs.next()) {
				
					int id = rs.getInt("id");
					String title = rs.getString("title");
					String message =rs.getString("message");
					Todo todo = new Todo(id, title, message);
					todoList.add(todo);
			}
			
		}catch (SQLException e) {
				System.out.println("While getting todo's of user :"+username+" "+e);
		}
		return todoList;
	}

}
