package ExceptionHandlingConcept.com;

public class ExceptionDemo {
	//try catch and finally block
	
			//syntax
			/*
			 * 
			 * try
			 * {
			 * 
			 * }
			 * catch(Exception e)
			 * {
			 * 
			 * }
			 * finally
			 * {
			 * 
			 * 
			 * }
			 * 
			 * 
			 * 
			 * 
			 * 
			 * 
			 * 
			 * 
			 * 
			 * 
			 * 
			 * 
			 */
			
	
	int a=10;
	
	
			
	public static void main(String[] args) {
		
		ExceptionDemo obj=new ExceptionDemo();
		obj=null;
		
		
		try
		{
			int i=10/0;//ArithmeticException//unchecked exception
			
		}
		catch(ArithmeticException ae)
		{
			System.out.println("AE is coming");
			//ae.printStackTrace();
			
			
			
		}
		System.out.println("Welcome1");
		System.out.println("Welcome2");
		System.out.println("Welcome3");
		System.out.println("Welcome4");
		
		try
		{
		System.out.println(obj.a);
		}
		catch(Exception e)
		{
			System.out.println("NPE is coming");
		}
		
		System.out.println("Welcome5");
		System.out.println("Welcome6");
		System.out.println("Welcome7");
		System.out.println("Welcome8");
		
		
		
		
		

	}

}
