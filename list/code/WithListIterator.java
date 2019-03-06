import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

public class WithListIterator {

  public static void main(String[] args) {

    List<String> studentList = new ArrayList<String>(
      Arrays.asList("Tricha", "Murali", "Sujit", "Siddharth", "Karanpreet"));
//    iterateElsewhere(studentList);
    anyIterator();
  }

  private static void iterateFwd(List<String> studentList) {
    ListIterator<String> it = studentList.listIterator();

    while(it.hasNext()) {
      System.out.println(it.next());
    }
  }

  private static void iterateBkwd(List<String> studentList) {
    ListIterator<String> it = studentList.listIterator(studentList.size());

    while(it.hasPrevious()) {
      System.out.println(it.previous());
    }
  }

  private static void iterateFwdBkwd(List<String> studentList) {
    ListIterator<String> it = studentList.listIterator();

    while(it.hasNext()) {
      System.out.println(it.next());
    }

    while(it.hasPrevious()) {
      System.out.println(it.previous());
    }
  }

  private static void iterateSplit(List<String> studentList) {
    ListIterator<String> it = studentList.listIterator();

    while(it.nextIndex() < 3) {
      System.out.println(it.next());
    }

    System.out.println("Doing something else in between ...");

    while(it.hasNext()) {
      System.out.println(it.next());
    }
  }

  private static void iterateElsewhere(List<String> studentList) {
    ListIterator<String> it = studentList.listIterator();
    justListIterate(it);
  }

  private static void justListIterate(ListIterator<String> it) {
    while(it.hasNext()) {
      System.out.println(it.next());
    }
  }

  private static void anyIterator() {
    List<String> list = new ArrayList<String>();

    list.add("Tricha");
    list.add("Murali");
    list.add("Sujit");
    list.add("Siddharth");
    list.add("Karanpreet");

    Iterator<String> list_it = list.listIterator();
    justIterate(list_it);

    Set<String> set = new HashSet<String>();

    set.add("Tricha");
    set.add("Murali");
    set.add("Sujit");
    set.add("Siddharth");
    set.add("Karanpreet");

    Iterator<String> set_it = set.iterator();
    justIterate(set_it);
  }

  private static void justIterate(Iterator<String> it) {
    System.out.println("Printing elements ...");
    while(it.hasNext()) {
      System.out.println(it.next());
    }
  }
}
