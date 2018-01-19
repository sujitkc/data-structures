import java.lang.Comparable;
import java.util.List;

public class ListPQ1<T extends Comparable> extends ListPQ<T> {
  public void add(T element) {
    this.list.add(element);
  }

  public T removeMinimum() {
    return this.list.remove(minIndex());
  }

  public T minimum() {
    return this.list.get(0);
  }

  private int minIndex() {
    int minIndex = 0;
    T min = this.list.get(0);
    for(int i = 0; i < this.list.size(); i++) {
      T e = this.list.get(i);
      if(e.compareTo(min) == -1) {
        min = e;
        minIndex = i;
      }
    }
    return minIndex;
  }
}
