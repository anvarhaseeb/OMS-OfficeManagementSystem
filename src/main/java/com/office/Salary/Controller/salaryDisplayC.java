package com.office.Salary.Controller;

import jakarta.servlet.http.HttpServlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.office.Salary.DAO.salaryDisplayDB;
import com.office.Salary.Model.Salary;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/salaryDisplayC")
public class salaryDisplayC extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		List<Salary> salList =new ArrayList<Salary>();
		String ed = request.getParameter("empida");	
		int empID = 0; 
		if (ed != null && !ed.isEmpty()) {
		    try {
		        empID = Integer.parseInt(ed);
		    } catch (NumberFormatException e) {
		       e.printStackTrace();
		    }
		}
		
		salaryDisplayDB sal=new salaryDisplayDB();
		 salList = sal.fromSalary(empID);
		 request.setAttribute("empida", empID);
		 
		request.setAttribute("salList", salList);
		System.out.println(salList);
		request.getRequestDispatcher("Salary/SalaryDisplay.jsp").forward(request, response);
	}
}




