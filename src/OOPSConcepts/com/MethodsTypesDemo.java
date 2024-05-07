package OOPSConcepts.com;

public class MethodsTypesDemo {

	
	//1.No return type and No input
	//2.return type and No input
	//3.No return type and with input
	//4.return type and with input
	
	
/*	
	data_type methodname()
	{
		
		
	}
*/
	
	//1.No return type and No input
	
	void add()
	{
		int a=10;
		int b=10;
		int sum=a+b;
		System.out.println(sum);
		
	}
	
	
	//2.return type and No input
	
	
	
	int sub()
	{
		
		int c=20;
		int d=10;
		int res=c-d;
		return res;
		
		
		
	}
	
	
	
	//3.No return type and with input
	
	
	void mul(int p ,int q)
	{
		int m2=p*q;
		System.out.println(m2);
		
	}
	
	
	//4.return type and with input
	
	int div(int x ,int y)
	{
		int z=x/y;
		
		return z;
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		MethodsTypesDemo obj=new MethodsTypesDemo();
		obj.add();
		
		int res1=obj.sub();
		System.out.println(res1);
	
		
		obj.mul(12, 3);
	
		
		int	divresult=obj.div(10, 2);
		System.out.println(divresult);
		

	}

}
