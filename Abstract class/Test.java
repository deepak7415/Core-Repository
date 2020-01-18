abstract class Shape  //example of abstract class with abstract method using in two classes

{
 abstract void draw();

}

class Circle extends Shape

{
 void draw()
 
 {
   System.out.println("Drawing Circle");

 }


}


class Rectangle extends Shape

{

 void draw()
 
 {
   System.out.println("Drawing Rectangle");
 
 }


}

class Test

{
 public static void main(String args[])

 {
  Shape c = new Circle();

  Shape r = new Rectangle();

  c.draw();

  r.draw();
 }

}

