import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class AdjacencyList<T> implements MyGraph<T>{
  Set<Node<T>> nodes = new HashSet<Node<T>>();

  Map<Node<T>, Set<Edge<T>>> neighbours = new HashMap<Node<T>, Set<Edge<T>>>();

  public Set<Node<T>> getAllNodes() {
    return this.nodes;
  }

  public Set<Edge<T>> getAllEdges() {
    Set<Edge<T>> edges = new HashSet<Edge<T>>();
    for(Node<T> node : this.nodes) {
      for(Edge<T> edge : this.neighbours.get(node)) {
        edges.add(edge);
      }
    }
    return edges;
  }

  public Node<T> addNode(T e) {
    Node<T> newNode = new Node<T>(e);
    this.nodes.add(newNode);
    this.neighbours.put(newNode, new HashSet<Edge<T>>());
    return newNode;
  }

  public Edge<T> addEdge(Node<T> n1, Node<T> n2, int w) throws Exception {
    if(!this.nodes.contains(n1) || !this.nodes.contains(n2)) {
      throw new Exception("At least one of the nodes not contained in this graph.");
    }
    Edge<T> edge = new Edge(n1, n2, w);
    this.neighbours.get(n1).add(edge);

    return edge;
  }

  public Set<Node<T>> getAllNeighbours(Node<T> node) throws Exception {
    if(this.nodes.contains(node) == false) {
      throw new Exception("node not contained in this graph.");
    }
    Set<Node<T>> neighbours = new HashSet<Node<T>>();
    for(Edge<T> edge : this.neighbours.get(node)) {
      neighbours.add(edge.n2);
    }
    return neighbours;
  }

  public Set<Edge<T>> getAllOutgoingEdges(Node<T> node) throws Exception {
    if(this.nodes.contains(node) == false) {
      throw new Exception("node not contained in this graph.");
    }
    return this.neighbours.get(node);
  }
}
