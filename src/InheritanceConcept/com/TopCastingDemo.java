package InheritanceConcept.com;



class AAAAA
{
	
	AAAAA()
	{
		System.out.println("constructor in parent class");
	}
	
	
	
	
	
	void test()
	{
		System.out.println("Test in parent");
	}
	
	void show()
	{
			System.out.println("Show");
	}
	
}

class BBBBB extends AAAAA
{
	
	BBBBB()
	{
		System.out.println("constructor in child class");
	}
	
	
	
	@Override
	void test()
	{
		System.out.println("Test in child");
	}
	
	
	void display()
	{
		System.out.println("Display");
	}
	
}



public class TopCastingDemo {

	public static void main(String[] args) {
		AAAAA obj=new AAAAA();
		obj.test();
		obj.show();
		
		BBBBB obj1=new BBBBB();
		obj1.test();//inherited method
		obj1.show();//parent class method
		obj1.display();//indiv method child class
		
		//top casting--->Creating object for child class by taking ref of parent class is called Top casting 
		
	AAAAA obj2=new BBBBB();
	
	obj2.test();
	obj2.show();
	//obj2.display();
		
		
		
		
		

	}

}
