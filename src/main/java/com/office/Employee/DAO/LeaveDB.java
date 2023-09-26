package com.office.Employee.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.office.Connect;
import com.office.Employee.Model.Leave;

public class LeaveDB {
    public void leaveEmp(Leave leave) {
        Connection con = Connect.getConnection();

        String sql = "INSERT INTO Leave (empid, fromdate, todate, leavetype, reason, status) " +
                "VALUES (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, leave.getEmpid());
            ps.setString(2, leave.getFrom());
            ps.setString(3, leave.getTo());
            ps.setString(4, leave.getType());
            ps.setString(5, leave.getReason());
            ps.setString(6, "P"); 

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Leave> leaveStatus(Integer empid) {
        Connection con = Connect.getConnection();
        String sql = "SELECT status, fromdate, todate FROM Leave WHERE empid=?";

        List<Leave> leaveRecords = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, empid);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                Leave leaveRecord = new Leave();
                if(resultSet.getString("status").equals("P"))
                {
                	leaveRecord.setStatus("Pending");
                }
                if(resultSet.getString("status").equals("Y"))
                {
                	leaveRecord.setStatus("Approved");
                }
                if(resultSet.getString("status").equals("N"))
                {
                	leaveRecord.setStatus("Rejected");
                }
                
                leaveRecord.setFrom(resultSet.getDate("fromdate").toString());
                leaveRecord.setTo(resultSet.getDate("todate").toString());
                leaveRecords.add(leaveRecord);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return leaveRecords;
    }
}
