package com.office.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.office.Connect;

public class AdminLeaveStatusDB {
    public void setStatus(String Status,Integer empID) {
        Connection con = Connect.getConnection();

        String sql = "UPDATE Leave SET status = ? WHERE empid = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,Status);
            ps.setInt(2, empID);
            ps.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
