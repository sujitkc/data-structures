import java.lang.Comparable;
import java.util.List;
import java.util.ArrayList;

public abstract class ListPQ<T extends Comparable> implements MyPriorityQueue<T> {
  protected final List<T> list = new ArrayList<T>();

  public boolean isEmpty() {
    return this.list.isEmpty();
  }

  public int size() {
    return this.list.size();
  }
}
