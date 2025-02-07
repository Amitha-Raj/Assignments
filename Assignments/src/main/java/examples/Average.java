package examples;

import java.lang.foreign.ValueLayout.OfBoolean;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Average a =new Average();
		a.average(2,3,4);
		a.average(2.3f, 3.4f, 3.5f);

	}
	void average(int a,int b,int c) {
		int sum=a+b+c;
		int avg=sum/3;
		System.out.println("Average of Number is "+avg);
	}
	void average(float a,float b,float c) {
		float sum=a+b+c;
		float avg=sum/3;
		System.out.println("Average of Number is "+avg);
	}

}
