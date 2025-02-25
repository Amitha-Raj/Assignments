package assignment4;

public class Reverse {
	int number;
	int reverse=0;
	
	public Reverse(int number) {
		
		this.number=number;
		while(number>0) {
			int n=number%10;
			reverse=reverse*10+n;
			number=number/10;
			
		}
		
	}
    public Reverse() {
    	this(129);
    	System.out.println("Reverse of number is "+reverse);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse rever=new Reverse();

	}

}
