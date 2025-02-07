package examples;

import java.util.Scanner;

public class Student {
	String name;
	int age;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student a=new Student();
		Student b=new Student();
		

		
	    a.printData();
	    b.printData();
		

	}
	public Student() {
		
		System.out.print("Enter your Name");
		Scanner sc= new Scanner(System.in);
		name=sc.next();
		System.out.print("Enter your Age");
		age=sc.nextInt();
		
	}
	
	
	 void readData() {
		System.out.print("Enter your Name ");
		Scanner sc= new Scanner(System.in);
		name=sc.next();
		System.out.print("Enter your Age ");
		age=sc.nextInt();
		printData(); 
		
	}
	void printData() {
		System.out.println("Name "+name );
		System.out.println("Age "+age);
	}

}
