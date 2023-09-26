package com.office.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.office.Connect;
import com.office.model.Employee;

public class AdmEditEmpDb {
	public void editEmployee(Employee employee) {
			try {
				Connection con = Connect.getConnection();
				 String sql = "UPDATE Employees SET  Emp_Name = ?, DOB =? , Qualification = ? , Phone_Number = ?, Email =? ,"
						 +"Years_of_Experience = ?, Previous_Company_Name =? , Address=? , Date_of_Joining =? , Department =? "
						 +"	WHERE Emp_Id = ?";
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

		            preparedStatement.setInt(11, employee.getEmpid());
		            
		            if(preparedStatement.executeUpdate()>0){
		            	System.out.println("edited");
		            }
		            else {
		            	System.out.println("not edited");
		            }
		        
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
	}
}
