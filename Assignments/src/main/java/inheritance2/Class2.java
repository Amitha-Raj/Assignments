package inheritance2;

import inheritance1.class1;

public class Class2  extends Class1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Class2 class2=new Class2();
       class2.checkDivisible();
	}
	public void checkDivisible() {
		int result=super.checkSum();
		if(result%10==0) {
			System.out.println("The sum is divisible by 10");
		}
		else {
			System.out.println("The sum is not divisible by 10");
		}
		
	}

}
