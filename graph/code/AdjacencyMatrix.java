import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class AdjacencyMatrix<T> implements MyGraph<T>{
  List<Node<T>> nodes = new ArrayList<Node<T>>();
  boolean[][] adjacencyMatrix = new boolean[0][0];
  Map<Node<T>, Set<Node<T>>> neighbours = new HashMap<Node<T>, Set<Node<T>>>();

  public Set<Node<T>> getAllNodes() {
    Set<Node<T>> set = new HashSet<Node<T>>();
    for(Node n : this.nodes) {
      set.add(n);
    }
    return set;
  }

  public Node<T> addNode(T e) {
    Node<T> newNode = new Node<T>(e);
    this.nodes.add(newNode);
    boolean[][] m = new boolean[this.nodes.size()][this.nodes.size()];
    for(int i = 0; i < m.length; i++) {
      for(int j = 0; j < m.length; j++) {
        m[i][j] = false;
      }
    }
    for(int i = 0; i < this.adjacencyMatrix.length; i++) {
      for(int j = 0; j < this.adjacencyMatrix.length; j++) {
        m[i][j] = this.adjacencyMatrix[i][j];
      }
    }
    this.adjacencyMatrix = m;
    return newNode;
  }

  public Edge<T> addEdge(Node<T> n1, Node<T> n2) throws Exception {
    if(!this.nodes.contains(n1) || !this.nodes.contains(n2)) {
      throw new Exception("At least one of the nodes not contained in this graph.");
    }
    int row = this.nodes.indexOf(n1);
    int col = this.nodes.indexOf(n2);
    this.adjacencyMatrix[row][col] = true;
    this.adjacencyMatrix[col][row] = true;
    return new Edge<T>(n1, n2);
  }


  public Set<Node<T>> getAllNeighbours(Node<T> node) throws Exception {
    if(this.nodes.contains(node) == false) {
      throw new Exception("node not contained in this graph.");
    }
    Set<Node<T>> neighbours = new HashSet<Node<T>>();
    int row = this.nodes.indexOf(node);
    for(int i = 0; i < this.adjacencyMatrix.length; i++) {
      if(this.adjacencyMatrix[row][i] == true) {
        neighbours.add(this.nodes.get(i));
      }
    }
    return neighbours;
  }
}
