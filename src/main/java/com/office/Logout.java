package com.office;
import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Logouts")
public class Logout extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		HttpSession session=  request.getSession();
	
		System.out.println("Logout");
		session.removeAttribute("username");
		session.invalidate();
		response.sendRedirect("Office.jsp");
	}
}