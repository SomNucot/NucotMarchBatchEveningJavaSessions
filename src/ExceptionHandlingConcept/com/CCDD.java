package ExceptionHandlingConcept.com;

public class CCDD {

	
	
	
	public static void main(String[] args) throws Exception 
	{
		//To create customized exceptions we are using throw keyword
		
		
		String  userDetails=null;
		if(userDetails==null)
		{
			
			throw new Exception("Datanotfoundexception");
			
			
			
		}
		
		
		
		/*
		try
		{
		throw new Exception("PageTimeOut");
		}
		catch(Exception e)
		{
			System.out.println("customzised exception");
			e.printStackTrace();
			
		}
		*/
		
		
		
	}
}
