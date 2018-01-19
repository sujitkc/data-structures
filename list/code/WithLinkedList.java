import java.util.*;

public class WithLinkedList {

  public static void main(String[] args) {
    LinkedList studentList = new LinkedList();
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
      This is a type-unsafe approach of creating containers. We can add anything into the List which may
      result in a variety of runtime type errors.
  2. When printing, the LinkedList prints the elements in the same sequence as they had been inserted.
      In other words, LinkedList (and any other form of lists, including arrays) associate each element 
      with a integer index which indicates the position of the element in the list. This is an important
      property which can be safely exploited in the program design.
      There are other containers, e.g. Sets and Maps, where the position of an element is of no 
      consequence. A program using such containers must not depend on them to associate any notion of
      position to the elements for its correctness.
*/
