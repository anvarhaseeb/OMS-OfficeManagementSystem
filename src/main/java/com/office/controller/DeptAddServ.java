package com.office.controller;

import java.io.IOException;
import java.util.List;

import com.office.DAO.DeptAddDB;
import com.office.DAO.DeptFromDB;
import com.office.model.Department;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/DeptAddServ")
public class DeptAddServ extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    	{
    		String deptid = request.getParameter("deptid");
    		String deptname = request.getParameter("deptname");
    		
    		Department dept=new Department();
    		dept.setId(deptid);
    		dept.setDeptname(deptname);
    		
    		DeptAddDB d =new DeptAddDB();
    		d.Deptadd(dept);
    		
    		DeptFromDB deptFromDB = new DeptFromDB();
    		List<Department> departments = deptFromDB.FromDept();
    		
    		HttpSession session =request.getSession();
    		session.setAttribute("DepartmentList",departments);
    		
    		response.sendRedirect("AdminDept.jsp");
    		
    	}
}
