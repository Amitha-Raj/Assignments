package inheritance1;

import java.util.Scanner;

public class class1 {
    public float basicpay;
	public float deduction;
	public float bonus;
	public void getSalaryDetails() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the basic pay");
		basicpay=scanner.nextFloat();
		System.out.println("Enter the deduction from pay");
		deduction=scanner.nextFloat();
		System.out.println("Enter the bonus");
		bonus=scanner.nextFloat();
		
	}

}
