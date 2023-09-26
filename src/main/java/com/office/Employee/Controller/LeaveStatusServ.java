package com.office.Employee.Controller;

import java.io.IOException;
import java.util.List;

import com.office.Employee.DAO.LeaveDB;
import com.office.Employee.Model.Leave;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/LeaveStatus")
public class LeaveStatusServ extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
	    String empid = request.getParameter("empid");
	    int empID = 0;
	    if (empid != null && !empid.isEmpty()) {
	        try {
	            empID = Integer.parseInt(empid);
	        } catch (NumberFormatException e) {
	            e.printStackTrace();
	        }
	    }

	    LeaveDB leaveDB = new LeaveDB();
	    List<Leave> leaveRecords = leaveDB.leaveStatus(empID);

	    request.setAttribute("empid", empid);
	    request.setAttribute("leaveRecords", leaveRecords);

	    request.getRequestDispatcher("Employees/LeaveStatus.jsp").forward(request, response);
	}


    
    }


