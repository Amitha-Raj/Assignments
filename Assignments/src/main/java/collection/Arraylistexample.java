package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList= new ArrayList<String>();
		
		arrayList.add("White");
		arrayList.add("Black");
		arrayList.add("Blue");
		arrayList.add("Purple");
		arrayList.add("Pink");
		arrayList.add("Orange");
		
		for(Object y: arrayList) {
			System.out.println(y);
		}
		
		System.out.println("The 4th element in the collection " +arrayList.get(4));
		
		System.out.println("Iterate through all elements in arraylist");
		
		Iterator<String> iterator= arrayList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		arrayList.remove(3);
		System.out.println(arrayList);
		
		System.out.println(arrayList.contains("Orange"));
	}

}
