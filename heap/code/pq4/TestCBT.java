import junit.framework.*;

public class TestCBT extends TestCase {
  private CompleteBinaryTree<Integer> tree = new CompleteBinaryTree();
  
  protected void setUp(){
  }

  public void testAdd(){
    this.tree.add(1);
    System.out.println("size1 = " + this.tree.size());
  }
 
  public void testRemove() {
    System.out.println("size2 = " + this.tree.size());
    this.tree.add(1);
    System.out.println("size3 = " + this.tree.size());
    System.out.println(this.tree.remove());
  } 
}


