package com.office.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.office.DAO.AdmLeavesDB;
import com.office.Employee.Model.Leave;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/AdmLeaveEmp")

public class AdmLeaveEmp extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		List<Leave> leaveRecords =new ArrayList<Leave>();
		String ed = request.getParameter("empida");	
		int empID = 0; 
		if (ed != null && !ed.isEmpty()) {
		    try {
		        empID = Integer.parseInt(ed);
		    } catch (NumberFormatException e) {
		       e.printStackTrace();
		    }
		}

		   AdmLeavesDB ls = new AdmLeavesDB();
		   leaveRecords =ls.leaveList(empID);	
		   
		    request.setAttribute("empid", empID);
		    request.setAttribute("leaveRecords", leaveRecords);
 
		request.getRequestDispatcher("AdmLeaveView.jsp").forward(request, response);
	}
}
