class Student {
  protected final String name;
  protected int year;
  private static final int annualFees = 10000;

  public Student(String n, int y) {
    name       = n;
    year       = y;
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

  public float computeFees () {
    return 10000f;
  }
}

public class IandP5a {
  public static void main(String[] a) {
    Student s1 = new Student("Sujit", 3);
    System.out.println(s1.getDetails());
    ResearchStudent s2 = new ResearchStudent("Karthika", 4, "Software Engineering");
    System.out.println(s2.getDetails());
  }
}

/*
  SUMMARY
  -------
  - Dynamic dispatch acting from within a method.
  - Example: getDetails method is not implemented in the sub-class. It has a call
    to computeFees, which has been overriden in the sub-class. When the object
    context is sub-class (ResearchStudent), getDetails calls sub-class's 
    implementation of computeFees.
*/
