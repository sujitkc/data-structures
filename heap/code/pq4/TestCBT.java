import junit.framework.*;
import java.util.Comparator;

public class TestCBT extends TestCase {
  private CompleteBinaryTree<Integer> tree = new CompleteBinaryTree(
    new Comparator<Integer>() {
      public int compare(Integer i1, Integer i2) {
        return i1.compareTo(i2);
      }
    }
  );
  
  protected void setUp(){
  }

  public void testAdd(){
    System.out.println("testAdd");
    this.tree.add(1);
    System.out.println("size1 = " + this.tree.size());
  }
 
  public void testRemove() {
    System.out.println("testRemove");
    System.out.println("size2 = " + this.tree.size());
    this.tree.add(1);
    System.out.println("size3 = " + this.tree.size());
    System.out.println(this.tree.remove());
  } 
}


