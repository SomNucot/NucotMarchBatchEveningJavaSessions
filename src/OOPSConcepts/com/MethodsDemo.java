package OOPSConcepts.com;

public class MethodsDemo {
	
	
	
	//methods
	//Normal methods
	//Static methods
	
	//Normal methods
	/*-->syntax
	 * Normal method-->Declaration or prototype
	 * data_type method_name();
	 * 
	 * -->syntax-->Method definition
	 * Normal method-->definition
	 * data_type method_name()
	 * {
	 * 
	 * 			//body or statements
	 * 
	 * }
	 * 
	 * 
	 * 
	 */
	
		//datatypes--->int float char String long double...etc
						//void
	
	
	//Declaration or prototype-->example
			/*	
				void add();
				int add2();
				float add3();
			*/
	
	//class variables
	int d;
	
	void add()
	{
		//local variables
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
		
		
	}
	
	
	void sub()
	{
		//local variables
		int a=10;
		int b=20;
		int sub=a-b;
		System.out.println(sub);
		
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		MethodsDemo obj=new MethodsDemo();
		
		obj.add();
		System.out.println(obj.d=30);
		
		obj.sub();
		
		
		
		
		
		
		
		
		

	}

}
