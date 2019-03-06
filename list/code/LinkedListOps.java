
import java.util.LinkedList; // We have imported only the modules which we specifically need.
import java.util.Arrays;    // import ....* is often wasteful.

public class LinkedListOps {

  public static void main(String[] args) {
    LinkedList<String> studentList = new LinkedList<String>(Arrays.asList("Tricha", "Murali", "Sujit", "Siddharth", "Karanpreet"));
    printStudents(studentList);

    studentList.remove(2);
//    studentList.remove(5); // Will lead to IndexOutOfBoundsException exception. 
    studentList.set(2, "Gautam");
//    studentList.set(5, "Sujit"); // Will lead to IndexOutOfBoundsException exception. 
    printStudents(studentList);
  }
  
  public static void printStudents(LinkedList<String> students) {
      for(int i = 0; i < students.size(); i++) {
//        System.out.println("Student number " + i + " : " + students[i]); // wrong way of accessing elements; won't compile
        System.out.println("Student number " + i + " : " + students.get(i)); // correct way.
      }
  }
}

/*
  SUMMARY
  =======
  1. remove
  2. get
  3. set
  4. A 'best practice' regarding import. Avoid using '*' wherever possible.
*/
