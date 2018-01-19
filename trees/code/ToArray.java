import java.util.Map;
import java.util.HashMap;

public class ToArray {

  public static void main(String[] args) {
    MyTree<String> tree = new MyTree<String>(new Node<String>("Ajmer"));
    tree.addNode(new Node<String>("Nagpur"));
    tree.addNode(new Node<String>("Hyderabad"));
    tree.addNode(new Node<String>("Kanpur"));
    tree.addNode(new Node<String>("Zambia"));
    tree.addNode(new Node<String>("Russia"));

    System.out.println(tree.getNumberOfNodes());
    System.out.println(tree.find("Nagpur"));
    System.out.println(tree.find("Zambia"));

    System.out.println(ToArray.toArray(tree));
  }

  public static <T extends Comparable> String toArray(MyTree<T> tree) {
    return ToArray.toArray(tree.getRoot());
  }

  public static <T extends Comparable> String toArray(Node<T> node) {
    Array array = new Array(node);
    return array.toString();
  }
}
