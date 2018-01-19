import java.util.LinkedList;

public class MyQueue<T> {

  private LinkedList<T> list = new LinkedList<T>();
  public void add(T el) {
    this.list.add(el);
  }

  public T remove() {
    return this.list.remove();
  }

  public int size() {
    return this.list.size();
  }
}
