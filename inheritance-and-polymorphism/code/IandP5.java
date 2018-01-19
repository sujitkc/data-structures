class Student {
  private final String name;
  private int year;
  private static final int annualFees = 10000;

  public Student(String n, int y) {
    name       = n;
    year       = y;
  }

  public String getDetails() {
    return "Name : "        + name           + '\n' + 
           "Fees : "        + computeFees()  + '\n';
  }

  public int computeFees () {
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

public class IandP5 {
  public static void main(String[] a) {
    Student s1 = new Student("Sujit", 3);
    ResearchStudent s2 = new ResearchStudent("Karthika", 4, "Software Engineering");

    Student[] students = {s1, s2};
    printDetails(students);
  }

  public static void printDetails(Student[] students) {
    for(Student s : students) {
      System.out.println(s.getDetails());
    }
  }
}

/*
  SUMMARY
  -------
  - Dynamic polymorphism: A reference to a super-class can point to an object of sub-class
  - Application: We can store objects of subclasses in a container of the super-class type.
  - Dynamic dispatch: When a method is called through a super-class reference, its sub-class implementation
    , if available, is called. The sub-class method implementation overrides the super-class implementation.
    The decision as to which implementation should be called is made dynamically at run-time.
  - Application: printDetails method which is not aware of the sub-class implementation calls the 
    getDetails methods on the reference s which is of Student type. However, depending on the
    precise sub-class, its own implementation of getDetails is called for every Student in the
    array.
*/
