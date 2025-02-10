package assignment4;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Area a =new Area();
	 a.choice();
	}
	void choice() {
		System.out.println("Enter your choice 1.Circle 2.Rectangle 3.square 4.Exit");
		Scanner sc=new Scanner(System.in);
		Area objArea=new Area();
		int choice=sc.nextInt();
		switch(choice) {
		
		case 1: System.out.println("Enter the radius of circle");
		        float radius=sc.nextFloat();
		        objArea.area(radius);
		        break;
		case 2:	 System.out.println("Enter the length and breadth of rectangle");
		         float length=sc.nextFloat();
		         float breadth=sc.nextFloat();
		         objArea.area(length, breadth);
		         break;
		case 3:	  System.out.println("Enter the side of square");
		          int side=sc.nextInt();
		          objArea.area(side);
		          break;
		case 4: System.out.println("Thank you");
		        break;
		        
		}
		
	}
	
	void area(float radius) {
		double area= 3.14*radius*radius;
		System.out.println("Area of circle is "+area);
		choice();
		
	}
	void area(float l,float b) {
		double area= l*b;
		System.out.println("Area of rectangle is "+area);
		choice();
		
	}
	void area(int side) {
		int area= side*side;
		System.out.println("Area of square is "+area);
		choice();
		
	}

}
