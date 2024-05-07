package ArrayDemo.com;

import java.util.Arrays;

public class ObjectArraysDemo {

	public static void main(String[] args) {
		
		//Object[] objArray; 
		
		Object[] obj;
		
		Object[] obj1= {"Nucot",10,20.00,'m'};
		obj1[0]="Nucot";
		obj1[1]=10;
		obj1[2]=20.00;
		obj1[3]='m';
		System.out.println(obj1.length);
		System.out.println(obj1[2]);
		System.out.println(obj1[3]);
		
		System.out.println(Arrays.toString(obj1));
		
		for(int i=0;i<obj1.length;i++)
		{
			System.out.println(obj1[i]);
		}
		
		for(Object obj2:obj1)
		{
			System.out.println(obj2);
			
		}
		
		
		
		

	}

}
