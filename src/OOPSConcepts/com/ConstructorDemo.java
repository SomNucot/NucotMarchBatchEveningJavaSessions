package OOPSConcepts.com;

public class ConstructorDemo {
	
	
	
	//Constructors are used to initialize the objects and data
		//1.Always Constructor name should be same as class name
		//2.Constructor does not have any return type including void
		//3.Constructors are executed(called) when you create object
		//4.Constructors will be overloaded
	
	//class variable or global variable
	int a;
	
	void show()
	{
		System.out.println("show");
	}
	
	
	ConstructorDemo()
	{
		System.out.println("Default constructor");
	}
	
	
	ConstructorDemo(int a)
	{
		this.a=a;
		System.out.println("Default constructor--->"+this.a);
	}
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		
		ConstructorDemo obj=new ConstructorDemo();
		obj.show();
		System.out.println(obj.a=10);
		
		ConstructorDemo obj1=new ConstructorDemo(10);
		
		
		

	}

}
