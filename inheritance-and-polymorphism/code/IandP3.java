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

public class IandP3 {
  public static void main(String[] a) {
    Student s1 = new Student("Sujit", 3);
    System.out.println(s1.getDetails());
    ResearchStudent s2 = new ResearchStudent("Karthika", 4, "Software Engineering");
    System.out.println(s2.getDetails());
  }
}

/*
  WHAT HAVE WE LEARNED
  --------------------
  - Overriding methods
  - Reusing superclass's method by invoking it from the overriding method using 'super' keyword.
*/
