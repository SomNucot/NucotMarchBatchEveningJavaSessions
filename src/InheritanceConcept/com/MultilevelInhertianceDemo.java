package InheritanceConcept.com;

class AAAA
{
	void test1()
	{
		System.out.println("Test1 in parent");
	}
	void test2()
	{
		System.out.println("Test2");
	}
	
	
}

class BBBB extends AAAA
{
	@Override
	void test1()
	{
		System.out.println("Test in BBBB");
	}
	
	void test3()
	{
		System.out.println("Test3");
	}
	

	
}

class CCCC extends BBBB
{
	@Override
	void test1()
	{
		System.out.println("Test CCCC");
	}
	
	void test4()
	{
		System.out.println("Test4");
	}
	
	
}
class DDDD extends CCCC
{
	@Override
	void test1()
	{
		System.out.println("Test in DDDD");
	}
	
	void test5()
	{
		System.out.println("Test5");
	}
	
	
}





public class MultilevelInhertianceDemo {

	public static void main(String[] args) {
		
		
		AAAA obj=new AAAA();
		obj.test1();
		obj.test2();
	
		DDDD obj1=new DDDD();
		obj1.test1();
		obj1.test2();
		obj1.test3();
		obj1.test4();
		obj1.test5();
		

	}

}
