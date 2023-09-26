package com.office.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.office.Connect;
import com.office.model.Department;

public class DeptFromDB {
    public List<Department> FromDept() {
        List<Department> deptList = new ArrayList<>();
        Connection con = Connect.getConnection();

        String sql = "SELECT id, deptname FROM Department";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String name = resultSet.getString("deptname");

                Department d = new Department();
                d.setId(id);
                d.setDeptname(name);

                deptList.add(d);
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return deptList;
    }
}
