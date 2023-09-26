package com.office.Employee.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.office.Connect;
import com.office.Employee.Model.EmployeeProfile;

public class Profile {
    public List<EmployeeProfile> viewProfile(Integer empId)
    {
        List<EmployeeProfile> profileList = new ArrayList<>();
        try {
            Connection con = Connect.getConnection();
            String sql = "SELECT E.Emp_Id, E.Emp_Name, E.DOB, E.Qualification, E.Phone_Number, E.Email, E.Years_of_Experience, E.Previous_Company_Name, E.Address, E.Date_of_Joining, E.Department, S.amount, S.bonus, S.S_Date "
                    + "FROM Employees E "
                    + "INNER JOIN E_Salary S "
                    + "ON E.Emp_Id = S.emp_id "
                    + "WHERE E.Emp_Id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, empId);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                EmployeeProfile profile = new EmployeeProfile();
                profile.setEmpId(rs.getInt("Emp_Id"));
                profile.setEmpName(rs.getString("Emp_Name"));
                profile.setDob(rs.getString("DOB"));
                profile.setQualification(rs.getString("Qualification"));
                profile.setPhoneNumber(rs.getString("Phone_Number"));
                profile.setEmail(rs.getString("Email"));
                profile.setYearsOfExperience(rs.getInt("Years_of_Experience"));
                profile.setPreviousCompanyName(rs.getString("Previous_Company_Name"));
                profile.setAddress(rs.getString("Address"));
                profile.setDateOfJoining(rs.getString("Date_of_Joining"));
                profile.setDepartment(rs.getString("Department"));
                profile.setSalary(rs.getInt("amount"));
                profile.setBonus(rs.getInt("bonus"));
                profile.setSDate(rs.getString("S_Date"));

                profileList.add(profile);
            }

            rs.close();
            ps.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return profileList;
    }
}
