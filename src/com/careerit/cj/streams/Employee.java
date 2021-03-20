package com.careerit.cj.streams;
public class Employee{

	private int empno;
	private String name;
	private int yearsOfExp;
	private String dept;
	public Employee(int empno, String name, int yearsOfExp,String dept) {
		super();
		this.empno = empno;
		this.name = name;
		this.yearsOfExp = yearsOfExp;
		this.setDept(dept);
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYearsOfExp() {
		return yearsOfExp;
	}
	public void setYearsOfExp(int yearsOfExp) {
		this.yearsOfExp = yearsOfExp;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return String.format("Employee [empno=%s, name=%s, yearsOfExp=%s, dept=%s]", empno, name, yearsOfExp, dept);
	}
	
	
	
	
}