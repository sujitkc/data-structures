import java.util.Comparator;
import java.lang.Comparable;

public class TestBST {

  public static void main(String[] args) {
    t1();
    t2();
    t3();
    t4();
    t5();
    t6();
    t7();
    t8();
    t9();
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

    System.out.println(TestBST.toArray(tree));
  }

  public static <T extends Comparable> String toArray(BST<T> tree) {
    return TestBST.toArray(tree.getRoot());
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

    BSTNode<Integer> n1  = tree.addNode(3);
    BSTNode<Integer> n2  = tree.addNode(4);
    BSTNode<Integer> n3  = tree.addNode(12);
    BSTNode<Integer> n4  = tree.addNode(14);
    BSTNode<Integer> n5  = tree.addNode(10);
    BSTNode<Integer> n6  = tree.addNode(5);
    BSTNode<Integer> n7  = tree.addNode(1);
    BSTNode<Integer> n8  = tree.addNode(8);
    BSTNode<Integer> n9  = tree.addNode(2);
    BSTNode<Integer> n10 = tree.addNode(7);
    BSTNode<Integer> n11 = tree.addNode(9);
    BSTNode<Integer> n12 = tree.addNode(11);
    BSTNode<Integer> n13 = tree.addNode(6);
    BSTNode<Integer> n14 = tree.addNode(18);

    System.out.println(TestBST.toArray(tree));
  }

  public static void t3() {
    BST<Integer> tree = new BST<Integer>(13,
      new Comparator<Comparable>() {
        public int compare(Comparable i1,Comparable i2) {
          return i1.compareTo(i2);
        }
      }
    );

    try {
      BSTNode<Integer> n1  = tree.addNode(3);
      BSTNode<Integer> n2  = tree.addNode(4);
      BSTNode<Integer> n3  = tree.addNode(12);
      BSTNode<Integer> n4  = tree.addNode(14);
      BSTNode<Integer> n5  = tree.addNode(10);
      BSTNode<Integer> n6  = tree.addNode(5);
      BSTNode<Integer> n7  = tree.addNode(1);
      BSTNode<Integer> n8  = tree.addNode(8);
      BSTNode<Integer> n9  = tree.addNode(2);
      BSTNode<Integer> n10 = tree.addNode(7);
      BSTNode<Integer> n11 = tree.addNode(9);
      BSTNode<Integer> n12 = tree.addNode(11);
      BSTNode<Integer> n13 = tree.addNode(6);
      BSTNode<Integer> n14 = tree.addNode(18);

      System.out.println(TestBST.toArray(tree));
      System.out.println("removing node " + n6 + " ...");
      tree.deleteNode(n6);
      System.out.println(TestBST.toArray(tree));
    }
    catch(Exception e) {
      System.out.println(e.getMessage());
    }

  }

  public static void t4() {
    BST<Integer> tree = new BST<Integer>(13,
      new Comparator<Comparable>() {
        public int compare(Comparable i1,Comparable i2) {
          return i1.compareTo(i2);
        }
      }
    );

    try {
      BSTNode<Integer> n1  = tree.addNode(3);
      BSTNode<Integer> n2  = tree.addNode(4);
      BSTNode<Integer> n3  = tree.addNode(12);
      BSTNode<Integer> n4  = tree.addNode(14);
      BSTNode<Integer> n5  = tree.addNode(10);
      BSTNode<Integer> n6  = tree.addNode(5);
      BSTNode<Integer> n7  = tree.addNode(1);
      BSTNode<Integer> n8  = tree.addNode(8);
      BSTNode<Integer> n9  = tree.addNode(2);
      BSTNode<Integer> n10 = tree.addNode(7);
      BSTNode<Integer> n11 = tree.addNode(9);
      BSTNode<Integer> n12 = tree.addNode(11);
      BSTNode<Integer> n13 = tree.addNode(6);
      BSTNode<Integer> n14 = tree.addNode(18);

      System.out.println(TestBST.toArray(tree));
      System.out.println("removing node " + n13 + " ...");
      tree.deleteNode(n13);
      System.out.println(TestBST.toArray(tree));
    }
    catch(Exception e) {
      System.out.println(e.getMessage());
    }
  }

  public static void t5() {
    BST<Integer> tree = new BST<Integer>(13,
      new Comparator<Comparable>() {
        public int compare(Comparable i1,Comparable i2) {
          return i1.compareTo(i2);
        }
      }
    );

    try {
      BSTNode<Integer> n1  = tree.addNode(3);
      BSTNode<Integer> n2  = tree.addNode(4);
      BSTNode<Integer> n3  = tree.addNode(12);
      BSTNode<Integer> n4  = tree.addNode(14);
      BSTNode<Integer> n5  = tree.addNode(10);
      BSTNode<Integer> n6  = tree.addNode(5);
      BSTNode<Integer> n7  = tree.addNode(1);
      BSTNode<Integer> n8  = tree.addNode(8);
      BSTNode<Integer> n9  = tree.addNode(2);
      BSTNode<Integer> n10 = tree.addNode(7);
      BSTNode<Integer> n11 = tree.addNode(9);
      BSTNode<Integer> n12 = tree.addNode(11);
      BSTNode<Integer> n13 = tree.addNode(6);
      BSTNode<Integer> n14 = tree.addNode(18);

      System.out.println(TestBST.toArray(tree));
      System.out.println("removing node " + n11 + " ...");
      tree.deleteNode(n11);
      System.out.println(TestBST.toArray(tree));
    }
    catch(Exception e) {
      System.out.println(e.getMessage());
    }
  }

  public static void t6() {
    BST<Integer> tree = new BST<Integer>(13,
      new Comparator<Comparable>() {
        public int compare(Comparable i1,Comparable i2) {
          return i1.compareTo(i2);
        }
      }
    );

    try {
      BSTNode<Integer> n1  = tree.addNode(3);
      BSTNode<Integer> n2  = tree.addNode(4);
      BSTNode<Integer> n3  = tree.addNode(12);
      BSTNode<Integer> n4  = tree.addNode(14);
      BSTNode<Integer> n5  = tree.addNode(10);
      BSTNode<Integer> n6  = tree.addNode(5);
      BSTNode<Integer> n7  = tree.addNode(1);
      BSTNode<Integer> n8  = tree.addNode(8);
      BSTNode<Integer> n9  = tree.addNode(2);
      BSTNode<Integer> n10 = tree.addNode(7);
      BSTNode<Integer> n11 = tree.addNode(9);
      BSTNode<Integer> n12 = tree.addNode(11);
      BSTNode<Integer> n13 = tree.addNode(6);
      BSTNode<Integer> n14 = tree.addNode(18);

      System.out.println(TestBST.toArray(tree));
      System.out.println("removing node " + n3 + " ...");
      tree.deleteNode(n3);
      System.out.println(TestBST.toArray(tree));
    }
    catch(Exception e) {
      System.out.println(e.getMessage());
    }
  }

  public static void t7() {
    BST<Integer> tree = new BST<Integer>(13,
      new Comparator<Comparable>() {
        public int compare(Comparable i1,Comparable i2) {
          return i1.compareTo(i2);
        }
      }
    );

    try {
      BSTNode<Integer> n1  = tree.addNode(3);
      BSTNode<Integer> n2  = tree.addNode(4);
      BSTNode<Integer> n3  = tree.addNode(12);
      BSTNode<Integer> n4  = tree.addNode(14);
      BSTNode<Integer> n5  = tree.addNode(10);
      BSTNode<Integer> n6  = tree.addNode(5);
      BSTNode<Integer> n7  = tree.addNode(1);
      BSTNode<Integer> n8  = tree.addNode(8);
      BSTNode<Integer> n9  = tree.addNode(2);
      BSTNode<Integer> n10 = tree.addNode(7);
      BSTNode<Integer> n11 = tree.addNode(9);
      BSTNode<Integer> n12 = tree.addNode(11);
      BSTNode<Integer> n13 = tree.addNode(6);
      BSTNode<Integer> n14 = tree.addNode(18);

      System.out.println(TestBST.toArray(tree));
      System.out.println("removing node " + n5 + " ...");
      tree.deleteNode(n5);
      System.out.println(TestBST.toArray(tree));
    }
    catch(Exception e) {
      System.out.println(e.getMessage());
    }
  }

  public static void t8() {
    BST<Integer> tree = new BST<Integer>(130,
      new Comparator<Comparable>() {
        public int compare(Comparable i1,Comparable i2) {
          return i1.compareTo(i2);
        }
      }
    );

    try {
      BSTNode<Integer> n1  = tree.addNode(30);
      BSTNode<Integer> n2  = tree.addNode(40);
      BSTNode<Integer> n3  = tree.addNode(120);
      BSTNode<Integer> n4  = tree.addNode(140);
      BSTNode<Integer> n5  = tree.addNode(150);
      BSTNode<Integer> n6  = tree.addNode(50);
      BSTNode<Integer> n7  = tree.addNode(10);
      BSTNode<Integer> n8  = tree.addNode(80);
      BSTNode<Integer> n9  = tree.addNode(20);
      BSTNode<Integer> n10 = tree.addNode(70);
      BSTNode<Integer> n11 = tree.addNode(90);
      BSTNode<Integer> n12 = tree.addNode(110);
      BSTNode<Integer> n13 = tree.addNode(60);
      BSTNode<Integer> n14 = tree.addNode(180);
      BSTNode<Integer> n15 = tree.addNode(135);

      System.out.println(TestBST.toArray(tree));
      System.out.println("removing node " + n4 + " ...");
      tree.deleteNode(n4);
      System.out.println(TestBST.toArray(tree));
    }
    catch(Exception e) {
      System.out.println(e.getMessage());
    }
  }

  // delete the root node.
  public static void t9() {
    BST<Integer> tree = new BST<Integer>(130,
      new Comparator<Comparable>() {
        public int compare(Comparable i1,Comparable i2) {
          return i1.compareTo(i2);
        }
      }
    );

    try {
      BSTNode<Integer> n1  = tree.addNode(30);
      BSTNode<Integer> n2  = tree.addNode(40);
      BSTNode<Integer> n3  = tree.addNode(120);
      BSTNode<Integer> n4  = tree.addNode(140);
      BSTNode<Integer> n5  = tree.addNode(150);
      BSTNode<Integer> n6  = tree.addNode(50);
      BSTNode<Integer> n7  = tree.addNode(10);
      BSTNode<Integer> n8  = tree.addNode(80);
      BSTNode<Integer> n9  = tree.addNode(20);
      BSTNode<Integer> n10 = tree.addNode(70);
      BSTNode<Integer> n11 = tree.addNode(90);
      BSTNode<Integer> n12 = tree.addNode(110);
      BSTNode<Integer> n13 = tree.addNode(60);
      BSTNode<Integer> n14 = tree.addNode(180);
      BSTNode<Integer> n15 = tree.addNode(135);

      System.out.println(TestBST.toArray(tree));
      BSTNode<Integer> root = tree.getRoot();
      System.out.println("removing node " + root + " ...");
      tree.deleteNode(root);
      System.out.println(TestBST.toArray(tree));
    }
    catch(Exception e) {
      System.out.println(e.getMessage());
    }
  }




}
