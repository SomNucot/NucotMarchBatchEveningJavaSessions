package InterfaceConcept.com;

public class DemoInterface implements Application{

	@Override
	public void titleOfThePage() {
		
		System.out.println("titleOfThePage");
	}

	@Override
	public void currentUrlOfThePage() {
		
		System.out.println("currentUrlOfThePage");
	}

	@Override
	public void loginPage() {
		
		System.out.println("loginPage");
	}

}
