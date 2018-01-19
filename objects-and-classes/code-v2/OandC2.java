/*
  OBJECTIVES
  ----------
  - To demonstrate that a program can have more than one class.
  - To teach how one class can invoke/call a method of another class.
*/

class Student {
  public static String getDetails(String name, int rollNumber) {
    return "Name : " + name + "\nRoll Number : " + rollNumber;
  }
}

public class OandC2 {
  public static void main(String[] a) {
    System.out.println(Student.getDetails("Sujit", 100));
  }
}

/*
  Q. What's the benefit of having more than one classes?
  A. Classes can be used as modules. See OC3.java.
*/
