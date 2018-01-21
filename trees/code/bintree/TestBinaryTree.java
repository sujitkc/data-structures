import java.util.Comparator;

public class TestBinaryTree {
  private static BinaryTree<Integer> tree;
  
  protected static void setUp(){
    tree = new BinaryTree<Integer>(
      17,
      new Comparator<Integer>() {
        public int compare(Integer i1, Integer i2) {
          return i1.compareTo(i2);
        }
      }
    );

  }

  public static void main(String[] arg) {
    test_getRoot();
    test_getNumberOfNodes();
    test_find();
    test_setRight_Left();
    test_deleteNode();
  }

  public static void test_getRoot(){
    setUp();
    System.out.println("root = " + tree.getRoot());
  }

  public static void test_getNumberOfNodes(){
    setUp();
    System.out.println("size = " + tree.getNumberOfNodes());
  }

  public static void test_find(){
    setUp();
    try {
      System.out.println("find(17) = " + tree.find(17));
      System.out.println("find(9) = " + tree.find(9));
      Node<Integer> root = tree.getRoot();
      System.out.println(tree.setRight(root, 9));
      System.out.println(tree.setLeft(root, 11));
      System.out.println("find(11) = " + tree.find(11));
      System.out.println("find(9) = " + tree.find(9));
    }
    catch(Exception e) {
      System.out.println(e.getMessage());
    }
  }

  public static void test_setRight_Left(){
    setUp();
    try {
      Node<Integer> root = tree.getRoot();
      System.out.println(tree.setRight(root, 9));
      System.out.println(tree.setLeft(root, 11));
      System.out.println("size = " + tree.getNumberOfNodes());
      System.out.println(tree.setRight(root, 21));
    }
    catch(Exception e) {
      System.out.println(e.getMessage());
    }
  }

  public static void test_deleteNode(){
    setUp();
    try {
      Node<Integer> root = tree.getRoot();
      Node<Integer> n1 = tree.setLeft(root, 13);
      Node<Integer> n2 = tree.setRight(root, 21);
      Node<Integer> n3 = tree.setLeft(n1, 10);
      Node<Integer> n4 = tree.setRight(n1, 15);
      Node<Integer> n5 = tree.setRight(n2, 24);
      Node<Integer> n6 = tree.setLeft(n3, 4);
      Node<Integer> n7 = tree.setRight(n3, 11);
      Node<Integer> n8 = tree.setRight(n4, 16);
      Node<Integer> n9 = tree.setLeft(n5, 23);
      Node<Integer> n10 = tree.setRight(n5, 27);
      Node<Integer> n11 = tree.setLeft(n10, 25);
      Node<Integer> n12 = tree.setRight(n11, 26);

      System.out.println("size = " + tree.getNumberOfNodes());

      tree.deleteNode(n6); // delete(4)
      tree.deleteNode(n6); // delete(10)
      tree.deleteNode(n10); // delete(27)

      System.out.println("size = " + tree.getNumberOfNodes());
    }
    catch(Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
