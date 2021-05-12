package com.careerit.todo.web;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("*.do")
public class TodoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger log = Logger.getLogger(TodoServlet.class.getName());
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
				String uri = request.getRequestURI();
				StringBuffer url = request.getRequestURL();
				
				System.out.println(uri);
				System.out.println(url);
				
				if(uri.endsWith("addnewtodo.do")) {
					
				}else if(uri.endsWith("deletetodo.do")) {
					String strId=request.getParameter("id");
					int id = Integer.parseInt(strId);
					log.info("Requested for deletion of todo with id:"+id);
					
				}else if(uri.endsWith("edittodo.do")) {
					
				}else if(uri.endsWith("payment.do")) {
					response.sendRedirect("home?paymentstatus='success'&&id=12000198&&tranId=3456767&&key='ABCxyzLMN'");
				}
			
				
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
