package com.shivansh.model;

import com.shivansh.service.CredentialService;

public class Employee {

	private String firstName;
	private String lastName;
	private String emailId;
	private String password;
	private String department;
	public Employee(String firstName, String lastName,String department)
	{
		super();
		this.setFirstName(firstName);	
		this.setLastName(lastName);
		this.setDepartment(department);
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		CredentialService cr= new CredentialService(); 
		return cr.CreateEmail(this.firstName,this.lastName,this.department);
	}
	
	public char[] getPassword() {
		CredentialService cr= new CredentialService(); 
		return cr.CreatePassword();
	}
	
	public String getDepartment() {
		return firstName;
	}
	public void setDepartment(String department) {
		 this.department=department;
	}
	
	public void ShowCredential()
	{
		System.out.println("Dear "+this.firstName +" "+this.lastName+" Please check your credentials");
		System.out.println("Your Email is-"+this.getEmailId().toLowerCase());
		System.out.println("Your password is-"+this.getPassword());
	}
	
}
