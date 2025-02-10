package assignment4;

import java.util.Scanner;

public class Grade {
	float eng,math,lang;
	
	public Grade(){
		System.out.println("Enter the marks for English,Math and Malayalam out of 30");
		Scanner sc= new Scanner(System.in);
		eng=sc.nextFloat();
		math=sc.nextFloat();
		lang=sc.nextFloat();
			
	}
	public float checkTotal() {
		float total=eng+math+lang;
		System.out.println(total);
		return total;
	}
	public void checkGrade(float totalmark) {

		if(totalmark<40){
			System.out.println("Sorry you are not able to clear the Exam");
		}
		else if (totalmark>=40 && totalmark<=60) {
			System.out.println("You have secured grade D");
		}
		else if (totalmark>=61 && totalmark <=70) {
			System.out.println("You have secured grade C");
		}
		else if (totalmark>=71 && totalmark <=80) {
			System.out.println("You have secured grade B");
		}
		else if (totalmark>=81 && totalmark <=90) {
			System.out.println("You have secured grade A");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grade student1=new Grade();
		float totalmark=student1.checkTotal();
		student1.checkGrade(totalmark);
		Grade student2=new Grade();
		float totalmark2=student2.checkTotal();
		student2.checkGrade(totalmark2);
		 
		
	}
	
}
