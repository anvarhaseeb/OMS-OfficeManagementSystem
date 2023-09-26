package com.office.Salary.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.office.Connect;
import com.office.Salary.Model.Salary;


public class salaryDisplayDB {
	
	 public List<Salary> fromSalary(int empID) {
	        List<Salary> salaryList = new ArrayList<>();
	        Connection con = Connect.getConnection();
	        String sql = "SELECT salary_id, bonus, S_Date, amount FROM E_Salary WHERE emp_id='" + empID + "'";


	        try {
	            PreparedStatement ps = con.prepareStatement(sql);
	            ResultSet resultSet = ps.executeQuery();

	            while (resultSet.next()) {
	                int salary_id = resultSet.getInt("salary_id");
	                int bonus = resultSet.getInt("bonus");
	                String S_Date = resultSet.getString("S_Date");
	                int amount = resultSet.getInt("amount");

	                Salary s = new Salary();
	                s.setEmpid(empID);
	                s.setSalary_id(salary_id);
	                s.setBonus(bonus);
	                s.setSDate(S_Date);
	                s.setAmount(amount);

	                salaryList.add(s);
	            }

	            con.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return salaryList;
	    }
}
