package ArrayDemo.com;

class Student
{
	String name;
	int rollNo;
		Student(String name, int rollNo)
		{
			this.name = name;
			this.rollNo = rollNo;
		}
}

public class ArraysOfObjects 
{
	public static void main(String[] args) 
	{
  // Creating an array of Student objects of length 5.
     Student[ ] st = new Student[6];

  // Assigning new Student objects to the array elements.
     st[0] = new Student("John", 1);
     st[1] = new Student("Ivaan", 2);
     st[2] = new Student("Deepak", 3);
     st[3] = new Student("Amit", 4);
     st[4] = new Student("Rashmi", 5);
     st[5] = new Student("Herry", 6);
   
// Accessing elements of the specified array of objects using array references.
   for(int i = 0; i < st.length; i++)
   {
      System.out.println("Name: " +st[i].name+ ", "+"Roll no: " +st[i].rollNo);	
   }
   
   System.out.println("Using for each loop");
   for(Student st1:st)
   {
	   System.out.println("Name: " +st1.name+ ", "+"Roll no: " +st1.rollNo);	
   }
	   
   }
   
   
   
}