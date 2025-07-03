package UnderStandingArrays;

import java.util.ArrayList;
import java.util.ListIterator;

public class UnderStandingArrayList {
	public static void main(String []args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Abhishek");
		list.add("Aftab");
		list.add("Vishal");
		
		for (int i = 0; i<list.size();i++) {
			
			System.out.println(list.get(i));
		}
		
		for(String str :list) {
			System.out.println(str);
		}
		
		ListIterator<String> lit = list.listIterator();
		
		while(lit.hasNext()) {
			
			System.out.println(lit.next());

		}
		
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());

		}
		
		
	}

}
