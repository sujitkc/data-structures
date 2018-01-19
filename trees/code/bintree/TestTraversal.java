import junit.framework.*;
import java.util.Comparator;

public class TestTraversal extends TestCase {
  private BinaryTree<Integer> tree = new BinaryTree<Integer>(
    17,
    new Comparator<Integer>() {
      public int compare(Integer i1, Integer i2) {
        return i1.compareTo(i2);
      }
    }
  );

  private Traversal<Integer> traversal = new Traversal<Integer>(tree);
  
  protected void setUp(){
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

    }
    catch(Exception e) {
      System.out.println(e.getMessage());
    }
  }

  public void test_postorder(){
    System.out.println("testing postorder ...");
    traversal.postorder();      
  }

  public void test_preorder(){
    System.out.println("testing preorder ...");
    traversal.preorder();      
  }

  public void test_inorder(){
    System.out.println("testing inorder ...");
    traversal.inorder();      
  }
}
