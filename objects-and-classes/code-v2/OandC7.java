/*
  OBJECTIVE
  ---------
  - final attribute
  - static attributes
  - static final attributes
*/
class Student {
  public final String name;
  public final int rollNumber;
  public int year;
  public static final int annualFees = 10000;

  public Student(String n, int rn, int y) {
    name       = n;
    rollNumber = rn;
    year       = y;
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

public class OandC7 {
  public static void main(String[] a) {
    Student s1 = new Student("Sujit", 100, 3);
    System.out.println(s1.getDetails());
  }
}

/*
  WHAT DID WE LEARN?
  ------------------
  - final attributes with different values for different instances.
  - static attributes with the same value for all instances.
  - updates to static attributes reflects on all instances.
  - The values of final attributes, whether static or non-static, can't be updated once defined.
*/
