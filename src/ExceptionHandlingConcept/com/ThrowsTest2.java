package ExceptionHandlingConcept.com;

public class ThrowsTest2 
{
 
	 void accept() 
	 {
		 try
		 {
		 display();
		 }
		 catch(ArithmeticException ae)
		 {
			 System.out.println("AE is coming");
		 }
	 }
	 void display() throws ArithmeticException
	 {
	     int a=10/0;
	 }
		public static void main(String[] args) 
		{
		  ThrowsTest2 obj = new ThrowsTest2();
		  obj.accept();
		  
		  }
}