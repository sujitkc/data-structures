import java.util.*;

public class WithLinkedListGeneric {

  public static void main(String[] args) {
    LinkedList<String> studentList = new LinkedList<String>();
    studentList.add("Sujit");
    studentList.add("Siddharth");
    studentList.add("Karanpreet");
    System.out.println(studentList);
  }
}

/*
  SUMMARY
  =======
  1. LinkedList Simple way to representation a dataset which is a collection of elementary data items.
      This is a type-safe approach of creating containers. Any attempt to add an element which is
      type-incompatible with the declared contained type will fail at the static type checking stage,
      resulting in a compile error.

*/
