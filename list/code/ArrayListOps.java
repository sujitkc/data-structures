import java.util.ArrayList; // We have imported only the modules which we specifically need.
import java.util.Arrays;    // import ....* is often wasteful.

public class ArrayListOps {

  public static void main(String[] args) {
    ArrayList<String> studentList = new ArrayList<String>(Arrays.asList("Tricha", "Murali", "Sujit", "Siddharth", "Karanpreet"));
    printStudents(studentList);

    studentList.remove(2);
//    studentList.remove(5); // Will lead to IndexOutOfBoundsException exception. 
    studentList.set(2, "Gautam");
//    studentList.set(5, "Sujit"); // Will lead to IndexOutOfBoundsException exception. 
    printStudents(studentList);
  }
  
  public static void printStudents(ArrayList<String> students) {
      for(int i = 0; i < students.size(); i++) {
//        System.out.println("Student number " + i + " : " + students[i]); // wrong way of accessing elements; won't compile
        System.out.println("Student number " + i + " : " + students.get(i)); // correct way.
      }
  }
}

/*
  SUMMARY
  =======
  - remove
  - get
  - set
  - A 'best practice' regarding import. Avoid using '*' wherever possible.
*/
