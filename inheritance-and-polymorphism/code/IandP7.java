interface Person {

  public abstract String getDetails();
  public abstract float computeSalary();
}

class Student implements Person {
  private static final int annualFees = 10000;
  private static final int startingSalary = 5000;

  private int rollNumber;
  private int year;
  public Student(int rn, int y) {
    this.rollNumber = rn;
    this.year = y;
  }

  public String getDetails() {
    return "Roll Number : "        + rollNumber           + '\n' + 
           "Fees : "        + computeFees()  + '\n';
  }

  public float computeFees () {
    return annualFees * year;
  }

  public float computeSalary () {
    return startingSalary * (1 + 0.15f * year);
  }
}

class ResearchStudent extends Student {
  private String researchArea;
  public ResearchStudent(int rn, int y, String ra) {
    super(rn, y);
    researchArea = ra;
  }

  public String getDetails() {
    return super.getDetails() +
           "Research Area : " + this.researchArea + '\n';
  }
}

class Professor implements Person {
  private static final int startingSalary = 10000;
 
  private int employeeNumber;
  private int year;

  public Professor(int en, int y) {
    this.employeeNumber = en;
    this.year = y;
  }

  public String getDetails() {
    return "Employee Number : "        + employeeNumber  + '\n' + 
           "Salary : "        + computeSalary()  + '\n';
  }

  public float computeSalary () {
    return startingSalary * (1 + 0.1f * year);
  }
}

public class IandP7 {
  public static void main(String[] a) {
    Student s1 = new Student(10, 3);
    ResearchStudent s2 = new ResearchStudent(1000, 4, "Software Engineering");
    Professor p1 = new Professor(1, 15);
    Person[] persons = {s1, s2, p1};
    printDetails(persons);
  }

  public static void printDetails(Person[] persons) {
    for(Person p : persons) {
      System.out.println(p.getDetails());
    }
  }
}

/*
  SUMMARY
  -------
  - Interfaces as completely abstract classes.
  - Interfaces are important in the context of multiple inheritance.
*/
