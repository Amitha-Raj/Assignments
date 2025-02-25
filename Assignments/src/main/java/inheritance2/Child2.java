package inheritance2;

import inheritance1.Parent;

public class Child2  extends Parent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child2 child2=new Child2();
		child2.method1();
		child2.method3();
		//child2.method2(); private and default cannot be accessed
		//child2.method4(); private and default cannot be accessed

	}

}
