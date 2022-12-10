package com.greatlearning.main;
import com.greatlearning.admindept.Admindept;
import com.greatlearning.hrdept.*;
import com.greatlearning.superdept.Superdept;
import com.greatlearning.techdept.*;
public class Driverclass {

	//This is driver class all objects are created
	//and required  functions invoked in this class
	public static void main(String[] args) {
		
		//Create an object of Superdept
		Superdept superdept = new Superdept();
		//Invoke the function showdetails() in Superdept class
		//prints out the details of the Super department
		superdept.showdetails();
		System.out.println("----------------------------------------------------");
		
		//Create an object of Admindept
		Admindept admin = new Admindept();	
		
		//Invoke the function showdetails() in Admindept
		//which overrides the Superdept
		//prints out the details of the admin department
		admin.showdetails();
		
		System.out.println("----------------------------------------------------");

		//Create an object of Hrdept
		Hrdept hr       = new Hrdept();
		
		//Invoke the function showdetails() in Hrdept
		//which overrides the Superdept
		//prints out the details of the hr department
		hr.showdetails();
		
		System.out.println("----------------------------------------------------");

		//Create an object of Techdept		
		Techdept tech = new Techdept();
		
		//Invoke the function showdetails() in Techdept
		//which overrides the Superdept
		//prints out the details of the hr department		
		tech.showdetails();
		System.out.println("----------------------------------------------------");

		
		
	}

}
