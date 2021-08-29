package com.greatlearning.service;

import com.greatlearning.model.Employee;
import java.util.Random;

public class CredentialsService {

	public String generateEmailAddress(Employee emp) {
		String fname=emp.getFirstName();
		String lname=emp.getLastName();
		String dept=emp.getDepartment();
		String emailAdd=fname+lname+"."+dept+"@abc.com";
		return emailAdd;
	}
	public String generatePassword() {
		String allPossibleChars="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*_=+-/.?<>)";
		Random random= new Random();
		String passwd="";
		//first 4
		for (int i=1;i<=4;i++) {
			int idx= random.nextInt(allPossibleChars.length());
			passwd=passwd+allPossibleChars.charAt(idx);
		}
		String allCaps="ABCDEFGHIJKLMNOPQRSTMNOPQRSTUVWXYZ";
		int idx= random.nextInt(allCaps.length());
		passwd=passwd+allCaps.charAt(idx);
		
		String allSmall="abcdefghijklmnopqrstuvwxyz";
		int idx2= random.nextInt(allSmall.length());
		passwd=passwd+allSmall.charAt(idx2);
		
		String allNum="0123456789";
		int idx3= random.nextInt(allNum.length());
		passwd=passwd+allNum.charAt(idx3);
		
		String allSc="!@#$%^&*_=+-/.?<>)";
		int idx4= random.nextInt(allSc.length());
		passwd=passwd+allSc.charAt(idx4);
		
				
		return passwd;
		
		
	}
	public void showCredentials(Employee emp,String email, String password )
	{
		System.out.println( "Dear " + emp.getFirstName() + ", here are your credentials..." );
		System.out.println( "Email : " + email );
		System.out.println( "Password : " + password );
	}
}


