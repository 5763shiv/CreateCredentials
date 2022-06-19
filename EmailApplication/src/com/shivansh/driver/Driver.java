package com.shivansh.driver;
import java.util.Scanner;

import com.shivansh.model.Employee;

public class Driver {

	
	public static void main(String[] args) 
	{
		
		String technicalDepart="Technical Department";
		String adminDepart="Admin";
		String hrDepart="Human Resource";
		String legalDepart="Legal";
		
		System.out.println("Enter Department Number");
		System.out.println("1. "+technicalDepart);
		System.out.println("2. "+adminDepart);
		System.out.println("3. "+hrDepart);
		System.out.println("4. "+legalDepart);

		Scanner obj = new Scanner(System.in);
		int departmentNum = obj.nextInt();
		
		String Department="";
		if(departmentNum ==1)
			Department=technicalDepart;
		if(departmentNum ==2)
			Department=adminDepart;
		if(departmentNum ==3)
			Department=hrDepart;
		if(departmentNum ==4)
			Department=legalDepart;
		
		if(Department =="")
			System.out.println("Please enter valid department number");	
		else {
		
		Employee emp = new Employee("Shivansh","Rajput",Department);
		emp.ShowCredential();
		}
		
	}
	
}
