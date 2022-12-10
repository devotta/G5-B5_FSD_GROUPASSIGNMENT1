package com.greatlearning.hrdept;
import com.greatlearning.superdept.*;

public class Hrdept extends Superdept {
	 //Additional data memmber doActivity for Hrdept
	 private String doActivity;
	
	//Initialize the data members in Hrdept constructor
	 public Hrdept()
	 {
	 this.setdepartmentName("Hr Department");
	 this.setTodaysWork("Fill today’s timesheet and mark your attendance");
	 this.setWorkDeadline("Complete by EOD");
	 this.setTodayAHoliday("");
	 this.doActivity="Team Lunch";
	 }
	//This function returns the doActivity value
	public String getActivity() {
		return doActivity;
	}
	//This function sets the setActivity passed in the parameter
	public void setActivity(String activity) {
		this.doActivity = activity;
	}

	//Fetches the required details of Hrdept
	@Override
	public String toString() {
		return "Department Details\n==================\n"
				+ "Department Name :" + departmentName() 
				+ "\nTodaysWork      :" + getTodaysWork()
				+ "\nWorkDeadline    :" + getWorkDeadline()
				+ "\ndoActivity      :" + getActivity() ;
	}

	
	

}


