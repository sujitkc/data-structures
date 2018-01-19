import java.util.Map;
import java.util.HashMap;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Random;

public class Dijkstra {
  public static void main(String[] args) {
    MyGraph<String> graph = new AdjacencyList<String>();

    Node<String> c1 = graph.addNode("C1");
    Node<String> c2 = graph.addNode("C2");
    Node<String> c3 = graph.addNode("C3");
    Node<String> c4 = graph.addNode("C4");
    Node<String> c5 = graph.addNode("C5");
    Node<String> c6 = graph.addNode("C6");
    Node<String> c7 = graph.addNode("C7");
    Node<String> c8 = graph.addNode("C8");
    Node<String> c9 = graph.addNode("C9");

    try {
      graph.addEdge(c1, c2, 100);
      graph.addEdge(c1, c3, 140);
      graph.addEdge(c1, c4, 180);
      graph.addEdge(c1, c7, 500);
      graph.addEdge(c2, c4, 150);
      graph.addEdge(c2, c9, 450);
      graph.addEdge(c3, c4, 125);
      graph.addEdge(c3, c5, 125);
      graph.addEdge(c3, c6, 160);
      graph.addEdge(c3, c7, 200);
      graph.addEdge(c3, c8, 350);
      graph.addEdge(c4, c6, 250);
      graph.addEdge(c4, c9, 120);
      graph.addEdge(c5, c9, 125);
      graph.addEdge(c6, c7, 100);
      graph.addEdge(c6, c8, 80);
      graph.addEdge(c6, c9, 300);
      graph.addEdge(c7, c9, 650);

      Map<Node<String>, Integer> paths = shortestPath(graph, c1);

      for(Node<String> n : paths.keySet()) {
        System.out.println(n + " : " + paths.get(n));
      }
    }
    catch(Exception e) {
      System.out.println(e.getMessage());
      System.exit(1);
    }
  }

  private static int maximumDistance(MyGraph<String> graph) {
    int sum = 0;
    for(Edge<String> edge : graph.getAllEdges()) {
      sum += edge.weight;
    }
    return sum + 1;
  }

  static class MyComparator<T extends Node<String>> implements Comparator<T> {
    private final Map<Node<String>, Integer> distances;

    public MyComparator(Map<Node<String>, Integer> distances) {
      this.distances = distances;
    }

    public int compare(T n1, T n2) {
      if(this.distances.get(n1) < this.distances.get(n2)) {
        return -1;
      }
      else if(this.distances.get(n1) > this.distances.get(n2)) {
        return 1;
      }
      else {
        return 0;
      }
    }
  }

  private static void relax(Edge<String> edge, Map<Node<String>, Integer> distances) {
    int possible = distances.get(edge.n1) + edge.weight;
    if(distances.get(edge.n2) > possible) {
      distances.put(edge.n2, possible);
    }
  }

  public static Map<Node<String>, Integer> shortestPath(MyGraph<String> graph, Node<String> start) throws Exception {
    Map<Node<String>, Integer> distances = new HashMap<Node<String>, Integer>();
    int max = maximumDistance(graph);
    for(Node<String> node : graph.getAllNodes()) {
      distances.put(node, max);
    }
 
    distances.put(start, 0);
    PriorityQueue<Node<String>> queue = new PriorityQueue<Node<String>>(11, new MyComparator<Node<String>>(distances));
    for(Node<String> n : graph.getAllNodes()) {
      queue.add(n);
    }

    while(queue.isEmpty() == false) {
      Node<String> nextNode = queue.poll();
      for(Edge<String> edge : graph.getAllOutgoingEdges(nextNode)) {
        relax(edge, distances);
      }
    }
    return distances;
  }
}
