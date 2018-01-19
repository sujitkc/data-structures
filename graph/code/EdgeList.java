import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class EdgeList<T> implements MyGraph<T> {
  Set<Node<T>> nodes = new HashSet<Node<T>>();
  Set<Edge<T>> edges = new HashSet<Edge<T>>();

  public Set<Node<T>> getAllNodes() {
    return this.nodes;
  }

  public Node<T> addNode(T e) {
    Node<T> newNode = new Node<T>(e);
    this.nodes.add(newNode);
    return newNode;
  }

  public Edge<T> addEdge(Node<T> n1, Node<T> n2) throws Exception {
    if(!this.nodes.contains(n1) || !this.nodes.contains(n2)) {
      throw new Exception("At least one of the nodes not contained in this graph.");
    }
    Edge<T> edge = new Edge(n1, n2);
    this.edges.add(edge);
    return edge;
  }

  public Set<Node<T>> getAllNeighbours(Node<T> node) throws Exception {
    if(!this.nodes.contains(node)) {
      throw new Exception("node not contained in this graph.");
    }
    Set<Node<T>> neighbours = new HashSet<Node<T>>();
    for(Edge<T> edge : this.edges) {
      if(edge.n1.equals(node)) {
        neighbours.add(edge.n2);
      }
      else if(edge.n2.equals(node)) {
        neighbours.add(edge.n1);
      }
    }
    return neighbours;
  }
}
