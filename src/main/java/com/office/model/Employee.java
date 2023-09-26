package com.office.model;

public class Employee {
   

	private int empid;
    private String empname;
    private String dob;
    private String qlf;
    private String phn;
    private String email;
    private int exp;
    private String cmpname;
    private String add;
    private String doj;
    private String dept;
    public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getQlf() {
		return qlf;
	}
	public void setQlf(String qlf) {
		this.qlf = qlf;
	}
	public String getPhn() {
		return phn;
	}
	public void setPhn(String phn) {
		this.phn = phn;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public String getCmpname() {
		return cmpname;
	}
	public void setCmpname(String cmpname) {
		this.cmpname = cmpname;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", dob=" + dob + ", qlf=" + qlf + ", phn=" + phn
				+ ", email=" + email + ", exp=" + exp + ", cmpname=" + cmpname + ", add=" + add + ", doj=" + doj
				+ ", dept=" + dept + "]";
	}
}
