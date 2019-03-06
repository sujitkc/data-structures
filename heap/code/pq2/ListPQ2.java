import java.lang.Comparable;
import java.util.List;

public class ListPQ2<T extends Comparable> extends ListPQ<T> {
  public void add(T element) {
    if(!this.isEmpty()) {
      for(int i = 0; i < this.list.size(); i++) {
        T e = this.list.get(i);
        if(e.compareTo(element) >= 0) {
          this.list.add(i, element);
          return;
        }
      }
    }
    this.list.add(element);
  }

  public T removeMinimum() {
    return this.list.remove(0);
  }

  public T minimum() {
    return this.list.get(0);
  }
}
