/*
  OBJECTIVE
  ---------
  - To demonstrate the use of classes as containers of data
  - To demonstrate methods as computations specific to an object.
*/

class Student {
  public String name;
  public int rollNumber;
  public String getDetails() {
    return "Name : " + name + "\nRoll Number : " + rollNumber;
  }
}

public class OandC4 {
  public static void main(String[] a) {
    Student s1 = new Student();
    s1.name = "Sujit";
    s1.rollNumber = 100;
    System.out.println(s1.getDetails());

    Student s2 = new Student();
    s2.name = "Murugan";
    s2.rollNumber = 200;
    System.out.println(s2.getDetails());
  }
}
/* 
  WHAT NEW DID WE LEARN?
  ----------------------
  - Non-static attribute/variable
  - Non-static method
  - Instantiation of a class
  - Calling a non-static method of a class.

  EXERCISE
  --------
  - Modify the Professor class to have a name and employeeNumber attributes and a non-static getDetails method.

  ISSUE
  -----
  We show that instantiating a Student and initialising its name, rollNumber attribute
  in two steps is an error prone approach by actually creating an error.

  SOLUTION
  --------
  See OandC5.java
*/
