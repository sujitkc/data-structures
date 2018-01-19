/*
  OBJECTIVE
  ---------
  - Another example use of non-final static attributes: keeping track of the number of
    instances created so far.
*/

class Student {
  public final String name;
  public final int rollNumber;
  public int year;
  public static final int annualFees = 10000;
  public static int numberOfStudents = 0;

  public Student(String n, int rn, int y) {
    name       = n;
    rollNumber = rn;
    year       = y;
    numberOfStudents++;
  }

  public String getDetails() {
    return "Name : "        + name           + '\n' + 
           "Roll Number : " + rollNumber     + '\n' +
           "Fees : "        + computeFees()          ;
  }

  public int computeFees () {
    return annualFees * year;
  }
}

public class OandC8 {
  public static void main(String[] a) {
    Student s1 = new Student("Sujit", 100, 3);
    System.out.println(s1.getDetails());
    System.out.println("Number of students created = " + Student.numberOfStudents);

    Student s2 = new Student("Murugan", 200, 2);
    System.out.println(s2.getDetails());
    System.out.println("Number of students created = " + Student.numberOfStudents);
  }
}

/*
  WHAT DID WE LEARN?
  ------------------
  - accessing static members from outside
*/
