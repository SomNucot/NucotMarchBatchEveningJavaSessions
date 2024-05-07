package OOPSConcepts.com;

public class StaticDemo {
	
	
	static int b=20;
	
	
	int a=10;
	
	//Normal method
	
	 void test1()
	 {
		 System.out.println("test1");
	 }
	
	
	//Static methods
	
	 static void test2()
	 {
		 System.out.println("test2");
	 }
	
	
	 static void test3()
	 {
		 System.out.println("test3");
	 }
	

	public static void main(String[] args) {
		
		StaticDemo  obj=new StaticDemo();
		obj.test1();
		System.out.println(obj.a);
		
		
		//static methods can be execute in two ways
		//1.method name
		System.out.println("First way of executing static method");
		test2();
		test3();
		
		//static methods can be execute in two ways
				//2.Class_name.method name
		System.out.println("Second way of executing static method");
		StaticDemo.test2();
		StaticDemo.test3();
		
		
		//static variables can be execute in two ways
				//1.variable name
		
		System.out.println(b);
		
		
		//static variables can be execute in two ways
		//1.Class_name.variable_name
		System.out.println(StaticDemo.b);
		
	}

}
