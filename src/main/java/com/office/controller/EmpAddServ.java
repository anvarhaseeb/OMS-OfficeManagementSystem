package com.office.controller;

import java.io.IOException;
import java.util.List;

import com.office.DAO.AdmEditEmpDb;
import com.office.DAO.DeptFromDB;
import com.office.DAO.EmpAddDB;
import com.office.model.Department;
import com.office.model.Employee;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/EmpAddServ")

public class EmpAddServ extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
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
		
		
		if(action.equals("Add")) {
			
		
		String empname = request.getParameter("empname");
		String dob = request.getParameter("dob");
		String qlf = request.getParameter("qlf");
		String phn = request.getParameter("phn");
		String email = request.getParameter("email");

		String expStr = request.getParameter("exp");	
		int exp = 0; 
		if (expStr != null && !expStr.isEmpty()) {
		    try {
		        exp = Integer.parseInt(expStr);
		    } catch (NumberFormatException e) {
		       e.printStackTrace();
		    }
		}

		String cmpname = request.getParameter("cmpname");
		String add = request.getParameter("add");
		String doj = request.getParameter("doj");
		String dept = request.getParameter("dept");

	
		Employee emp = new Employee();
		emp.setEmpname(empname);
		emp.setDob(dob);
		emp.setQlf(qlf);
		emp.setPhn(phn);
		emp.setEmail(email);
		emp.setExp(exp); 
		emp.setCmpname(cmpname);
		emp.setAdd(add);
		emp.setDoj(doj);
		emp.setDept(dept);

		EmpAddDB e=new EmpAddDB();
		e.AddEmps(emp);
		
		response.sendRedirect("AdminEmpAdd.jsp");
		}

		if(action.equals("Edit")) {


			String empname = request.getParameter("empname");
			String dob = request.getParameter("dob");
			String qlf = request.getParameter("qlf");
			String phn = request.getParameter("phn");
			String email = request.getParameter("email");

			String expStr = request.getParameter("exp");	
			int exp = 0; 
			if (expStr != null && !expStr.isEmpty()) {
			    try {
			        exp = Integer.parseInt(expStr);
			    } catch (NumberFormatException e) {
			     
			        e.printStackTrace();
			    }
			}

			String cmpname = request.getParameter("cmpname");
			String add = request.getParameter("add");
			String doj = request.getParameter("doj");
			String dept = request.getParameter("dept");

		
			Employee emp = new Employee();
			emp.setEmpid(empid);
			emp.setEmpname(empname);
			emp.setDob(dob);
			emp.setQlf(qlf);
			emp.setPhn(phn);
			emp.setEmail(email);
			emp.setExp(exp); 
			emp.setCmpname(cmpname);
			emp.setAdd(add);
			emp.setDoj(doj);
			emp.setDept(dept);
		
			AdmEditEmpDb edit=new AdmEditEmpDb ();
			edit.editEmployee(emp);
			request.getRequestDispatcher("AdminEmpAdd.jsp").forward(request, response);
		}
	}
}
