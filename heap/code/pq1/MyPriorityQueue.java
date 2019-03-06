import java.lang.Comparable;

public interface MyPriorityQueue {
  
  Integer removeMinimum();
  Integer minimum();
  void add(Integer element);
  boolean isEmpty();
  int size();
}
