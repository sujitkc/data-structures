import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Arrays;

public class ListPolymorphism {

  public static void main(String[] args) {
    List<String> studentList1 = new ArrayList<String>(Arrays.asList("Tricha", "Murali", "Sujit"));
    List<String> studentList2 = new LinkedList<String>(Arrays.asList("Siddharth", "Karanpreet"));

    printStudents(studentList1);
    printStudents(studentList2);
  }
  
  public static void printStudents(List<String> students) {
      System.out.println("Printing student list ...");
      for(int i = 0; i < students.size(); i++) {
        System.out.println("Student number " + i + " : " + students.get(i)); // correct way.
      }
  }
}

/*
  SUMMARY
  =======

  printStudents as a polymorphic function. It uses List (which is a super-class of ArrayList and List) 
    instead of ArrayList or List, thus inter-operates smoothly with both types.
*/
