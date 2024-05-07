package ExceptionHandlingConcept.com;

public class ArithmeticExceptionDemo
{  
    void division(int a, int b)  
    {  
        // Method for division
    	try
    	{
    		int result = a / b;  
    	}
    	catch(ArithmeticException ae)
    	{
    		System.out.println("AE is coming");
    	}
        System.out.println("Division successfull.");  
       
    }  
  
    // main method  
    public static void main(String argvs[])  
    {  
        // creating an object of the class ArithmeticException  
        ArithmeticExceptionDemo obj1 = new ArithmeticExceptionDemo(); 
        obj1.division(180,0);  
    }  
}  

