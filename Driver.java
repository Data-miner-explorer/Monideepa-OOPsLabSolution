package com.greatlearning.main;
import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialsService;
import java.util.Scanner;


public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter first name");
		String firstName=sc.next();
		System.out.println("Please enter last name");
		String lastName=sc.next();
		System.out.println("Please enter the department(1-4) from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		int dept= sc.nextInt();
		
		String department;
		switch(dept) {
		case 1:
			department="tech";
			break;
		case 2:
			department="adm";
			break;
		case 3:
			department="hr";
			break;
		case 4:
			department="lg";
			break;
		default:
			System.out.println("incorrect choice");
			return;
			
		}
		
		Employee emp=new Employee(firstName,lastName,department);
		CredentialsService cs=new CredentialsService();
		String email=cs.generateEmailAddress(emp);
		//System.out.println("email: "+email);
		String password=cs.generatePassword();
		//System.out.println("password: "+password);
		cs.showCredentials(emp, email, password);
		
		
		
	}

}
