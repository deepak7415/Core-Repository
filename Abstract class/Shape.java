abstract class Bike

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
   Shape s = new Honda();
  
   s.run();

   s.changeGear();
   
 }

}

}