package ExceptionHandlingConcept.com;

public class ThrowsDemo {
	
	
	
	//throws keyword in java
	//throws key word is used to explicitly throw an exception
	
	public void loginPage()
	{
		System.out.println("This is loginPage");
		homePage();
	}
	public void homePage()
	{
		System.out.println("This is homePage");
		try
		{
			searchProduct();
		}
		catch(ArithmeticException ae)
		{
			System.out.println("AE is coming");
		}
		
	}
	public void searchProduct() throws ArithmeticException
	{
		System.out.println("This is searchProduct");
		addToCart() ;
		
		
	}
	public void addToCart() throws ArithmeticException
	{
		System.out.println("This is addToCart");
		int a=10/0;
		
	}
	
	
	public static void main(String[] args) {
		ThrowsDemo obj=new ThrowsDemo();
		
		obj.loginPage();

	}

}
