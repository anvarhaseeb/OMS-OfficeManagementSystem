package com.office.Employee.Model;

public class Leave {
	private int leaveid;
private int empid;
private String from;
private String to;
private String type;
private String reason;
private String status;

public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getFrom() {
	return from;
}
public void setFrom(String from) {
	this.from = from;
}
public String getTo() {
	return to;
}
public void setTo(String to) {
	this.to = to;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getReason() {
	return reason;
}
public void setReason(String reason) {
	this.reason = reason;
}
@Override
public String toString() {
	return "Leave [empid=" + empid + ", From=" + from + ", to=" + to + ", type=" + type + ", reason=" + reason + "]";
}
public int getLeaveid() {
	return leaveid;
}
public void setLeaveid(int leaveid) {
	this.leaveid = leaveid;
}

}
