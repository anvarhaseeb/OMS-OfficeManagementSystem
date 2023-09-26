package com.office.Employee.Controller;

import java.io.IOException;

import com.office.Employee.DAO.LeaveDB;
import com.office.Employee.Model.Leave;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/ApplyLeaves")
public class ApplyLeave extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String empid = request.getParameter("empid");
        int empID = 0;
        if (empid != null && !empid.isEmpty()) {
            try {
                empID = Integer.parseInt(empid);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }

        String from = request.getParameter("from");
        String to = request.getParameter("to");
        String type = request.getParameter("type");
        String reason = request.getParameter("reason");

        Leave leave = new Leave();
        leave.setEmpid(empID);
        leave.setFrom(from);
        leave.setTo(to);
        leave.setType(type);
        leave.setReason(reason);

        LeaveDB leaveDB = new LeaveDB();
        leaveDB.leaveEmp(leave);
        request.setAttribute("empid", empid);
        

        request.getRequestDispatcher("Employees/Leave.jsp").forward(request, response);
    }

   
    
}
