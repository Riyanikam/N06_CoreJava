package org.tnsif.multilevelIhheitance;

public class Teamlead extends Manger {

	private String leadName;
	private String projectName;
	
	public String getLeadName() {
		return leadName;
	}
		public void setLeadName(String leadName) {
		this.leadName = leadName;
	}
		public String getProjectName() {
		return projectName;
	}

		public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

		public Teamlead(String deptname, String name, int empId,String leadName,String projectName) {
		super(deptname, name, empId);
		this.leadName=leadName;
		this.projectName=projectName;
		
	}

	@Override
	public String toString() {
		return "Teamlead [leadName=" + leadName + ", projectName=" + projectName + ", toString()=" + super.toString()
				+ "]";
	}
	
	

}
