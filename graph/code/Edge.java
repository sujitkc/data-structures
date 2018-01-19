import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class Edge<T> {
  public final Node<T> n1;
  public final Node<T> n2;

  public Edge(Node<T> n1, Node<T> n2) {
    this.n1 = n1;
    this.n2 = n2;
  }

  public boolean equals(Edge<T> e) {
    return (this.n1.equals(e.n1) && this.n2.equals(n2)) ||
      (this.n2.equals(e.n1) && this.n1.equals(n2));
  }
}
