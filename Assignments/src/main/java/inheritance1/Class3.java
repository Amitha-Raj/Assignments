package inheritance1;

public class Class3 extends Class2{
	public float totalSalarybyHand;

	public static void main(String[] args) {
		
		Class3 class3=new Class3();
		class3.getSalaray();
		class3.getSalarySlip();
		// TODO Auto-generated method stub
       
	}
	public void getSalaray() {
		getHra();
		getPf();
		totalSalarybyHand=basicpay+hra-pf-deduction+bonus;
	}
	public void getSalarySlip() {
		System.out.println("Salary Slip");
		System.out.println("Basic Pay "+basicpay);
		System.out.println("Deduction "+deduction);
		System.out.println("Bonus "+bonus);	
		System.out.println("Hra "+hra);
		System.out.println("PF "+pf);
		System.out.println("Total Salary in Hand "+totalSalarybyHand);
		
	}

}
