package Assignment3;

import java.util.Scanner;


public class Shop {
	static Double total=0d;
	static boolean Discountapplied=false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shop.checkTotal();
		Double finalamount=Shop.checkDiscount();
		if(Discountapplied==true){
		  System.out.println("You have a discount!! and your amount to pay is "+finalamount);	
		}
		else {
			System.out.println("Your amount to pay is "+finalamount);
		}

	}
	
	public static void checkTotal() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of item purchased");
		int number=sc.nextInt();
		for(int i=1;i<=number;i++) {
			System.out.println("Enter the price of item "+i);
			float unitprice=sc.nextFloat();
			total=total+unitprice;
			
		}
		
		
	}
  public static Double checkDiscount() {
	  if(total>5000) {
		  total=total-(total*.2);
		  Discountapplied=true;
	  }
	  return total;
  }
}
