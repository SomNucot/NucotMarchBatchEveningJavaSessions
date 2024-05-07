package Javasession.com;

public class StringsDemo {

	public static void main(String[] args) {
		
		//Group of characters which is enclosed with in double quotes is called string
		String s1="Wel come to Nucot";
		System.out.println(s1.length());
		System.out.println(s1);
		String s2="Bangalore";
		System.out.println(s1+s2);
		
		//substring-->Extracting a character from the given string
		
		String ss=s1.substring(4);
		System.out.println(ss);
	
		System.out.println(s1.subSequence(12, 17));
		
		
		//split-->We be explaining in arrays
		
		String s3="java,sessions";
		String[] ss3=s3.split(",");
		for(String ss4:ss3)
		{
			System.out.println(ss4);
		}
		
		//Replace
		
		String s4="Selenium Testing";
		System.out.println(s4);
		String sss4=s4.replace("Selenium", "API");
		System.out.println(sss4);
		
		
		//trim
		
		String s5="      Bangalore is it city        ";
		String ss5=s5.trim();
		System.out.println(ss5);
		
		
		//Covert the given String into Upper or lower cases
		
		String s6="covert the given ctring into upper or lower cases";
		String ss6=s6.toUpperCase();
		System.out.println(ss6);
		
		String s7="COVERT THE GIVEN CTRING INTO UPPER OR LOWER CASES";
		String ss7=s7.toLowerCase();
		System.out.println(ss7);
		
		
		//compare
		
		String s8="Selenium";
		String s9="Selenium Webdriver";
		int	res=s8.compareTo(s9);
		if(res>0)
		{
			System.out.println("s8 is greater than s9");
			
		}
		else
		{
			System.out.println("s8 is lesser than s9");
		}
		System.out.println(s9.charAt(17));
	
		
		
		String s10="Modi";
		System.out.println(s10.charAt(3));
		System.out.println(s10.charAt(2));
		System.out.println(s10.charAt(1));
		System.out.println(s10.charAt(0));
		//System.out.println(s10.charAt(4));
		System.out.println("Thanks");
		
		System.out.println(s10.length());
		
		
		String s11="abc def efg";
		
		System.out.println(s11.indexOf("abc"));
		
		
		
		
		
		
		
		
		

	}

}
