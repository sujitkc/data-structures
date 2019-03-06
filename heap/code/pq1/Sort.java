import java.util.List;
import java.util.ArrayList;

public class Sort {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<Integer>();
    list.add(3);
    list.add(5);
    list.add(1);
    list.add(4);
    list.add(2);

    MyPriorityQueue pq = new ListPQ1();

    while(list.isEmpty() == false) {
      pq.add(list.remove(0));
    }

    while(pq.isEmpty() == false) {
      list.add(pq.removeMinimum());
    }
    for(Integer i : list) {
      System.out.println(i);
    }
  }
}
