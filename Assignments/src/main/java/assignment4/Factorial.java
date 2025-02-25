package assignment4;

import java.util.Scanner;

public class Factorial {
	int factorial=1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=scanner.nextInt();
		Factorial factorial=new Factorial();
		factorial.calculateFactorial(number);
		factorial.display();
		

	}
	public void calculateFactorial(int number) {
		for(int i=1;i<=number;i++) {
			
			factorial=factorial*i;
		}
		
	}
	public void display() {
		System.out.println("Factorial of Number is "+factorial);
		
	}

}
