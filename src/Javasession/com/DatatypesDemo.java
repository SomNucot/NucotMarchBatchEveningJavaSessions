package Javasession.com;

public class DatatypesDemo {
	
	
	public static void main(String[] args) {
		
		
		//data types:
		
		//1.Primitive types(Built-in type)--->it takes the space in the memory
		
		//boolean type:true or false
		//numeric type:
						//a: character type: char
						//b.Integral value:
										//b.1:Integer:byte,short,int,long
										//b.2:floating point :float ,double
		
		
		
		////2.Non-Primitive types--->Object,String,Class Array.interface,...etc
		
		
		//variable syntax:
		//variable declaration syntax:
		//data_type variable;
		
		//variable init syntax:
		///data_type variable=value;
		
		//1.byte
		//size--->1byte--->8bits
		//range-->-128 to 127
		
		
		System.out.println("**********Byte data type");
		
		byte b=10;
		System.out.println(b);
		
		byte bb=-128;
		System.out.println(bb);
		
		byte bbb=127;
		System.out.println(bbb);
		
		
		//2.short
				//size--->2byte--->2*8=16bits
				//range-->-32768 to 32767
		System.out.println("**********Short data type");
		
		short s=135;
		System.out.println(s);
		
		short ss=-32768;
		System.out.println(ss);
		
		short sss=32767;
		System.out.println(sss);
		
		
		
		//3.int
		//size--->4byte--->4*8=32bits
		//range-->-2147483648 to 2147483647
		
		
		System.out.println("**********Int data type");
		
		int i=3333;
		System.out.println(i);
		
		int ii=-2147483648;
		System.out.println(ii);
		
		int iii=2147483647;
		System.out.println(iii);
		
		//4.long
		//size--->8byte--->8*8=64bits
		//range-->-
		
		
		System.out.println("**********Int data type");
		
		long l=3333;
		System.out.println(l);
		
		long ll=-9223372036854775808l;
		System.out.println(ll);
		
		long lll=9223372036854775807l;
		System.out.println(lll);
		
		
		
		//5.float
				//size--->4byte--->4*8=32bits
				//range-->1.40239846e-45f to 3.40282347e+38f
		
		System.out.println("**********float data type");
		float f=2.000f;
		System.out.println(f);
		
		
		float ff=1.40239846e-45f;
		System.out.println(ff);
		
		
		float fff=3.40282347e+38f;
		System.out.println(fff);
		
		
		//second way
		System.out.println("**********Second way of defining float data type");
		float ffff=(float)2.000;
		System.out.println(ffff);
		
		//6.double
		//size--->8byte--->8*8=64bits
		//range-->4.94065645841246544e-324 to 1.79769313486231570e+308
		System.out.println("**********float data type");
		double d=3.005566666666666;
		System.out.println(d);
		double dd=4.94065645841246544e-324;
		System.out.println(dd);
		double ddd=4.94065645841246544e-324;
		System.out.println(ddd);
		
		
		//7.char
	   //size--->2byte--->2*8=16bits
		//range-->0 to 65535 
		System.out.println("**********char data type");
		char c='a';
		System.out.println(c);
		
		char cc='*';
		System.out.println(cc);
		
		char ccc='6';
		System.out.println(ccc);
		
		
		char cccc='%';
		System.out.println((byte)cccc);
		
		
		char ccccc='+';
		System.out.println((byte)ccccc);
		
		char cccccc='A';
		System.out.println((byte)cccccc);
		
		
		//8.boolean
		   //size--->1bit
			
		boolean p=true;
		System.out.println(p);
		boolean pp=false;
		System.out.println(pp);
		
		
		
		
		
		
		
		
	

	}

}
