package ExceptionHandlingConcept.com;

public class NullPointerExceptionDemo {

	int a=10;

	public static void main(String[] args) {
		
		NullPointerExceptionDemo obj=new NullPointerExceptionDemo();
		obj=null;//NullPointerException:
		try
		{
			System.out.println(obj.a);
		}
		catch(NullPointerException npe)
		{
			System.out.println("NP is coming");
			
			npe.printStackTrace();
			
		}
		
		System.out.println("Welcome1");
		System.out.println("Welcome2");
		System.out.println("Welcome3");
		System.out.println("Welcome4");
		
		
		
		

	}

}
