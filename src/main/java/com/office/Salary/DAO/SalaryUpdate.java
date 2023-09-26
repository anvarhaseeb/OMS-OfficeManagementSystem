package com.office.Salary.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.office.Connect;
import com.office.Salary.Model.Salary;

public class SalaryUpdate {
	public void SalaryAdd(Salary sal) {
		Connection con = Connect.getConnection();
		try {
			String sql = "INSERT INTO  E_Salary (emp_id, bonus, S_Date, amount) " +
					"VALUES (?, ?, ?, ?)";
			PreparedStatement preparedStatement = con.prepareStatement(sql);
	           System.out.println(sal);
            preparedStatement.setInt(1, sal.getEmpid());
            preparedStatement.setInt(2, sal.getBonus());
            preparedStatement.setString(3, sal.getSDate());
            preparedStatement.setInt(4, sal.getAmount());
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
	
		
		public void  SalaryEdit(Salary sal ) {
			Connection con = Connect.getConnection();
			try {	
			String sql="Update E_Salary set  amount=? ,bonus=?,S_Date=?"
						+" 	WHERE Emp_Id = ?";
				
				PreparedStatement preparedStatement = con.prepareStatement(sql);
				    preparedStatement.setInt(1, sal.getAmount());
				    preparedStatement.setInt(2, sal.getBonus());
		            preparedStatement.setString(3, sal.getSDate());           
		            preparedStatement.setInt(4, sal.getEmpid());
		            
		            if(preparedStatement.executeUpdate()>0){
		            	System.out.println("salary edited");
		            }
		            else {
		            	System.out.println(" salary not edited");
		            }
				}
				 catch(SQLException e) {
			        	e.printStackTrace();
			        }
		}
	}
