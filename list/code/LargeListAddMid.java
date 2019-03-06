import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class LargeListAddMid {

  public static void main(String[] args) {
    // creating large ArrayList
    List<Integer> list1 = new ArrayList<Integer>();
    for(int i = 0; i < 100000; i++) {
      list1.add(i);
    }
 
    // creating large LinkedList
    List<Integer> list2 = new LinkedList<Integer>();
    for(int i = 0; i < 100000; i++) {
      list2.add(i);
    }

    // estimating ArrayList performance
    final long start1 = System.nanoTime();

    list1.add(99999, 1); // test operation ArrayList

    final long end1 = System.nanoTime();
    final long time1 = end1 - start1;
    System.out.println("ArrayList took " + time1 + " ns.");


    // estimating LinkedList performance
    final long start2 = System.nanoTime();

    list2.add(99999, 1); // test operation LinkedList

    final long end2 = System.nanoTime();
    final long time2 = end2 - start2;
    System.out.println("LinkedList took " + time2 + " ns.");

    System.out.println("Arrays faster by " + (time2 - time1) + "!");
  }
 }

/*
  SUMMARY
  =======

*/
