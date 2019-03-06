/*
  OBJECTIVE
  ---------
  - multiple methods
*/
class Student {
  public String name;
  public int rollNumber;
  public int year;
  public int annualFees = 10000;

  public Student(String n, int rn, int y) {
    name = n;
    rollNumber = rn;
    year = y;
  }

  public String getDetails() {
    return "Name : " + name + '\n' + 
      "Roll Number : " + rollNumber + '\n' +
      "Fees : " + computeFees();
  }

  public int computeFees () {
    return annualFees * year;
  }
}

public class OandC6 {
  public static void main(String[] a) {
    Student s1 = new Student("Sujit", 100, 3);
    System.out.println(s1.getDetails());
  }
}
/*
  ISSUES
  ------
  - year may change over time.
  - name and rollNumber are constants for a student.
  - annualFees is same for all Students.

  SOLUTION
  --------
  - See OandC7.java
*/
