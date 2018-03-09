package com.test.servletdemo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MvcServletDemo
 */
@WebServlet("/MvcServletDemo")
public class MvcServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MvcServletDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//Step 0: Add some data 
		String[] students = {"Pranam", "xyz", "Deepak", "Suresh" }; 
		request.setAttribute("student_list", students);
		
		//Step 1: get request dispatcher 
		RequestDispatcher dispatcher = request.getRequestDispatcher("/view_students.jsp"); 
		
		//Step 2: Forward the request to the JSP 
		dispatcher.forward(request, response);		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
