import java.util.Comparator;

public class TestTree {
  private static Tree<Integer> tree;
 
  public static void setUp(){
    System.out.println("\nsetup");
    tree = new Tree<Integer>(
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
    test_deleteNode();
  }

  public static void test_getRoot(){
    setUp();
    System.out.println("test_getRoot");
    System.out.println("root = " + tree.getRoot());
  }

  public static void test_getNumberOfNodes(){
    setUp();
    System.out.println("test_getNumberOfNodes");
    System.out.println("size = " + tree.getNumberOfNodes());
  }

  public static void test_find(){
    setUp();
    System.out.println("test_find");
    try {
      System.out.println("find(17) = " + tree.find(17));
      System.out.println("find(9) = " + tree.find(9));
      TreeNode<Integer> root = tree.getRoot();
      System.out.println(tree.addChild(root, 9));
      System.out.println(tree.addChild(root, 11));
      System.out.println("find(11) = " + tree.find(11));
      System.out.println("find(9) = " + tree.find(9));
    }
    catch(Exception e) {
      System.out.println(e.getMessage());
    }
  }

  public static void test_addChild(){
    setUp();
    System.out.println("test_addChild");
    try {
      TreeNode<Integer> root = tree.getRoot();
      System.out.println(tree.addChild(root, 9));
      System.out.println(tree.addChild(root, 11));
      System.out.println("size = " + tree.getNumberOfNodes());
      System.out.println(tree.addChild(root, 21));
    }
    catch(Exception e) {
      System.out.println(e.getMessage());
    }
  }

  public static void test_deleteNode(){
    setUp();
    System.out.println("test_deleteNode");
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

      System.out.println("size = " + tree.getNumberOfNodes());

      tree.deleteNode(n6); // delete(4)
      tree.deleteNode(n3); // delete(10)
      tree.deleteNode(n10); // delete(27)

      System.out.println("size = " + tree.getNumberOfNodes());
    }
    catch(Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
