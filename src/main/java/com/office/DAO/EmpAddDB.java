package com.office.DAO;

import com.office.model.Employee;
import com.office.Connect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmpAddDB{
    public void AddEmps(Employee employee) {
    	Connection con = Connect.getConnection();

        try {
            String sql = "INSERT INTO Employees (Emp_Name, DOB, Qualification, Phone_Number, Email, Years_of_Experience, Previous_Company_Name, Address, Date_of_Joining, Department) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement preparedStatement = con.prepareStatement(sql);
           
            preparedStatement.setString(1, employee.getEmpname());
            preparedStatement.setString(2, employee.getDob());
            preparedStatement.setString(3, employee.getQlf());
            preparedStatement.setString(4, employee.getPhn());
            preparedStatement.setString(5, employee.getEmail());
            preparedStatement.setInt(6, employee.getExp());
            preparedStatement.setString(7, employee.getCmpname());
            preparedStatement.setString(8, employee.getAdd());
            preparedStatement.setString(9, employee.getDoj());
            preparedStatement.setString(10, employee.getDept());

            
            
            if(preparedStatement.executeUpdate()>0){
            	System.out.println("inserted");
            }
            else {
            	System.out.println("not inserted");
            }
        }
        catch(SQLException e) {
        	e.printStackTrace();
        }
       }
    }
