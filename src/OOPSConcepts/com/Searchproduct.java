package OOPSConcepts.com;

public class Searchproduct {
	
	
	
	Searchproduct()
	{
		System.out.println("default constructor");
	}
	
	Searchproduct(String name)
	{
		System.out.println("Single constructor");
	}
	
	Searchproduct(String name,int price)
	{
		System.out.println("Two param constructor");
	}
	
	Searchproduct(String name,int price,int rating)
	{
		System.out.println("Three param constructor");
	}
	
	
	void searchProduct(String name)
	{
		System.out.println("Product name"+name);
		
	}
	
	void searchProduct(String name,int price)
	{
		System.out.println("Product name and price---->"+name+":"+price);
	}
	
	void searchProduct(String name,int price,int rating)
	{
		System.out.println("Product name price and rating---->"+name+":"+price+":"+rating);
	}
	

	public static void main() {
		
		System.out.println("main");

	}

	public static void main(int a) {
	
		System.out.println("main");
	}

	public static void main(String a) {
	
		System.out.println("main");
	

	}

	public static void main(String[] args) {
		
		Searchproduct obj=new Searchproduct();
		obj.searchProduct("mobile");
		obj.searchProduct("mobile",20000);
		obj.searchProduct("mobile",20000,5);
		
		main();
		main(10);
		main("Nucot");
		
		

	}

}
