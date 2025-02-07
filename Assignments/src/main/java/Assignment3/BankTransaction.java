package Assignment3;

import java.util.Scanner;

public class BankTransaction {
    static float currentbalance;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankTransaction.banking();
		
	}
	static void banking() {
		
		System.out.println("Enter yout choice 1.deposit 2.Withdraw 3.Exit");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		
		switch(choice){
		case 1: System.out.println("Enter the amount to deposit");
		        float depositamount=sc.nextInt();	
		        BankTransaction.deposit(depositamount);
		        break;
		case 2: System.out.println("Enter the amount to withdraw");	
		        float withdraw=sc.nextInt();
		        BankTransaction.withdraw(withdraw);
		         break;
		         
		case 3:System.out.println("Thank you for Transaction");
			   break;    
		}
		
	}
		
		

	
	 static void deposit(float depositamount) {
		
		
		currentbalance=currentbalance+depositamount;
		BankTransaction.printBalance();
		BankTransaction.banking();
		
		
	}
	static void withdraw(float withdraw) {
		if(withdraw<currentbalance)
		currentbalance=currentbalance-withdraw;
		else
			System.out.println("No Sufficient fund to withdraw");
		
		BankTransaction.printBalance();
		BankTransaction.banking();
		
		
	}
	static void printBalance() {
		System.out.println("Balance Amount ="+currentbalance );
		
		
	}

}
