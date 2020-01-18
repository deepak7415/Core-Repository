abstract class Student  // example of abstrct class with  abstract and non abstract methods and constructor

{
  int rollno;

  int age;

abstract void  print();

 Student()

  {
   System.out.println("parent const");

  }
  
 Student(int rollno, int age)

  {
    this.rollno = rollno;

    this.age = age;
  }

  

 static

 {
  System.out.println("Student details are");

 }


  static void show()

  {
   System.out.println("show my details");

  }

}


class Student1 extends Student 

{
   String name;

   String address;

  Student1()

  {
   System.out.println("ch const");

  }


   Student1(int rollno, int age, String name,String address)

   { 

     super(rollno,age);

     this.name = name;
    
     this.address = address;

     
   }

  void print()
  
  {
   System.out.println("roll no "+rollno);

   System.out.println("age "+age);

   System.out.println("name "+name);

   System.out.println("address"+address);
    

  }



}


class TestStudent

{
  public static void main(String args[])

  {
   Student s1 = new Student1(5,25,"deep","xyz");

   Student s2 = new Student1(6,30,"sonu","xyz");

   Student s3 = new Student1();

   Student.show();

   s1.print();

   System.out.println();

   s2.print();
  }

}

