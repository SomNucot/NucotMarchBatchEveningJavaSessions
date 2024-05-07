package OOPSConcepts.com;

public class MethodDemo3 {

	
	
	void login()
	{
		System.out.println("Login with out creditails");
		
	}
	
	void login(String username)
	{
		System.out.println("Login with  Username---->"+username);
	}
	
	void login(String username,String password)
	{
		System.out.println("Login with Username  and Password--->"+username+":"+password);
	}
	
	

	
	
	public static void main(String[] args) {
		
		
		MethodDemo3 obj =new MethodDemo3();
		
		obj.login();
		
		obj.login("Admin");
		obj.login("Admin","admin123");
		
		

	}

}
