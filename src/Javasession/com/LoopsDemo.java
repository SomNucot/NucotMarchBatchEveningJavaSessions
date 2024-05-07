package Javasession.com;

public class LoopsDemo {

	public static void main(String[] args) {
		
		
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);
		
		//1.While loop
		//2.do while loop
		//3.for loop
		//4.for each loop
		
		
		
		//While loop
		/*
		 * syntax
		 * 
		 * while(condition)
		 * {
		 * 			//body or statements
		 * 
		 * }
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		System.out.println("Printing the values from 1 to 10 using while loop");
		int i=1;
		
		while(i<=10)
		{
			System.out.println(i);
			i++;
			
			
			
		}
		
		
		
		//Example for infinite while loop
//		while(true)
//		{
//			System.out.println("Welcome to bangalore");
//			
//		}
		
		
		
		
		System.out.println("Printing the even values from 1 to 10 using while loop");
		int ii=2;
		
		while(ii<=10)
		{
			System.out.println(ii);
			ii=ii+2;
			
			
			
		}
		
		
		System.out.println("Printing the odd values from 1 to 10 using while loop");
		int iii=1;
		
		while(iii<=10)
		{
			System.out.println(iii);
			iii=iii+2;
			
			
			
		}
		
		//Note:Minimum number of times while will execute 0
		
		

	}

}
