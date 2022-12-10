package com.greatlearning.techdept;
import com.greatlearning.superdept.*;
public class Techdept extends Superdept {

	private String TechStackInformation;
	//Assign the values to all the private members of Tech dept
	public Techdept()
	{
		this.setdepartmentName("Tech Department");
		this.setTodaysWork("Complete coding of module 1");
		this.setTodaysWork("Complete by EOD");
		this.TechStackInformation="core Java";
	}
	//getting the stack information from Tech department
	public String getTechStackInformation() {
		return TechStackInformation;
	}
	//Setting tech stack information
	public void setTechStackInformation(String techStackInformation) {
		TechStackInformation = techStackInformation;
	}
	//Fetching the required data of Tech deparment
	@Override
	public String toString() {
		return "Department Details"
				+ "\n==================\nDepartment Name       :" 
				+ departmentName() 
				+ "\nTodaysWork            :" 
				+ getTodaysWork()
				+ "\nWorkDeadline          :" 
				+ getWorkDeadline()
				+ "\nTech stack information:"
				+ getTechStackInformation();
	}
	
	
}
