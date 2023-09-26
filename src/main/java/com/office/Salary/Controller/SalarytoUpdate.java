package com.office.Salary.Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.office.Salary.DAO.SalaryUpdate;
import com.office.Salary.DAO.salaryDisplayDB;
import com.office.Salary.Model.Salary;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/SalarytoUpdate")
public class SalarytoUpdate extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1297149667441543932L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		String ed= request.getParameter("empida");	
		int empida = 0; 
		if (ed!= null && ! ed.isEmpty()) {
		    try {
		    	empida = Integer.parseInt(ed);
		    } catch (NumberFormatException e) {
		       e.printStackTrace();
		    }
		}
		
		
		String action= request.getParameter("action");
		
		String sal= request.getParameter("salary");			
		int salary = 0; 
		if (sal != null && ! sal.isEmpty()) {
		    try {
		    	salary = Integer.parseInt(sal);
		    } catch (NumberFormatException e) {
		       e.printStackTrace();
		    }
		}
		
		String bon = request.getParameter("bonus");		
		int bonus = 0; 
		if (bon!= null && ! bon.isEmpty()) {
		    try {
		    	bonus = Integer.parseInt(bon);
		    } catch (NumberFormatException e) {
		       e.printStackTrace();
		    }
		}
		String Dsalary= request.getParameter("Dsalary");
		
		if(action.equals("addsalary"))
		{
			
			Salary slry= new Salary();
			
			slry.setAmount(salary);
			slry.setBonus(bonus);
			slry.setSDate(Dsalary);
			slry.setEmpid(empida);
			
			SalaryUpdate SU=new SalaryUpdate();
			SU.SalaryAdd(slry);
			request.getRequestDispatcher("Salary/SalaryUpdate.jsp").forward(request, response);
		}
		
		else if(action.equals("editsalary")) {
			
			System.out.println("is it edit ->"+action);
			Salary sl= new Salary();
			
			sl.setAmount(salary);
			sl.setBonus(bonus);
			sl.setSDate(Dsalary);
			sl.setEmpid(empida);
			
			SalaryUpdate Sl=new SalaryUpdate();
			Sl.SalaryEdit(sl);
			request.getRequestDispatcher("Salary/SalaryUpdate.jsp").forward(request, response);
		} 
	
		
		else if(action.equals("editform")) {
			
			System.out.println("now in editform-----"+empida);
			request.setAttribute("empida", empida);
			request.setAttribute("action", "editsalary");
			
			Salary sl= new Salary();
			sl.setEmpid(empida);
			
			List<Salary> salList =new ArrayList<Salary>();
			salaryDisplayDB sala=new salaryDisplayDB();
			
			 salList = sala.fromSalary(empida);
			 System.out.println(salList);
			 
			request.setAttribute("salList", salList);
		
			
			
			request.getRequestDispatcher("Salary/SalaryUpdate.jsp").forward(request, response);
		}
		
		
		else if(action.equals("addform")) {
		
			System.out.println(empida);
			request.setAttribute("empida", empida);
			request.setAttribute("action", "addsalary");
			request.getRequestDispatcher("Salary/SalaryUpdate.jsp").forward(request, response);
		}
		
	}
}
