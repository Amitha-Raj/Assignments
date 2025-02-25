package inheritance2;

import java.util.Scanner;

public class Class1 {
	
	public int checkSum() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number1");
		int number1=scanner.nextInt();
		System.out.println("Enter the number2");
		int number2=scanner.nextInt();
		return(number1+number2);
		
	}

}
