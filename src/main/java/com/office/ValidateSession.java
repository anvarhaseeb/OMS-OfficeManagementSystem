package com.office;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;


@WebFilter( urlPatterns = {"/AdmEditEmp",
		"/AdmLeaveEmp","/DeptAddServ","/EmpAddServ","/AdmEmpLog","/searchEmp","/SearchtoEdit",
		"/SalarytoUpdate","/salaryDisplayC","/LeaveStatus","/ApplyLeaves","/EmployeeProfile","/LeaveC"})
public class ValidateSession extends HttpFilter implements Filter {
       

	  @Override
	    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
	            throws IOException, ServletException {
	        HttpServletRequest httpRequest = (HttpServletRequest) request;
	        HttpServletResponse httpResponse = (HttpServletResponse) response;

	       
	        HttpSession session = httpRequest.getSession(false);

	        if (session == null || session.getAttribute("username") == null) {
	           
	            httpResponse.sendRedirect("Office.jsp");
	        } else {
	            
	            chain.doFilter(request, response);
	        }
	    }
}
