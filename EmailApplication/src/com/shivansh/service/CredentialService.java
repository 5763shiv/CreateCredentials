package com.shivansh.service;

import java.util.Random;

public class CredentialService {
	
	public String CreateEmail(String FirstName,String LastName,String Department)
	{
		String FinalEmail=FirstName+""+LastName+"@"+Department+".abc.com";
		return 	FinalEmail;
	}
	
	public char[] CreatePassword() {
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters="!@#$%^&*-=+-/.?<>)";
		String values = capitalLetters + smallLetters + numbers + specialCharacters;
		 Random random = new Random();
		 char[] password = new char[8];
		 for (int i = 0; i < 8;i++) {
			 password[i]= values.charAt(random.nextInt(values.length()));
		 }
		 return password;
		 
	}
	
}
