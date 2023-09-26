package com.office.Employee.Controller;

import java.io.IOException;
import java.util.List;

import com.office.Employee.DAO.Profile;
import com.office.Employee.Model.EmployeeProfile;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/EmployeeProfile")
public class EmployeeProfileC extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		System.out.println("calling function viewProfile");
		
		 
			String ed = (String) request.getAttribute("EmpID");	
			int EmpID= 0; 
			if (ed != null && !ed.isEmpty()) {
			    try {
			    	EmpID = Integer.parseInt(ed);
			    } catch (NumberFormatException e) {
			       e.printStackTrace();
			    }
			}
		Profile p=new Profile();
		
		List<EmployeeProfile> ProfileEmp = p.viewProfile(EmpID);
		System.out.println("-------------"+EmpID);
		request.setAttribute("profileList", ProfileEmp);
		System.out.println(ProfileEmp);
		request.setAttribute("empid", EmpID);
		 request.getRequestDispatcher("Employees/EmployeeHome.jsp").forward(request, response);
	}
	
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		Profile p=new Profile();


		String ed = (String) request.getParameter("empid");	
		int EmpID= 0; 
		if (ed != null && !ed.isEmpty()) {
			try {
				EmpID = Integer.parseInt(ed);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
		}


		List<EmployeeProfile> ProfileEmp = p.viewProfile(EmpID);
		
		request.setAttribute("profileList", ProfileEmp);
		request.setAttribute("empid", EmpID);
		request.getRequestDispatcher("Employees/EmployeeHome.jsp").forward(request, response);
	}
}
