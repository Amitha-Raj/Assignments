package Assignment3;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        String s1=sc.next();
        String reverse= Palindrome.reverseString(s1);
        Palindrome.palindromeCheck(s1, reverse);
        

	}
	static String reverseString(String s1) {
		String s1reverse="";
		 for(int i=s1.length()-1;i>=0;i--){

	          char c=s1.charAt(i);

	            
	            s1reverse=s1reverse.concat(String.valueOf(c));

	        }
		 return s1reverse;
		
	}
	
	static void palindromeCheck(String actual, String reverse) {
		if(actual.equalsIgnoreCase(reverse)){
            System.out.println("The given string is Palindrome");
        }
        else{
          System.out.println("The given string is not a Palindrome");
        }
	}

}
