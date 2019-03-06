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
}

public class IandP1 {
  public static void main(String[] a) {
    Student s1 = new Student("Sujit", 3);
    System.out.println(s1.getDetails());
    ResearchStudent s2 = new ResearchStudent("Karthika", 4, "SKC");
    System.out.println(s2.getDetails());
  }
}

/*
  WHAT HAVE WE LEARNED
  --------------------
  - Inheriting using extends
  - Initialising the super-class object using 'super' keyword in the sub-class's constructor.
  - The fact that the super-class's methods (e.g. getDetails) are also part of the sub-class.
*/
