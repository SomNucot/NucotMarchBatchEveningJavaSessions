package ArrayDemo.com;

public class TwoDarraysDemo {

	public static void main(String[] args) {
		//1.size is fixed-->Collection
		//2.we cannot manipulated dissimilar data-types-->Object Array
		
		//declaring array
				//int[][] a;
				//int a1[][];
				
				//initialize array in java
				
				int[][] a= {{1,2},{3,4}};
				
				a[0][0]=1;
				a[0][1]=2;
				a[1][0]=3;
				a[1][1]=4;
				System.out.println(a[1][0]);
				System.out.println(a.length);
				
				for(int r=0;r<a.length;r++)
				{
					for(int c=0;c<a.length;c++)
					{
						System.out.println("The values are --->"+a[r][c]);
						
					}
					
				}
				
				
				//@.Second way of declaring arrays syntax
				//dataType [] nameOfArray = new dataType [size]
				//declaring array
				//-->int[][[] a=new int[2][2];
				int[][] a1=new int[2][2];
				a1[0][0]=1;
				a1[0][1]=2;
				a1[1][0]=3;
				a1[1][1]=4;
				System.out.println(a1[1][0]);
				System.out.println(a1.length);
				
				
		

	}

}
