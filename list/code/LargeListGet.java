import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class LargeListGet {

  public static void main(String[] args) {
    // creating ArrayList
    List<Integer> list1 = new ArrayList<Integer>();
    for(int i = 0; i < 100000; i++) {
      list1.add(i);
    }
 
    // creating LinkedList
    List<Integer> list2 = new LinkedList<Integer>();
    for(int i = 0; i < 100000; i++) {
      list2.add(i);
    }

   // measuring ArrayList performance
   final long start1 = System.nanoTime();

    // action performed
    System.out.println("array value = " + list1.get(99999/2));

    final long end1 = System.nanoTime();
    final long time1 = end1 - start1;
    System.out.println("ArrayList took " + time1 + " ns.");


   // estimating LinkedList performance
    final long start2 = System.nanoTime();

    // action performed
    System.out.println("array value = " + list2.get(99999/2));

    final long end2 = System.nanoTime();
    final long time2 = end2 - start2;
    System.out.println("Linked List took " + time2 + " ns.");

    System.out.println("ArrayList faster by  " + (time2 - time1) + " ns!");
  }
}

/*
  SUMMARY
  =======

*/
