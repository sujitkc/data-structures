import junit.framework.*;
import java.util.Comparator;

public class TestBinaryTree extends TestCase {
  private BinaryTree<Integer> tree = new BinaryTree<Integer>(
    10,
    new Comparator<Integer>() {
      public int compare(Integer i1, Integer i2) {
        return i1.compareTo(i2);
      }
    }
  );
  
  protected void setUp(){
  }

  public void test_getRoot(){
    System.out.println("root = " + tree.getRoot());
  }

  public void test_getNumberOfNodes(){
    System.out.println("size = " + tree.getNumberOfNodes());
  }

  public void test_find(){
    try {
      System.out.println("find(10) = " + tree.find(10));
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

  public void test_setRight_Left(){
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

}


