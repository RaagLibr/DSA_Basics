package com.enfy.constructor4;

public class EncapsulationDemo {
	private int ssn;
	private String emp_name;
	private int emp_age;
	
	
	public int getssn() {
		return ssn;
	}
	public void setssn(int ssn) {
		this.ssn = ssn;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public int getEmp_age() {
		return emp_age;
	}
	public void setEmp_age(int emp_age) {
		this.emp_age = emp_age;
	}
	
	
	public static void main(String[] args) {
		EncapsulationDemo ed = new EncapsulationDemo();
		ed.setEmp_age(55);
		ed.setEmp_name("Ragini");
		ed.setssn(111233);
		System.out.println("get age = "+ed.getEmp_age());
		System.out.println("get name = "+ed.getEmp_name());
		System.out.println("get ssn = "+ed.getssn());
	}
	
	
}
