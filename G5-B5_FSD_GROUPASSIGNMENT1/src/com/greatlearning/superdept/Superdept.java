package com.greatlearning.superdept;

public class Superdept {
	private String deptName;
	private String todaysWork;
	private String workDeadline;
	private String todayaHoliday;
	//Assigning the Superdept constructor assign the required value
	//for all data members
	public Superdept()
	{
		this.deptName 		= "Super Department";
		this.todaysWork  	= "No Work as of now";
		this.workDeadline 	= "Nil";
		this.todayaHoliday  = "Today is not a holiday";

	}
	//Fetches the department
	public String departmentName() {
		return deptName;
	}
	//Sets the department name 
	public void setdepartmentName(String deptName) {
		this.deptName = deptName;
	}
	//This function returns the todaysWork
	public String getTodaysWork() {
		return todaysWork;	
	}
	//This function sets TodaysWork
	public void setTodaysWork(String todaysWork) {
		this.todaysWork = todaysWork;
	}
	//The function returns the WorkDeadline
	public String getWorkDeadline() {
		return workDeadline;
	}
	//The function sets the Work Deadline
	public void setWorkDeadline(String workDeadline) {
		this.workDeadline = workDeadline;
	}
	//The function returns the TodayAHoliday
	public String getTodayAHoliday() {
		return todayaHoliday;
	}
	//This function allow to set the value for todayaholiday  
	public void setTodayAHoliday(String todayaHoliday) {
		this.todayaHoliday = todayaHoliday;
	}
	//This function will show the details of the superclass 
	public void showdetails()
	{
		System.out.println(this.toString());
	}
	
	//Fetch values related to Super class
	@Override
	public String toString() {
		return "Department Details\n==================\n"
				+ "Department Name :" + departmentName() 
				+ "\nTodaysWork      :" + getTodaysWork()
				+ "\nWorkDeadline    :" + getWorkDeadline()
				+ "\nisTodayAHoliday :" + getTodayAHoliday() ;
		
	}
	
	
}
