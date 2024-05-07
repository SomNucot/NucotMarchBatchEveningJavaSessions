package ArrayDemo.com;

import java.util.Arrays;

public class SecondWayOfArraysDemo {

	public static void main(String[] args) {
		
		
		//@.Second way of declaring arrays syntax
		//dataType [] nameOfArray = new dataType [size]
		//declaring array
		//-->int[] a=new int[5];
		
		//initialize array in java
		//Size is fixed
		int[] a=new int[5];
		
		a[0]=1;
		a[1]=2;
		a[2]=5;
		a[3]=6;
		a[4]=1;
		System.out.println(a[1]);
		System.out.println(a[4]);
		try
		{
			System.out.println(a[5]);//ArrayIndexOutOfBoundsException
		}
		catch(Exception e)
		{
			System.out.println("AIOBE is coming");
		}
		System.out.println("Size of array or length of array--->"+a.length);
		
		System.out.println("Using for loop print array items");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			
		}
		
		//print values without using loops
		
	System.out.println("With out using loop--->"+Arrays.toString(a));
				
	System.out.println("Using foreach loop print array items");
	
	for(int a1:a)
	{
		System.out.println(a1);
		
	}
	
	
	
	char[] c=new char[5];
	
	c[0]='a';
	c[1]='e';
	c[2]='i';
	c[3]='o';
	c[4]='u';
	System.out.println(c[1]);
	System.out.println(c[4]);
	System.out.println(c.length);
	System.out.println(Arrays.toString(c));
	
	System.out.println("Using for loop print array items");
	for(int i=0;i<c.length;i++)
	{
		System.out.println(c[i]);
		
	}	
	
	
	System.out.println("Using foreach loop print array items");
	
	for(char c1:c)
	{
		System.out.println(c1);
		
	}
		
		

	}

}
