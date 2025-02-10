package assignment4;

import java.util.Scanner;

public class Average {
  
    float totalamount;
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		float n1,n2,n3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 integers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		Average objAverage=new Average(a,b,c);
		objAverage.checkAverage();
		System.out.println("Enter 3 floating numbers");
        n1=sc.nextFloat();
        n2=sc.nextFloat();
        n3=sc.nextFloat();
        Average obj =new Average(n1, n2, n3);
        obj.checkAverage();
	}
    
    void  checkAverage() {
    	float average=totalamount/3;
    	System.out.println("Average is = "+average);
    }
    public Average(int a,int b, int c) {
    	totalamount=a+b+c;
    }
    public Average(float a,float b, float c) {
    	 totalamount=a+b+c;
    }
    
}
