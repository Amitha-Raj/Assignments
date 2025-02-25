package exceptionexamples;

public class Votingmain {
	
public static void main (String args[]) {
		
		int age=2;
		try {
			if(age<0) {
				throw new VotingException("Invalid age");
			}
			else if(age<18) {
				throw new VotingException("Not eligible for voting");
			}
			System.out.println("Eligible for voting");
		}catch (VotingException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
