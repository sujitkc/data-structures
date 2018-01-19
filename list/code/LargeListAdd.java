import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class LargeListAdd {

  public static void main(String[] args) {
    List<Integer> list1 = new ArrayList<Integer>();
    for(int i = 0; i < 100000; i++) {
      list1.add(i);
    }
    List<Integer> list2 = new LinkedList<Integer>();
    for(int i = 0; i < 100000; i++) {
      list2.add(i);
    }

    // estimating ArrayList performance
    final long start1 = System.nanoTime();
    for(int i = 0; i < 100000; i++) {
      list1.add(0, i);
    }
    final long end1 = System.nanoTime();
    final long time1 = end1 - start1;


    // estimating LinkedList performance
    final long start2 = System.nanoTime();
    for(int i = 0; i < 100000; i++) {
      list2.add(0, i);
    }
    final long end2 = System.nanoTime();
    final long time2 = end2 - start2;

    // printing result
    System.out.println("ArrayList took " + time1 + " ns.");
    System.out.println("LinkedList took " + time2 + " ns.");
    System.out.println("Linked Lists faster by a factor of " + time1/time2 + "!");
  }
 }

/*
  SUMMARY
  =======

*/
