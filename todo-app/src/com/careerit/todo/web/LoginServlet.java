package com.careerit.todo.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.careerit.todo.service.UserService;
import com.careerit.todo.service.UserServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Logger log = Logger.getLogger(LoginServlet.class.getName());
	private UserService userService;
	public LoginServlet() {
			userService = new UserServiceImpl();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			log.info("User is trying login with username :"+username);
			
			String loginUser = userService.login(username, password);
			
			RequestDispatcher rd;
			if(loginUser.isEmpty()) {
				PrintWriter out = response.getWriter();
				out.println("Invalid Credentials");
				request.setAttribute("errormessage", "Invalid credentials");
				rd = request.getRequestDispatcher("login.jsp");
				rd.include(request, response);
				return;
			}else {
				response.sendRedirect("home");
			}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
