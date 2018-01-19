abstract class Person {
  protected final String name;
  protected int year;

  public Person(String n, int y) {
    name       = n;
    year       = y;
  }

  public abstract String getDetails();
}

class Student extends Person {
  private static final int annualFees = 10000;

  public Student(String n, int y) {
    super(n, y);
  }

  public String getDetails() {
    return "Name : "        + name           + '\n' + 
           "Fees : "        + computeFees()  + '\n';
  }

  public float computeFees () {
    return annualFees * year;
  }
}

class ResearchStudent extends Student {
  String researchArea;
  public ResearchStudent(String n, int y, String ra) {
    super(n, y);
    researchArea = ra;
  }

  public String getDetails() {
    return super.getDetails() +
           "Research Area : " + this.researchArea + '\n';
  }
}

class Professor extends Person {
  private static final int startingSalary = 10000;

  public Professor(String n, int y) {
    super(n, y);
  }

  public String getDetails() {
    return "Name : "        + name           + '\n' + 
           "Salary : "        + computeSalary()  + '\n';
  }
  public float computeSalary () {
    return startingSalary * (1 + 0.1f * year);
  }
}

public class IandP6 {
  public static void main(String[] a) {
    Student s1 = new Student("Sujit", 3);
    ResearchStudent s2 = new ResearchStudent("Karthika", 4, "Software Engineering");
    Professor p1 = new Professor("Sadagopan", 15);
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
  - Having dummy implementation of getDetails in super-class Person makes the code
    prone to bugs.
  - Abstract classes help in two ways:
    * avoiding dummy implementations of methods in the super-class allowing them to
      be declared as abstract.
    * if the implementer of a sub-class forgets to implement the abstract methods, the
      compiler points out the error.
  - Polymorphism works just like before otherwise.
*/
