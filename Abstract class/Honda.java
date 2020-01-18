abstract class Bike   // example of abstract class that have abstract method

{
 abstract void  run();

}

class Honda extends Bike

{

 void run()

 {

   System.out.println("running saftely");

 }
 
 public static void main(String args[])

 {
   Bike s = new Honda();
   
   s.run();

 }

}