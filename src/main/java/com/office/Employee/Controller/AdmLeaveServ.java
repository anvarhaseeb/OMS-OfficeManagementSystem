package com.office.Employee.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.office.Connect;
import com.office.Employee.Model.Leave;

public class AdmLeaveServ {
	public List<Leave> leaveList(Integer empid) {
        Connection con = Connect.getConnection();
        String sql = "SELECT status,leaveid,leavetype, fromdate, todate,reason FROM Leave WHERE empid=?";

        List<Leave> leaveRecords = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, empid);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                Leave leaveRecord = new Leave();
                leaveRecord.setStatus(resultSet.getString("status"));
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
                
                leaveRecord.setLeaveid(resultSet.getInt("leaveid"));
                leaveRecord.setType(resultSet.getString("leavetype"));
                leaveRecord.setReason(resultSet.getString("reason"));
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
