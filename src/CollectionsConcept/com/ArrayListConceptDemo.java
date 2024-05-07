package CollectionsConcept.com;

import java.util.ArrayList;

public class ArrayListConceptDemo {

	public static void main(String[] args) {
		
		//dynamic array
		ArrayList<Integer> olist=new ArrayList<Integer>();
		olist.add(10);
		olist.add(20);
		olist.add(40);
		olist.add(30);
		olist.add(70);
		System.out.println(olist);
		System.out.println(olist.get(3));
		System.out.println(olist.size());
		olist.add(30);
		olist.add(20);
		System.out.println("Using foreach loop");
		for(Integer olist1:olist)
		{
			System.out.println(olist1);
		}
		
		System.out.println("Using for loop");
		for(int i=0;i<olist.size();i++)
		{
			System.out.println(olist.get(i));
		}
		
		
		ArrayList<String> olistString=new ArrayList<String>();
		olistString.add("API");
		olistString.add("Automation");
		olistString.add("Manual");
		olistString.add("Selenium");
		olistString.add("Github");
		System.out.println(olistString);
		System.out.println(olistString.get(3));
		System.out.println(olistString.size());
		olistString.add("Jenkins");
		olistString.add("Cypress");
		System.out.println("Using foreach loop");
		for(String olistolistString1:olistString)
		{
			System.out.println(olistolistString1);
		}
		
		System.out.println("Using for loop");
		for(int i=0;i<olistString.size();i++)
		{
			System.out.println(olistString.get(i));
		}
		
		
		olistString.add(3, "Javascript");
		
		System.out.println(olistString);
		//olistString.remove(2);
		System.out.println(olistString);
		boolean newolist=olistString.contains("Manual");
		System.out.println(newolist);
		
		
		
		
	}

}
