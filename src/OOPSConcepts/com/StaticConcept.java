package OOPSConcepts.com;

public class StaticConcept {
	
	static int a=10;
	
	
	static void show()
	{
		System.out.println("show");
	}
	
	
	static
	{
		System.out.println("Wel come to Nucot1");
	}
	
	static
	{
		System.out.println("Wel come to Nucot2");
	}
	

	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(StaticConcept.a);
		
		show();
		StaticConcept.show();
		

	}

}
