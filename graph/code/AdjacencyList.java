import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class AdjacencyList<T> implements MyGraph<T>{
  Set<Node<T>> nodes = new HashSet<Node<T>>();

  Map<Node<T>, Set<Node<T>>> neighbours = new HashMap<Node<T>, Set<Node<T>>>();

  public Set<Node<T>> getAllNodes() {
    return this.nodes;
  }

  public Node<T> addNode(T e) {
    Node<T> newNode = new Node<T>(e);
    this.nodes.add(newNode);
    this.neighbours.put(newNode, new HashSet<Node<T>>());
    return newNode;
  }

  public Edge<T> addEdge(Node<T> n1, Node<T> n2) throws Exception {
    if(!this.nodes.contains(n1) || !this.nodes.contains(n2)) {
      throw new Exception("At least one of the nodes not contained in this graph.");
    }
    this.neighbours.get(n1).add(n2);
    this.neighbours.get(n2).add(n1);

    return new Edge<T>(n1, n2);
  }


  public Set<Node<T>> getAllNeighbours(Node<T> node) throws Exception {
    if(this.nodes.contains(node) == false) {
      throw new Exception("node not contained in this graph.");
    }
    return this.neighbours.get(node);
  }
}
