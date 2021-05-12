package com.careerit.todo.web;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.careerit.todo.domain.Todo;
import com.careerit.todo.service.TodoService;
import com.careerit.todo.service.TodoServiceImpl;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/home")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final Logger log = Logger.getLogger(HomeServlet.class.getName());
	private TodoService todoService = new TodoServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession httpSession = request.getSession();
		Object user = httpSession.getAttribute("username");
		if (user != null) {
			String username = (String) user;
			List<Todo> list = todoService.getActiveTodos(username);
			request.setAttribute("todos", list);
			RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
			rd.forward(request, response);
		} else {
			response.sendRedirect("loginform");
		}
		String params = request.getQueryString();
		log.info("Query parameters :"+params);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
