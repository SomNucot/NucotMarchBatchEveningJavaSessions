package InheritanceConcept.com;


class Animals {
   void food() {
          System.out.println("Animal may eat flesh, grass or ....");
   }
}


class Lion extends Animals {
   @Override
   void food() {
          System.out.println("Lion eat - flesh");
   }
}



class Goat extends Animals {
   @Override
   void food() {
          System.out.println("Goat eat - grass");
   }
   
   void walking()
   {
	   System.out.println("walk");
   }
}



public class MyClass {
	   public static void main(String[] args) {
	          Animals lion = new Lion();
	          lion.food();
	
	          Goat goat = new Goat();
	          goat.food();
	          
	          goat.walking();
	   }
}

