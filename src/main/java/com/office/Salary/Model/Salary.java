package com.office.Salary.Model;

public class Salary {
    private int salary_id;
    private int empid;
    private int bonus;
    private String SDate;
    private int amount;

    public int getSalary_id() {
        return salary_id;
    }

    public void setSalary_id(int salary_id) {
        this.salary_id = salary_id;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public String getSDate() {
        return SDate;
    }

    public void setSDate(String SDate) {
        this.SDate = SDate;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Salary [salary_id=" + salary_id + ", empid=" + empid + ", bonus=" + bonus + ", S_Date=" + SDate
                + ", amount=" + amount + "]";
    }
}
