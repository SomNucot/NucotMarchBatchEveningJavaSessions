package CollectionsConcept.com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
		//accepts only unique values
		//order is not maintained
		HashSet<Integer> oset=new HashSet<>();
		oset.add(10);
		oset.add(20);
		oset.add(10);
		oset.add(10);
		oset.add(40);
		oset.add(50);
		
		System.out.println(oset);
		System.out.println(oset.size());
		
		
		for(Integer oset1:oset)
		{
			System.out.println(oset1);
		}
		
		boolean res=oset.contains(40);
		System.out.println(res);
		
		Iterator<Integer> osetres=oset.iterator();
		
		while(osetres.hasNext())
		{
			System.out.println(osetres.next());
			
		}
		
		
		oset.remove(10);
		System.out.println(oset);
		
		
		
		Set<String> osetString=new HashSet<String>();
		
		
		osetString.add("API");
		osetString.add("Selenium");
		osetString.add("Cypress");
		osetString.add("Python");
		osetString.add("Javascript");
		osetString.add("Dom");
		System.out.println(osetString);
		System.out.println(osetString.size());
		
		Iterator<String> osetres2=osetString.iterator();
		
		while(osetres2.hasNext())
		{
			System.out.println(osetres2.next());
			
		}
		
		
		
		

	}

}
