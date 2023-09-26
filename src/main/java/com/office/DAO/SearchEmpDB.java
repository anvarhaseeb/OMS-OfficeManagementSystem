package com.office.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.office.Connect;
import com.office.model.Employee;

public class SearchEmpDB {

    public List<Employee> EmpSearch(Employee employee) {
        List<Employee> searchResults = new ArrayList<>();
        Connection con = Connect.getConnection();
        if (con == null) {
            System.out.println("Database connection failed.");
        }

        try {
            StringBuilder sql = new StringBuilder("SELECT * FROM Employees WHERE 1=1");

            if (employee.getEmpid() != 0) {
                sql.append(" AND Emp_Id = ?");
            }
            if (employee.getEmpname() != null && !employee.getEmpname().isEmpty()) {
                sql.append(" AND Emp_Name LIKE ?");
            }
            if (employee.getDob() != null && !employee.getDob().isEmpty()) {
                sql.append(" AND DOB LIKE ?");
            }
            if (employee.getQlf() != null && !employee.getQlf().isEmpty()) {
                sql.append(" AND Qualification LIKE ?");
            }
            if (employee.getPhn() != null && !employee.getPhn().isEmpty()) {
                sql.append(" AND Phone_Number LIKE ?");
            }
            if (employee.getEmail() != null && !employee.getEmail().isEmpty()) {
                sql.append(" AND Email LIKE ?");
            }
            if (employee.getExp() != 0) {
                sql.append(" AND Years_of_Experience = ?");
            }
            if (employee.getCmpname() != null && !employee.getCmpname().isEmpty()) {
                sql.append(" AND Previous_Company_Name LIKE ?");
            }
            if (employee.getAdd() != null && !employee.getAdd().isEmpty()) {
                sql.append(" AND Address LIKE ?");
            }
            if (employee.getDoj() != null && !employee.getDoj().isEmpty()) {
                sql.append(" AND Date_of_Joining LIKE ?");
            }
            if (employee.getDept() != null && !employee.getDept().isEmpty()) {
                sql.append(" AND Department LIKE ?");
            }

            PreparedStatement preparedStatement = con.prepareStatement(sql.toString());

            int parameterIndex = 1;
            if (employee.getEmpid() != 0) {
                preparedStatement.setInt(parameterIndex++, employee.getEmpid());
            }
            if (employee.getEmpname() != null && !employee.getEmpname().isEmpty()) {
                preparedStatement.setString(parameterIndex++, "%" + employee.getEmpname() + "%");
            }
            if (employee.getDob() != null && !employee.getDob().isEmpty()) {
                preparedStatement.setString(parameterIndex++, "%" + employee.getDob() + "%");
            }
            if (employee.getQlf() != null && !employee.getQlf().isEmpty()) {
                preparedStatement.setString(parameterIndex++, "%" + employee.getQlf() + "%");
            }
            if (employee.getPhn() != null && !employee.getPhn().isEmpty()) {
                preparedStatement.setString(parameterIndex++, "%" + employee.getPhn() + "%");
            }
            if (employee.getEmail() != null && !employee.getEmail().isEmpty()) {
                preparedStatement.setString(parameterIndex++, "%" + employee.getEmail() + "%");
            }
            if (employee.getExp() != 0) {
                preparedStatement.setInt(parameterIndex++, employee.getExp());
            }
            if (employee.getCmpname() != null && !employee.getCmpname().isEmpty()) {
                preparedStatement.setString(parameterIndex++, "%" + employee.getCmpname() + "%");
            }
            if (employee.getAdd() != null && !employee.getAdd().isEmpty()) {
                preparedStatement.setString(parameterIndex++, "%" + employee.getAdd() + "%");
            }
            if (employee.getDoj() != null && !employee.getDoj().isEmpty()) {
                preparedStatement.setString(parameterIndex++, "%" + employee.getDoj() + "%");
            }
            if (employee.getDept() != null && !employee.getDept().isEmpty()) {
                preparedStatement.setString(parameterIndex++, "%" + employee.getDept() + "%");
            }

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Employee emps = new Employee();
                emps.setEmpid(resultSet.getInt("Emp_Id"));
                emps.setEmpname(resultSet.getString("Emp_Name"));
                emps.setDob(resultSet.getString("DOB"));
                emps.setQlf(resultSet.getString("Qualification"));
                emps.setPhn(resultSet.getString("Phone_Number"));
                emps.setEmail(resultSet.getString("Email"));
                emps.setExp(resultSet.getInt("Years_of_Experience"));
                emps.setCmpname(resultSet.getString("Previous_Company_Name"));
                emps.setAdd(resultSet.getString("Address"));
                emps.setDoj(resultSet.getString("Date_of_Joining"));
                emps.setDept(resultSet.getString("Department"));
                searchResults.add(emps);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("SQL Exception: " + e.getMessage());
        }

        return searchResults;
    }
}
