import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class LargeListAddEnd {

  public static void main(String[] args) {
    List<Integer> list1 = new ArrayList<Integer>();
    for(int i = 0; i < 100000; i++) {
      list1.add(i);
    }
    final long start1 = System.nanoTime();
    list1.add(1);

//    for(int i = 0; i < 100000; i++) {
//      list1.add(i);
//    }
    final long end1 = System.nanoTime();
    final long time1 = end1 - start1;
    System.out.println("ArrayList took " + time1 + " ns.");

    List<Integer> list2 = new LinkedList<Integer>();
    for(int i = 0; i < 100000; i++) {
      list2.add(i);
    }
    final long start2 = System.nanoTime();
    list2.add(1);
//    for(int i = 0; i < 100000; i++) {
//      list2.add(i);
//    }
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
