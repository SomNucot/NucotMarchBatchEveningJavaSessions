package EncapsulationConcept;

public class EncapsulationDemo {

	//Encapsulation is hide the data and method in a single entity(unit) or 
		//unit along with a method to protect information from outside.
		
	public String Name;
	public  int age;
	public  int ssn;
	public  int accountNumber;
	private  int atmpin=123;
	
	public int getAtmpin() {
		return atmpin;
	}
	public void setAtmpin(int atmpin) {
		this.atmpin = atmpin;
		System.out.println(this.atmpin);
	}



	public void show()
	{
		System.out.println("show");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		EncapsulationDemo obj=new EncapsulationDemo();
		System.out.println(obj.Name="Nucot");
		System.out.println(obj.age=20);
		System.out.println(obj.ssn=123);
		System.out.println(obj.accountNumber=444);
		System.out.println(obj.atmpin);
		obj.show();
		
		
		

	}

}
