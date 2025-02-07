package Assignment3;

import java.util.Scanner;

public class EligibilityCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Age of the Candidate");
		Scanner sc= new Scanner(System.in);
		boolean result=EligibilityCheck.checkEligibility(sc.nextInt());
		if(result==true)
			System.out.println("Elgibile for Voting");
		else
			System.out.println("Not Elgibile for Voting");

	}
	static boolean checkEligibility(int age) {
		if(age>=18) {
			return true;
		}
		else {
			return false;
		}
	}

}
