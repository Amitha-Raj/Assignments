package exceptionexamples;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Start");
		int a=5;
		try {
			
		try {
		   int s=a/0;
			int array[]=new int[5];
			array[6]=9;
			}catch (ArithmeticException e) {
				// TODO: handle exception
				System.out.println(e);
			}
			
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		System.out.println("End");

	}

}
