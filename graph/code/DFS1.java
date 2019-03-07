import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class DFS1 {

  private static Set<Node<Integer>> visited = new HashSet<Node<Integer>>();

  public static void main(String[] args) {

    // comment out two out of the following three lines
    // based on which graph implementation you wish to use.
    // MyGraph<Integer> graph = new EdgeList<Integer>();
    MyGraph<Integer> graph = new AdjacencyMatrix<Integer>();
    // MyGraph<Integer> graph = new AdjacencyList<Integer>();

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
      graph.addEdge(n4, n5);

      Map<Node<Integer>, Integer> dfs_nums = DFS1.dfs(graph, n2);
      for(Node<Integer> n : dfs_nums.keySet()) {
        System.out.println(n + " : " + dfs_nums.get(n));
      }
    }
    catch(Exception e) {
      System.out.println(e.getMessage());
    }
  }

  public static Map<Node<Integer>, Integer> dfs(MyGraph<Integer> graph, Node<Integer> node) throws Exception {
    Map<Node<Integer>, Integer> dfs_nums = new HashMap<Node<Integer>, Integer>();
    DFS1.visited.clear();
    
    // comment out one of the following two lines of code
    // based on whether you wish to do pre-order or post-order DFS.
    DFS1.dfs_preorder(graph, node, dfs_nums);  // for pre-order DFS
    // DFS1.dfs_postorder(graph, node, dfs_nums);  // for post-order DFS
    return dfs_nums;
  }

  private static void dfs_preorder(MyGraph<Integer> graph, Node<Integer> node, Map<Node<Integer>, Integer> dfs_nums) throws Exception {
    if(DFS1.visited.contains(node)) {
      return;
    }
    DFS1.visited.add(node);
    dfs_nums.put(node, dfs_nums.size()); // process
    for(Node<Integer> neighbour : graph.getAllNeighbours(node)) {
      DFS1.dfs_preorder(graph, neighbour, dfs_nums);
    }
    return;
  }

  private static void dfs_postorder(MyGraph<Integer> graph, Node<Integer> node, Map<Node<Integer>, Integer> dfs_nums) throws Exception {
    if(DFS1.visited.contains(node)) {
      return;
    }
    DFS1.visited.add(node);
    for(Node<Integer> neighbour : graph.getAllNeighbours(node)) {
      DFS1.dfs_postorder(graph, neighbour, dfs_nums);
    }
    dfs_nums.put(node, dfs_nums.size()); // process
    return;
  }
}
