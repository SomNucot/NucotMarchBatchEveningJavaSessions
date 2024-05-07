package Javasession.com;

public class StatementsConcepts {

	public static void main(String[] args) {
		
		
		//statements in Java
		
		//If statement
		
		/*
		 * syntax
		 * 
		 * if(condition)
		 * {
		 * 
		 * }
		 * 
		 * 
		 * 
		 */
		//=-->assign the value           --->== checking condition
		int a=10;
		
		if(a==10)
		{
			System.out.println(a);
		}
		
		System.out.println("Thanks");
		
	//operators-->+ - * % /    == != < > <= >=
		
		
		int b=1;
		if(b<10)
		{
			System.out.println("B is lesser than 10");
		}
		
		System.out.println("Thanks");
		
		
		
		
		//If else statement
		
				/*
				 * syntax
				 * 
				 * if(condition)
				 * {
				 * 			//statements or body
				 * }
				 * else
				 * {
				 * 			//statements or body
				 * }
				 * 
				 * 
				 * 
				 */
		
		
		int marks=3;
		
		
		if(marks>=35)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
			
		}
		
		String s1="Hello";
		String s2="Hello";
		if(s1==s2)
		{
			System.out.println("Both are equal");
		}
		else
		{
			System.out.println("Both are not equal");
			
		}
		
		String s3=new String("Hello");
		
		if(s1==s3)
		{
			System.out.println("Both are equal");
		}
		else
		{
			System.out.println("Both are not equal");
			
		}
		
		
		
		if(s1.equals(s3))
		{
			System.out.println("Both are equal");
		}
		else
		{
			System.out.println("Both are not equal");
			
		}
		
		
		
		

	}

}
