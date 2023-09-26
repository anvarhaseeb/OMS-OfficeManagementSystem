package com.office.controller;

import java.io.IOException;
import java.util.List;

import com.office.DAO.AdminLeaveStatusDB;
import com.office.DAO.DeptFromDB;
import com.office.model.Department;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/AdmLeaveStatus")
public class AdmLeaveStatus extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		String ed = request.getParameter("empida");	
		int empID = 0; 
		if (ed != null && !ed.isEmpty()) {
		    try {
		        empID = Integer.parseInt(ed);
		    } catch (NumberFormatException e) {
		       e.printStackTrace();
		    }
		}
		

		 AdminLeaveStatusDB abc=new AdminLeaveStatusDB();
		 
		   String action = request.getParameter("action");
		   if(action.equals("approve")) 
		   {
			
			  abc.setStatus("Y",empID);
		   }
		   else if(action.equals("deny")) 
		   {
			   
			   abc.setStatus("N",empID);
		   }
		   

		   request.getRequestDispatcher("AdminHome.jsp").forward(request, response);
	}
	
}
