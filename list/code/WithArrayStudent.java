public class WithArrayStudent {

  public static void main(String[] args) {
    Student s1 = new Student("Sujit", 1);
    Student s2 = new Student("Siddharth", 2);
    Student s3 = new Student("Karanpreet", 3);

    Student studentList[] = {s1, s2, s3};
    printStudentList(studentList);
  }

  public static void printStudentList(Student[] students) {
    for(Student s : students) {
      System.out.println(s.getDetails());
    }
  }
}

class Student {
  private final String name;
  private final int rollNumber;

  public Student(String name, int rollNumber) {
    this.name = name;
    this.rollNumber = rollNumber;
  }

  public String getDetails() {
    return
      "name = " + this.name + '\n' +
      "roll number = " + this.rollNumber + '\n';
  }
}
/*
  SUMMARY
  =======
  1. Just to remind: Arrays can be used to store objects of any type.
*/
