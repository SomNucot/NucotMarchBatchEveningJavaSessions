package OOPSConcepts.com;

public class ConstructorDemo2 {

	int a;
	int b;
	
	int i;
	int j;
	int k;
	
	ConstructorDemo2()
	{
		System.out.println("this is default constructor");
	}
	
	ConstructorDemo2(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("this is default constructor"+a+"-->"+b);
	}
	
	ConstructorDemo2(int i,int j,int k)
	{
		this.i=i;
		this.j=j;
		this.k=k;
		System.out.println("this is default constructor"+i+"-->"+j+"-->"+k);
	}
	
	
	void add()
	{
		int res=i+j;
		System.out.println(res);
		
	}
	
	
	
	public static void main(String[] args) {
	
		ConstructorDemo2 obj=new ConstructorDemo2();
		System.out.println(obj.a=10);
		System.out.println(obj.b=30);
		ConstructorDemo2 obj1=new ConstructorDemo2(30,40);
		ConstructorDemo2 obj2=new ConstructorDemo2(30,40,50);
		obj2.add();
			
	}

}
