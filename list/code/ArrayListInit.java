import java.util.*;
import java.util.Arrays;

public class ArrayListInit {

  public static void main(String[] args) {
    ArrayList<Student> studentList = new ArrayList<Student>(Arrays.asList(
        new Student("Sujit", 1),
        new Student("Siddharth", 2),
        new Student("Karanpreet", 3)
      ));

    printStudentList(studentList);
  }

  public static void printStudentList(ArrayList<Student> students) {
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
  1. A convenient way to initialise an ArrayList.
*/
