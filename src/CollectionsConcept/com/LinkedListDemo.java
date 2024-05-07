package CollectionsConcept.com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		//double linked list
				LinkedList<Integer> olist=new LinkedList<Integer>();
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
				
				olist.addFirst(9);
				System.out.println(olist);
				olist.addLast(67);
				System.out.println(olist);
				int res2=olist.indexOf(40);
				System.out.println(res2);
				
				ListIterator<Integer> newolistValues=olist.listIterator();
				while(newolistValues.hasNext())
				{
					System.out.println(newolistValues.next());
					
				}
				

	}

}
