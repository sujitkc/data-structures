import java.util.List;
import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack<T> {
  private List<T> list = new ArrayList<T>();

  public void push(T e) {
    this.list.add(e);
  }

  public T pop() {
    if(this.list.size() > 0) {
      T e = list.get(list.size() - 1);
      list.remove(list.size() - 1);
      return e;
    }
    throw new EmptyStackException();
  }

  public boolean isEmpty() {
    return this.list.size() == 0;
  }
}
