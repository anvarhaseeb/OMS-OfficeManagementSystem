package com.office.controller;

import java.io.IOException;
import java.sql.SQLException;

import com.office.DAO.EmpLogin;
import com.office.model.LoginEmployee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/AdmEmpLog")
public class EmpLogServ extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{

		String ed = request.getParameter("empid");	
		int empid = 0; 
		if (ed != null && !ed.isEmpty()) {
		    try {
		        empid = Integer.parseInt(ed);
		    } catch (NumberFormatException e) {
		       e.printStackTrace();
		    }
		}

		String username = request.getParameter("username");
		String psswd = request.getParameter("psswd");
		
		String type= "E";
		LoginEmployee logEmp =new LoginEmployee();
		logEmp.setId(empid);
		logEmp.setType(type);
		logEmp.setUname(username);
		logEmp.setPassword(psswd);
		
		EmpLogin e=new EmpLogin();
		 try {
	            e.emplogin(logEmp);
	            boolean condition = e.checkuname(username);
	            if (condition) {
	                request.setAttribute("errorMessage", "Username already exists. Please choose  different username.");
	            } else {
	            	System.out.println("Log inserted succesfully");
//	            	request.removeAttribute("errorMessage");
//	                request.setAttribute("successMessage", "Employee login data inserted successfully.");
	            }
	        } catch (SQLException ex) {
	            ex.printStackTrace();
	           
	        }

	        request.getRequestDispatcher("AdmEmpLog.jsp").forward(request, response);
}
}