import junit.framework.*;
import java.util.Comparator;

public class TestTraversal extends TestCase {
  private Tree<Integer> tree = new Tree<Integer>(
    17,
    new Comparator<Integer>() {
      public int compare(Integer i1, Integer i2) {
        return i1.compareTo(i2);
      }
    }
  );

  private Traversal<Integer> traversal = new Traversal<Integer>(tree);
  
  public void setUp(){
    System.out.println("\nsetup");
    this.tree = new Tree<Integer>(
      17,
      new Comparator<Integer>() {
        public int compare(Integer i1, Integer i2) {
          return i1.compareTo(i2);
        }
      }
    );
    this.traversal = new Traversal<Integer>(tree);

     try {
      TreeNode<Integer> root = tree.getRoot();
      TreeNode<Integer> n1   = tree.addChild(root, 13);
      TreeNode<Integer> n2   = tree.addChild(root, 21);
      TreeNode<Integer> n3   = tree.addChild(n1, 10);
      TreeNode<Integer> n4   = tree.addChild(n1, 15);
      TreeNode<Integer> n5   = tree.addChild(n2, 24);
      TreeNode<Integer> n6   = tree.addChild(n3, 4);
      TreeNode<Integer> n7   = tree.addChild(n3, 11);
      TreeNode<Integer> n8   = tree.addChild(n4, 16);
      TreeNode<Integer> n9   = tree.addChild(n5, 23);
      TreeNode<Integer> n10  = tree.addChild(n5, 27);
      TreeNode<Integer> n11  = tree.addChild(n10, 25);
      TreeNode<Integer> n12  = tree.addChild(n11, 26);
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
