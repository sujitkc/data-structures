/*
  OBJECTIVE
  ---------
  - To learn default constructors
*/
class Student {
  public String name;
  public int rollNumber;

  public Student(String n, int rn) {
    name = n;
    rollNumber = rn;
  }

  public Student() {
    name = "Default Name";
    rollNumber = 0;
  }

  public String getDetails() {
    return "Name : " + name + "\nRoll Number : " + rollNumber;
  }
}

public class OandC5a {
  public static void main(String[] a) {
    Student s1 = new Student("Sujit", 100);
    System.out.println(s1.getDetails());

    Student s2 = new Student("Murugan", 200);
    System.out.println(s2.getDetails());

    Student s3 = new Student();
    System.out.println(s3.getDetails());
  }
}
/* 
  WHAT NEW DID WE LEARN?
  ----------------------
  - How to create a constructor
  - Instantiation of a class with a constructor.

  EXERCISE
  --------
  - Modify the Professor class to have a constructor of its own.
*/
