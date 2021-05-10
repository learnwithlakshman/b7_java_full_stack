package com.careerit.todo.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.careerit.todo.domain.RegUser;
import com.careerit.todo.service.UserService;
import com.careerit.todo.service.UserServiceImpl;


@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   private UserService userService;
    public RegisterServlet() {
    	userService = new UserServiceImpl();
    }
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			String username = request.getParameter("username");
			String email =    request.getParameter("email");
			String password = request.getParameter("password");
			
			RegUser user = new RegUser(username, password, email);
			username = userService.register(user);
			if(username!=null) {
					response.sendRedirect("success.jsp?username="+username);
			}else {
					response.sendRedirect("error.jsp");
			}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}
	
	      

}
