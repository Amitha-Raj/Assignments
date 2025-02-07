package Assignment3;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number");
     int number=sc.nextInt();
     Factorial.checkfactorial(number);
	}
    
	static void checkfactorial(int number) {
		 int factorial=1;
	     for(int i=1;i<=number;i++) {
	    	 factorial=factorial*i;
	     }
	     System.out.println("Factorial of number="+factorial);
		}
	
		
	

}
