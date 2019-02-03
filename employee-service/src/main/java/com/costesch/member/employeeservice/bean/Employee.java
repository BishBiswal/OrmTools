package com.costesch.member.employeeservice.bean;

public class Employee {
	private int empid;
	private int empname;
	private int desig;
	public Employee(int empid, int empname, int desig) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.desig = desig;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public int getEmpname() {
		return empname;
	}
	public void setEmpname(int empname) {
		this.empname = empname;
	}
	public int getDesig() {
		return desig;
	}
	public void setDesig(int desig) {
		this.desig = desig;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", desig=" + desig + "]";
	}
	

}
