import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public interface MyGraph<T> {

  Set<Node<T>> getAllNodes();
  Node<T> addNode(T e);

  /*
    throws exception when either of the nodes is not a member of the graph.
  */
  Edge<T> addEdge(Node<T> n1, Node<T> n2) throws Exception;

  /*
    throws exception when the node is not a member of the graph.
  */
  Set<Node<T>> getAllNeighbours(Node<T> node) throws Exception;
}
