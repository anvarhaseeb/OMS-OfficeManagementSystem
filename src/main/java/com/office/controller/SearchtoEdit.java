package com.office.controller;

import java.io.IOException;
import java.util.List;

import com.office.DAO.SearchEmpDB;
import com.office.model.Employee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/SearchtoEdit")
public class SearchtoEdit extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

	
		String ed= request.getParameter("empida");
				
				
				int empid = 0; 
				if (ed != null && !ed.isEmpty()) {
				    try {
				        empid = Integer.parseInt(ed);
				    } catch (NumberFormatException e) {
				       e.printStackTrace();
				    }
				}
		
		String action= request.getParameter("action");

		if(action.equals("editform")) {


			request.setAttribute("empida", ed);
			request.setAttribute("action", "Edit");
			
			SearchEmpDB s=new SearchEmpDB();
			Employee E=new Employee();
			E.setEmpid(empid);
			
			List<Employee> datalist= s.EmpSearch(E);
			System.out.println("==============the datalist================"+datalist);
			
			request.setAttribute("datalist", datalist);
			request.getRequestDispatcher("AdminEmpAdd.jsp").forward(request, response);
		}
		
		
		if(action.equals("addform")) 
		
		{
			request.setAttribute("empida", ed);
			request.setAttribute("action", "Add");
			
			request.getRequestDispatcher("AdminEmpAdd.jsp").forward(request, response);
		}
	}
}
