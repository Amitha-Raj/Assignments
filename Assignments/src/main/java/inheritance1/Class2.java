package inheritance1;

public class Class2 extends class1{
	public float hra;
	public float pf;
	
	public void getHra() {
		getSalaryDetails();
		hra=0.05f*basicpay;
		
	}
	public void getPf() {
		pf=0.2f*basicpay;
		
	}

}
