package assignment4;

public class Palindrome {
	String stringtocheck;
	
	public Palindrome(String a) {
		this.stringtocheck=a;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome p1=new Palindrome("java");
		Palindrome p2=new Palindrome("Malayalam");
		p1.checkpalindrome();
		p2.checkpalindrome();

	}
   public void checkpalindrome() {
	   String reverseString="";
	   for(int i=stringtocheck.length()-1;i>=0;i--) {
		   reverseString=reverseString+ stringtocheck.charAt(i);
	   
        }
	   
	   if(stringtocheck.equalsIgnoreCase(reverseString)) {
		   System.out.println(stringtocheck +" is a Palindrome");
	   }
	   else {
		   System.out.println(stringtocheck +" is not a Palindrome");
	   }
    }
}
