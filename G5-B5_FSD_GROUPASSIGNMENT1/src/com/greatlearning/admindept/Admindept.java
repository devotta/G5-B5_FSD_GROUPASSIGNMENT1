package com.greatlearning.admindept;
import com.greatlearning.superdept.*;
public class Admindept extends Superdept {
 
//Initialize the data members in Admindept constructor
public Admindept()
 {
	  
	 this.setdepartmentName("Admin Department");
	 this.setTodaysWork("Complete your documents Submission");
	 this.setWorkDeadline("Complete by EOD");
	 this.setTodayAHoliday("");
 }


@Override
//Fetches the details of the required values of Admindept
public String toString() {
	return "Department Details\n==================\nDepartment Name :" + departmentName() + "\nTodaysWork      :" + getTodaysWork()
			+ "\nWorkDeadline    :" + getWorkDeadline();
}
}
