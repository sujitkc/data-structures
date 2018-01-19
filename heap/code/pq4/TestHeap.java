import java.util.Comparator;

import junit.framework.*;

public class TestHeap extends TestCase {
  private Heap<Integer> heap = new Heap<Integer>(
    new Comparator<Integer>() {
      public int compare(Integer i1, Integer i2) {
        return i1.compareTo(i2);
      }
    }
  );
  
  protected void setUp(){
  }

  public void testAdd(){
    this.heap.add(1);
    System.out.println("size1 = " + this.heap.size());
  }
 
  public void testRemove() {
    System.out.println("size2 = " + this.heap.size());
    this.heap.add(1);
    System.out.println("size3 = " + this.heap.size());
    System.out.println(this.heap.removeMinimum());
  }

  public void testGetRoot() {

    this.heap.add(2);
    this.heap.add(1);
    System.out.println("minimum = " + this.heap.minimum());
  }
 
  public void testSort() {

  } 

}


