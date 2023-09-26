package com.office.Employee.Controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/LeaveC")
public class LeaveC extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    	
    	String empid = request.getParameter("empid");
    	request.setAttribute("empid", empid);
    	request.getRequestDispatcher("Employees/Leave.jsp").forward(request, response);
    }
    
}
