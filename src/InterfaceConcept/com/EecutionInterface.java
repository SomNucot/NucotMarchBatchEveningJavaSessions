package InterfaceConcept.com;

public class EecutionInterface {

	public static void main(String[] args) {
		//Application  obj=new Application();-->we cannot create obj for interface

		DemoInterface obj=new DemoInterface();
		obj.titleOfThePage();
		obj.currentUrlOfThePage();
		obj.loginPage();
		
		
	}

}
