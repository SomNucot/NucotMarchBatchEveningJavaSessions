package Abstractconcept.com;


//implemented and non implemented methods
//partial abstraction
//we cannot create object for abstract class

//we can have constructors



abstract class DemoAbstaract
{
	
	//implemented method--->method def
	void test1()
	{
		System.out.println("test1");
	}
	
	
	//unimplemented method --method declaration
	abstract void test2();
	abstract void test3();
	abstract void test4();
	
}

class Childdemo extends DemoAbstaract
{
	
	
	 void test2()
	 {
		System.out.println("test2"); 
	 }
	 void test3()
	 {
		 System.out.println("test3");
		 
		
	 }
	 void test4()
	 {
		 System.out.println("test4");
	 }
	
	
	
}

public class AbstractDemo {

	public static void main(String[] args) {
		//DemoAbstaract obj=new DemoAbstaract();
		
		Childdemo obj1=new Childdemo();
		obj1.test1();
		obj1.test2();
		obj1.test3();
	}

}
