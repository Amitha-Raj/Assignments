package encapsulation;

import java.util.Scanner;

public class Bank {
	boolean flag=false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your 4 digit pin");
		int pin=scanner.nextInt();
		User user=new User();
		user.setPinnumber(pin);
		Bank bank=new Bank();
		bank.validatepin(user.getPinnumber());
		

	}
   public void validatepin(int pin) {
	   
	  int  validpin[]= {1001,1234,1212};
	  for(int y:validpin) {
		  if(y==pin) {
			  System.out.println("Entered pin is correct");
			  flag=true;
		  }
		 
	  }
	  if(flag==false) {
		  System.out.println("Entered pin is incorrect");
	  }
	  
   }
}
