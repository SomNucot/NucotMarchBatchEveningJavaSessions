package OOPSConcepts.com;

public class PolymorphismDemo {

	//two types of Polymorphism
	//1.Compile-time Polymorphism-->Ex:Method Overloading
	//2.Runtime Polymorphism--->Ex:Method Overriding
	
	
	//1.Compile-time Polymorphism-->Ex:Method Overloading
	
	//Always Compile time polymorphism takes place with in the same class(single class) 
	//1.Methods should have -->same name(if you declare multiple methods the method names should be same)
	//2.Methods should have different parameters	
	//3.Methods should have different number of parameters
	//4.Methods should have different order of the parameters.
	//5.return type doesn't matter
	
	
	
	void add(int a,int b)
	{
		int res1=a+b;
		System.out.println(res1);
		
	}
	
	int add(int a,int b,int c)
	{
		int res2=a+b+c;
		System.out.println(res2);
		return res2;
	}
	
	void add(int a,int b,int c,int d)
	{
		int res3=a+b+c+d;
		System.out.println(res3);
		
	}
	
	
	void add(int a,int b,int c,int d,int e)
	{
		int res4=a+b+c+d+e;
		System.out.println(res4);
		
	}
	

	
	public static void main(String[] args) {
		PolymorphismDemo obj=new PolymorphismDemo();
		obj.add(10, 20);
		obj.add(10, 20,30);
		obj.add(10, 20,30,40);
		obj.add(10, 20,30,40,50);

	}

}
