package com.office.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.office.Connect;
import com.office.model.LoginEmployee;

public class EmpLogin {
	
   
	public boolean checkuname(String uname) throws SQLException {
		Connection con = Connect.getConnection();
        String sql = "SELECT COUNT(*) FROM login WHERE uname = ?";
        
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        preparedStatement.setString(1, uname);
        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();
        int count = resultSet.getInt(1);
        return count > 0;
    }
	
	public void emplogin(LoginEmployee logEmp){

		try {
			Connection con = Connect.getConnection();
			
			String sql = "INSERT INTO login(empid,uname,password,type)"+"VALUES(?,?,?,?)";
			PreparedStatement preparedStatement = con.prepareStatement(sql);

			preparedStatement.setInt(1, logEmp.getId());
			preparedStatement.setString(2, logEmp.getUname());
			preparedStatement.setString(3, logEmp.getPassword());
			preparedStatement.setString(4, logEmp.getType());
			if(preparedStatement.executeUpdate()>0){
				System.out.println("login emp data inserted");
			}
			else {
				System.out.println("not inserted,the login emp data");
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
}