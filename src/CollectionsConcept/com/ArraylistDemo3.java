package CollectionsConcept.com;

import java.util.ArrayList;
import java.util.List;

public class ArraylistDemo3 {

	public static void main(String[] args) {
		
		
		//dynamic array
				List<Integer> olist=new ArrayList<Integer>();
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
				System.out.println(olist);
				olist.set(2, 50);
				System.out.println(olist);
		
		

	}

}
