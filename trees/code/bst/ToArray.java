import java.util.Comparator;
import java.lang.Comparable;

public class ToArray {

  public static void main(String[] args) {
    t1();
    t2();
  }

  public static void t1() {
    BST<String> tree = new BST<String>("Ajmer",
      new Comparator<Comparable>() {
        public int compare(Comparable i1,Comparable i2) {
          return i1.compareTo(i2);
        }
      }
    );

    tree.addNode("Nagpur");
    tree.addNode("Hyderabad");
    tree.addNode("Kanpur");
    tree.addNode("Zambia");
    tree.addNode("Russia");

    System.out.println(tree.getNumberOfNodes());
    System.out.println(tree.find("Nagpur"));
    System.out.println(tree.find("Zambia"));

    System.out.println(ToArray.toArray(tree));
  }

  public static <T extends Comparable> String toArray(BST<T> tree) {
    return ToArray.toArray(tree.getRoot());
  }

  public static <T extends Comparable> String toArray(BSTNode<T> node) {
    Array array = new Array(node);
    return array.toString();
  }

  public static void t2() {
    BST<Integer> tree = new BST<Integer>(13,
      new Comparator<Comparable>() {
        public int compare(Comparable i1,Comparable i2) {
          return i1.compareTo(i2);
        }
      }
    );

    tree.addNode(3);
    tree.addNode(4);
    tree.addNode(12);
    tree.addNode(14);
    tree.addNode(10);
    tree.addNode(5);
    tree.addNode(1);
    tree.addNode(8);
    tree.addNode(2);
    tree.addNode(7);
    tree.addNode(9);
    tree.addNode(11);
    tree.addNode(6);
    tree.addNode(18);

    System.out.println(ToArray.toArray(tree));
  }
}
