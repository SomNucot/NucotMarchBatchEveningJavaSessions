package Javasession.com;

public class NestedIfesleConcept {

	public static void main(String[] args) {
		//Nested if else
		/*
		 * if(condition)
		 * {
		 * 		//body
		 * }
		 * else if(condition)
		 * {
		 * 		//body
		 * }
		 * 
		 * else if(condition)
		 * {
		 * 			//body
		 * }
		 * else if(condition)
		 * {
		 * 			//body
		 * 
		 * }
		 * else
		 * {
		 * 			//body
		 * 
		 * }
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		int age=50;
		
		
		if(age==25)
		{
			System.out.println("abc");
		}
		else if(age>=55)
		{
			System.out.println("bbb");
		}
		else if(age>=25)
		{
			System.out.println("ccc");
		}
		else if(age>=35)
		{
			System.out.println("ddd");
		}
		else if(age>=65)
		{
			System.out.println("eee");
		}
		else
		{
			System.out.println("Pass vaild age");
			
		}
		
		
		String browserName="ie";
		
		if(browserName.equals("chrome"))
		{
			System.out.println("Launch chrome browser");
			
		}
		else if(browserName.equals("firefox"))
		{
			System.out.println("Launch firefox browser");
			
		}
		else if(browserName.equals("safari"))
		{
			System.out.println("Launch safari browser");
			
		}
		else if(browserName.equals("ie"))
		{
			System.out.println("Launch ie browser");
			
		}
		else if(browserName.equals("edge"))
		{
			System.out.println("Launch edge browser");
			
		}
		else
		{
			System.out.println("Plz pass vaild browser name");
		}
		
		
		
		//Nested if
		int i=100;
		
		if(i==100)
		{
			if(i<20)
			{
				System.out.println("Less than 20");
				
			}
			else
			{
				System.out.println("greater than 20");
			}
		}
		
		
		System.out.println("Thanks");
		
		
		
		
		

	}

}
