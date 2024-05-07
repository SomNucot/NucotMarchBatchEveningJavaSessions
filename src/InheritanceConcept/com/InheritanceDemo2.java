package InheritanceConcept.com;



class AA
{
	
	
	void show()
	{
		System.out.println("Show method in parent class");
	}
	
	void test1()
	{
		System.out.println("Test1");
	}
	
	
	
}

class BB extends AA
{
	@Override
	void show()
	{
		System.out.println("Show method in child class");
	}
	
	void test2()
	{
		System.out.println("Test2");
	}
	
	
}




public class InheritanceDemo2 {

	public static void main(String[] args) {
		
		
		AA obj =new AA();
		
		obj.show();
		obj.test1();
		//obj.test2();
		
		
		BB obj1=new BB();
		obj1.show();
		obj1.test1();
		obj1.test2();
		
		

	}

}
