package abstractionexample;

public class FulltimeEmployee extends Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contractor contractor=new Contractor();
		FulltimeEmployee fulltimeEmployee=new FulltimeEmployee();
		contractor.calculateSalary();
		fulltimeEmployee.calculateSalary();

	}

	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		System.out.println("The salary for full time employee is "+(1200*8));
		
	}

}
