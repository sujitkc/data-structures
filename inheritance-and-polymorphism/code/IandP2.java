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

class PhDStudent extends ResearchStudent {
  String thesisTitle;
  public PhDStudent(String n, int y, String ra, String tt) {
    super(n, y, ra);
    thesisTitle = tt;
  }
}

public class IandP2 {
  public static void main(String[] a) {
    Student s1 = new Student("Sujit", 3);
    System.out.println(s1.getDetails());
    ResearchStudent s2 = new ResearchStudent("Karthika", 4, "Software Engineering");
    System.out.println(s2.getDetails());
    PhDStudent s3 = new PhDStudent("Nikhil", 1, "MG", "Automated Evaluation");
    System.out.println(s3.getDetails());
  }
}

/*
  WHAT HAVE WE LEARNED
  --------------------
  - Inheriting further subclass (e.g. PhDStudent) from a class (e.g. ResearchStudent) which 
    itself is a subclass of another class (e.g. Student).
*/
