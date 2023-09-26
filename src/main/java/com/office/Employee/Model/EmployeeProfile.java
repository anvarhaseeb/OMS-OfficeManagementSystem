package com.office.Employee.Model;

public class EmployeeProfile {
	 private int empId;
	    private String empName;
	    private String dob;
	    private String qualification;
	    private String phoneNumber;
	    private String email;
	    private int yearsOfExperience;
	    private String previousCompanyName;
	    private String address;
	    private String dateOfJoining;
	    private String department;
	    private int salary;
	    private int bonus;
	    private String sDate;
		public int getEmpId() {
			return empId;
		}
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		public String getEmpName() {
			return empName;
		}
		
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public String getDob() {
			return dob;
		}
		public void setDob(String dob) {
			this.dob = dob;
		}
		public String getQualification() {
			return qualification;
		}
		public void setQualification(String qualification) {
			this.qualification = qualification;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public int getYearsOfExperience() {
			return yearsOfExperience;
		}
		public void setYearsOfExperience(int yearsOfExperience) {
			this.yearsOfExperience = yearsOfExperience;
		}
		public String getPreviousCompanyName() {
			return previousCompanyName;
		}
		public void setPreviousCompanyName(String previousCompanyName) {
			this.previousCompanyName = previousCompanyName;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getDateOfJoining() {
			return dateOfJoining;
		}
		public void setDateOfJoining(String dateOfJoining) {
			this.dateOfJoining = dateOfJoining;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		public int getBonus() {
			return bonus;
		}
		public void setBonus(int bonus) {
			this.bonus = bonus;
		}
		public String getsDate() {
			return sDate;
		}
		public void setSDate(String sDate) {
			this.sDate = sDate;
		}
	    
		@Override
		public String toString() {
			return "EmployeeProfile [empId=" + empId + ", empName=" + empName + ", dob=" + dob + ", qualification="
					+ qualification + ", phoneNumber=" + phoneNumber + ", email=" + email + ", yearsOfExperience="
					+ yearsOfExperience + ", previousCompanyName=" + previousCompanyName + ", address=" + address
					+ ", dateOfJoining=" + dateOfJoining + ", department=" + department + ", salary=" + salary
					+ ", bonus=" + bonus + ", sDate=" + sDate + "]";
		}
}
