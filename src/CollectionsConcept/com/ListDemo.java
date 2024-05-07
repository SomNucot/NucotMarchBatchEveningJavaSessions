package CollectionsConcept.com;

import java.util.ArrayList;

public class ListDemo {

	public static void main(String[] args) {
		
		//dynamic array--Accessing the value is very fast
		ArrayList olist=new ArrayList();
		olist.add(10);
		olist.add("Nucot");
		olist.add(10);
		olist.add(12.30f);
		olist.add('m');
		olist.add(222.0000);
		System.out.println(olist.size());
		System.out.println(olist.get(1));
		System.out.println(olist.get(5));
		
		System.out.println("Using normal for loop");
		for(int i=0;i<olist.size();i++)
		{
			System.out.println(olist.get(i));
		}
		
		System.out.println("With loop ");
		System.out.println("The list of items -->"+olist);
		
		
		
		
		//For each loop
		/*
		 * 
		 * syntax
		 * 
		 * 
		 * for(Data_type  new_value:old_value)
		 * {
		 * 
		 * 
		 * }
		 * 
		 * 
		 * or
		 * 
		 * 
		 * for (Data_type  variableName : arrayName) 
		 * {
  				// code block to be executed
			}
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		System.out.println("For each loop");
		for(Object olist1:olist)
		{
			
			System.out.println("Using for ach loop-->"+olist1);
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
