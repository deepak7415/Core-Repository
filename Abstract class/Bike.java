abstract class Bike  // example of abstract class using constructor,abstract method and non abstract method

{
  abstract void run();

  Bike()

  {

   System.out.println("bike is created");

  }

  void changeGear()

  {
   System.out.println("gear Changed");

  }


}


class Honda extends Bike

{
  void run()

  {
   System.out.println("running saftly");
   
  }

 public static void main(String args[])


 {
   Bike s = new Honda();
  
   s.run();   // calling abstract method 

   s.changeGear(); // calling non abstract method
   
 }

}

