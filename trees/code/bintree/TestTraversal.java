import java.util.Comparator;

public class TestTraversal {
  private static BinaryTree<Integer> tree;

  private static Traversal<Integer> traversal;
  
  protected static void setUp(){
    try {
      tree = new BinaryTree<Integer>(
        17,
        new Comparator<Integer>() {
          public int compare(Integer i1, Integer i2) {
            return i1.compareTo(i2);
          }
        }
      );
      traversal = new Traversal<Integer>(tree);

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
    }
    catch(Exception e) {
      System.out.println(e.getMessage());
    }
  }

  public static void main(String[] args) {
    test_postorder();
    test_preorder();
    test_inorder();
    test_bfs();
  }

  public static void test_postorder(){
    setUp();
    System.out.println("testing postorder ...");
    traversal.postorder();      
  }

  public static void test_preorder(){
    setUp();
    System.out.println("testing preorder ...");
    traversal.preorder();      
  }

  public static void test_inorder(){
    setUp();
    System.out.println("testing inorder ...");
    traversal.inorder();      
  }

  public static void test_bfs(){
    setUp();
    System.out.println("testing bfs ...");
    traversal.bfs();      
  }

}
