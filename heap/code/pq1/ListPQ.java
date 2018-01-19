import java.util.List;
import java.util.ArrayList;

public abstract class ListPQ implements MyPriorityQueue {
  protected final List<Integer> list = new ArrayList<Integer>();

  public boolean isEmpty() {
    return this.list.isEmpty();
  }

  public int size() {
    return this.list.size();
  }
}
