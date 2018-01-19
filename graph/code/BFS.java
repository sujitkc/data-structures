import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Queue;
import java.util.LinkedList;

public class BFS {

  public static void main(String[] args) {
//    MyGraph<Integer> graph = new EdgeList<Integer>();
    MyGraph<Integer> graph = new AdjacencyMatrix<Integer>();
//    MyGraph<Integer> graph = new AdjacencyList<Integer>();

    Node<Integer> n1 = graph.addNode(1);
    Node<Integer> n2 = graph.addNode(2);
    Node<Integer> n3 = graph.addNode(3);
    Node<Integer> n4 = graph.addNode(4);
    Node<Integer> n5 = graph.addNode(5);

    try {
      graph.addEdge(n1, n2);
      graph.addEdge(n1, n3);
      graph.addEdge(n1, n4);
      graph.addEdge(n1, n5);
      graph.addEdge(n2, n4);
      graph.addEdge(n3, n4);
      graph.addEdge(n3, n5);
      graph.addEdge(n4, n5);
    }
    catch(Exception e) {
      System.out.println(e.getMessage());
    }
    Map<Node<Integer>, Integer> levels;
    try {
      levels = BFS.bfs(graph, n2);
      for(Node<Integer> n : levels.keySet()) {
        System.out.println(n + " : " + levels.get(n));
      }
    }
    catch(Exception e) {
      System.out.println(e.getMessage());
      System.exit(1);
    }

  }

  public static Map<Node<Integer>, Integer> bfs(MyGraph<Integer> graph, Node<Integer> n) throws Exception {
    Queue<Node<Integer>> queue = new LinkedList<Node<Integer>>();
    Map<Node<Integer>, Integer> levels = new HashMap<Node<Integer>, Integer>();
    queue.add(n);
    levels.put(n, 0);
    while(queue.isEmpty() == false) {
      Node<Integer> nextNode = queue.remove();
      Set<Node<Integer>> neighbours = graph.getAllNeighbours(nextNode);
      for(Node<Integer> neighbour : neighbours) {
        if(levels.containsKey(neighbour) == false) {
          queue.add(neighbour);
          levels.put(neighbour, levels.get(nextNode) + 1);
        }
      }
    }
    return levels;
  }
}
