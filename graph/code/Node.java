import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
public class Node<T> {
  private T value;
  private Set<Node<T>> neighbours = new HashSet<Node<T>>();

  public Node(T value) {
    this.value = value;
  }

  public String toString() {
    return this.value.toString();
  }

}
