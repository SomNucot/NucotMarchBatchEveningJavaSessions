package OOPSConcepts.com;

public class Student {
	
	//class variable declaration
	String name;
	int age=20;
	float salary=12.0f;
	
	//final variable
	
	final int usn=1234;
	final float pi=3.14f;
	
	
	
	

	public static void main(String[] args) {
		
		Student obj=new Student();
		System.out.println(obj.name="Nucot");
		System.out.println(obj.age);
		System.out.println(obj.salary);
		System.out.println(obj.usn);
		System.out.println(obj.pi);
		//System.out.println(obj.pi=333.0f);
		
		
	}

}
