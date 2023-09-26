package com.office.DAO;

import com.office.model.Department;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.office.Connect;

public class DeptAddDB {
	
	public void Deptadd(Department dept) {
    Connection con = Connect.getConnection();
    String sql = "INSERT INTO Department (id, deptname) " +
            "VALUES (?, ?)";
try {
	PreparedStatement ps = con.prepareStatement(sql);
	ps.setString(1,dept.getId());
	ps.setString(2,dept.getDeptname());
	ps.executeUpdate();
}
catch(SQLException e) {
	e.printStackTrace();
		}
}
}
