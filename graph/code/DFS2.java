import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class DFS2 {

  public static void main(String[] args) {
    MyGraph<Integer> graph = new EdgeList<Integer>();

    Node<Integer> n1 = graph.addNode(1);
    Node<Integer> n2 = graph.addNode(2);
    Node<Integer> n3 = graph.addNode(3);
    Node<Integer> n4 = graph.addNode(4);
    Node<Integer> n5 = graph.addNode(5);
    Node<Integer> n6 = graph.addNode(6);

    try {
      graph.addEdge(n1, n2);
      graph.addEdge(n1, n3);
      graph.addEdge(n1, n4);
      graph.addEdge(n1, n5);
      graph.addEdge(n2, n4);
      graph.addEdge(n3, n4);
      graph.addEdge(n3, n5);
      graph.addEdge(n4, n5);
      graph.addEdge(n6, n5);
      Set<Node<Integer>> reachable = DFS2.dfs(graph, n2);
      for(Node<Integer> n : reachable) {
        System.out.println(n);
      }
    }
    catch(Exception e) {
      System.out.println(e.getMessage());
    }
  }

  public static Set<Node<Integer>> dfs(MyGraph<Integer> graph, Node<Integer> n) throws Exception {
    Set<Node<Integer>> reachable = new HashSet<Node<Integer>>();
    DFS2.dfs_rec(graph, n, reachable);
    return reachable;
  }

  private static void dfs_rec(MyGraph<Integer> graph, Node<Integer> node, Set<Node<Integer>> reachable) throws Exception {
    if(reachable.contains(node)) {
      return;
    }
    reachable.add(node);
    for(Node<Integer> neighbour : graph.getAllNeighbours(node)) {
      DFS2.dfs_rec(graph, neighbour, reachable);
    }
  }
}
