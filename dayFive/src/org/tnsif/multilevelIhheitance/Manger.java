package org.tnsif.multilevelIhheitance;
//parents class
public class Manger {
	private String deptname;
	private String name;
	private int empId;
	
	//getter and setter
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	@Override
	public String toString() {
		return "Manger [deptname=" + deptname + ", name=" + name + ", empId=" + empId + "]";
	}
	public Manger(String deptname, String name, int empId) {
		super();
		this.deptname = deptname;
		this.name = name;
		this.empId = empId;
	}
	
	
	
	
	

}
