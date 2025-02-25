package override;

import javax.management.remote.SubjectDelegationPermission;

public class OnSeason extends Offseason {

	public static void main(String[] args) {
		// TODO Auto-generated method stud
		OnSeason onSeason=new OnSeason();
		Offseason offseason=new Offseason();
		offseason.checkDiscount(2000);
		onSeason.checkDiscount(2000);
		

	}
	@Override
	public void checkDiscount(float totalamount) {
		float discount=totalamount*.4f;
		System.out.println("Discount on onseason is "+discount);
		
	}

}
