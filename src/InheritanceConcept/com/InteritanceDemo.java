package InheritanceConcept.com;


//---Example for runtime poly + morphism(dynamic)-->Method Overriding
	//When you have any method which is present in parent class that same method is present in child class then method overriding will happen
	//method same should be same
	//number of parameters should be same
	//sequence of parameters should be same
	//return should be same
	//in general copy of method in parent class same as in the child class
	



class AAA
{
	
	void test1()
	{
			System.out.println("In parent class test1");
	}
	
	
	
	
}


//syntax for creating child class
//class childclass_name extends parentclass_name

class B extends AAA
{
	@Override
	void test1()
	{
		System.out.println("In child class test1");
		System.out.println("New chnges class test1");
		
	}
	
	void test3()
	{
		System.out.println("In child class test3");
	}
	
		
}



public class InteritanceDemo {

	public static void main(String[] args) {
		AAA obj =new AAA();
		
		obj.test1();
		
		
		//this is not possible your not able to access child class methods from parent class object
		//obj.test3();
		
		B obj1=new B();
		obj1.test1();//override
		obj1.test3();
		
		
		
		
		
		
		
		
		
		

	}

}
