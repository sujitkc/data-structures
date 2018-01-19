/*
  OBJECTIVE
  ---------
  - To demonstrate the use of classes as module.
*/

class Student {
  public static String getDetails(String name, int rollNumber) {
    return "Name : " + name + "\nRoll Number : " + rollNumber;
  }
}

class Professor {
  public static String getDetails(String name, int employeeNumber) {
    return "Name : " + name + "\nEmployee Number : " + employeeNumber;
  }
}


public class OandC3 {
  public static void main(String[] a) {
    System.out.println(Student.getDetails("Sujit", 100));
    System.out.println(Professor.getDetails("Sadagopan", 200));
  }
}

/* 
  ACHIEVEMENT
  -----------
    Here, both Student and Professor classes have a method
    named getDetails with identical signature. If placed in the same class, this would have led 
    to name clash. By encapsulating each method in its appropriate class, we avoid name 
    clashes while possibly letting methods having identical names, as long as they are 
    distinguished by the class they belong to.

  ISSUE
  -----
    The code here is still fundamentally traditional. In fact, the way we are using classes
    in this case -- which is as modules -- is not even the typical application of classes.
    Example. get details from a student as per his/her own attributes

  SOLUTION
  --------
  See OandC4.java
*/
