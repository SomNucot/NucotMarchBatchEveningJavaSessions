package OOPSConcepts.com;

public class MethodtypesDemo2 {

	
	
	void test1()
	{
		System.out.println("test1");
	}
	
	int test2()
	{
		System.out.println("test");
		return 0;
	}
	
	
	void test3(int a)
	{
		System.out.println(a);
	}
	
	int test4(int a,int b)
	{
		return a+b;
	}
	
	
	
	
	public static void main(String[] args) {
		
		 MethodtypesDemo2 obj=new  MethodtypesDemo2();
		 obj.test1();
		 int res1=obj.test2();
		 System.out.println(res1);
		 obj.test3(10);
		 int res2=obj.test4(1,2);
		 System.out.println(res2);
	}

}
