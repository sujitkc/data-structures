import java.lang.Comparable;

public interface MyPriorityQueue<T extends Comparable> {
  
  T removeMinimum();
  T minimum();
  void add(T element);
  boolean isEmpty();
  int size();
}
