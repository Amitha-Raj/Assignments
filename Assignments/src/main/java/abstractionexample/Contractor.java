package abstractionexample;

import java.util.Scanner;

public class Contractor extends Employee{
	
@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of working hours for the contractor");
		float a=scanner.nextFloat();
		float salary = 1200*a;
		System.out.println("The Salary for contractor is "+salary);
		
	}

}
