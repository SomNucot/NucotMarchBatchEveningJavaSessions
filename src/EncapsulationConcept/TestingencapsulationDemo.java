package EncapsulationConcept;

public class TestingencapsulationDemo {

	public static void main(String[] args) {

		EncapsulationDemo obj=new EncapsulationDemo();
		System.out.println(obj.Name="Nucot");
		System.out.println(obj.age=20);
		System.out.println(obj.ssn=123);
		System.out.println(obj.accountNumber=444);
		//System.out.println(obj.atmpin=2222);
		obj.setAtmpin(1111);
		obj.getAtmpin();
		
		obj.show();
		
		

	}

}
