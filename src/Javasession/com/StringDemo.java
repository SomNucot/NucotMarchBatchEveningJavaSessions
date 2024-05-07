package Javasession.com;

public class StringDemo {

	public static void main(String[] args) {
		//String-->Any thing you place with in double quotes is called string
		
		String s="Welcome to Nucot";
		System.out.println(s);
		int a=10;
		int b=20;
		String s1="Selenium";
		String s2="Testing";
		
		//String with any data type we called concatenation
		
		System.out.println(a+b);//addition
		System.out.println(s1+s2);//concatenation
		
		System.out.println(s1+a);
		System.out.println(a+s1);
		
		System.out.println(a+b+s1+s2);
		System.out.println(s1+s2+a+b);//SeleniumTesting1020
		System.out.println(s1+s2+(a+b));
		System.out.println(a+b+s1);
		
		System.out.println(s1+a+b);
		
		
		char c='a';
		char cc='b';
		System.out.println('A'+'B');//
		System.out.println(c+s1);
		System.out.println(s1+c);
		System.out.println(c);
		
		
		

	}

}
