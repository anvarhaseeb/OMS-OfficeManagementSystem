package com.office;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.office.DAO.DeptFromDB;
import com.office.model.Department;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/AdmLog")
public class AdmLog extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String uname = request.getParameter("uname");
        String psswd = request.getParameter("psswd");
        
        Connection con = null;
        Statement statement = null;
        ResultSet resultSet = null;
        
        try {
            con = Connect.getConnection();
            statement = con.createStatement();
            resultSet = statement.executeQuery("SELECT uname, password, type ,empid FROM login WHERE uname = '" + uname + "' AND password = '" + psswd + "'");
            
            if (resultSet.next()) {
        	
            	  

            	String userType = resultSet.getString("type");
            	if ("A".equals(userType)) {
            	
            	
				/* For the department values to select */
    			DeptFromDB deptFromDB = new DeptFromDB();
    			List<Department> departments = deptFromDB.FromDept();

    			 HttpSession session =request.getSession();
    			 session.setAttribute("DepartmentList",departments);
    			 session.setAttribute("username", "uname"); 

    			request.getRequestDispatcher("AdminHome.jsp").forward(request, response);
            	} 
            	
            	else if("E".equals(userType))
            	{	 
            		 HttpSession session =request.getSession();
            		 session.setAttribute("username", "uname"); 
            		 request.setAttribute("EmpID", resultSet.getString("empid"));
            		 request.getRequestDispatcher("EmployeeProfile").forward(request, response);
            		
            	}
        		
            }
            
            else {
                response.sendRedirect("Office.jsp");
            }
        } catch (SQLException e) {
           
            e.printStackTrace();
            response.sendRedirect("Error.jsp"); 
        } 
        }
   
}
