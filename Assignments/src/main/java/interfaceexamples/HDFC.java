package interfaceexamples;

import java.util.Scanner;

public class HDFC implements RBI{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC hdfc=new HDFC();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the amount you want to deplosit ");
		float amount=scanner.nextFloat();
		System.out.println("Enter the period you want to deplosit (in months) ");
		int duration=scanner.nextInt();
		hdfc.recurringDeposit(amount, duration);

	}

	@Override
	public void recurringDeposit(float amount, int duration) {
		// TODO Auto-generated method stub
		float returnamount=amount*interestrate*duration;
		System.out.println("You will get "+returnamount+"after duration of "+duration+ "months");
		
	}
	

}
