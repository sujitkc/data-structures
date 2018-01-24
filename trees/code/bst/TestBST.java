import binarytree.BinaryTree;
import binarytree.Node;
import bst.BST;
import prettyprint.Array;

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
    BST<String> tree = new BST<String>("Nagpur",
      new Comparator<Comparable>() {
        public int compare(Comparable i1,Comparable i2) {
          return i1.compareTo(i2);
        }
      }
    );

    tree.addNode("Ajmer");
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

  public static <T extends Comparable> String toArray(Node<T> node) {
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

    Node<Integer> n1  = tree.addNode(3);
    Node<Integer> n2  = tree.addNode(4);
    Node<Integer> n3  = tree.addNode(12);
    Node<Integer> n4  = tree.addNode(14);
    Node<Integer> n5  = tree.addNode(10);
    Node<Integer> n6  = tree.addNode(5);
    Node<Integer> n7  = tree.addNode(1);
    Node<Integer> n8  = tree.addNode(8);
    Node<Integer> n9  = tree.addNode(2);
    Node<Integer> n10 = tree.addNode(7);
    Node<Integer> n11 = tree.addNode(9);
    Node<Integer> n12 = tree.addNode(11);
    Node<Integer> n13 = tree.addNode(6);
    Node<Integer> n14 = tree.addNode(18);

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
      Node<Integer> n1  = tree.addNode(3);
      Node<Integer> n2  = tree.addNode(4);
      Node<Integer> n3  = tree.addNode(12);
      Node<Integer> n4  = tree.addNode(14);
      Node<Integer> n5  = tree.addNode(10);
      Node<Integer> n6  = tree.addNode(5);
      Node<Integer> n7  = tree.addNode(1);
      Node<Integer> n8  = tree.addNode(8);
      Node<Integer> n9  = tree.addNode(2);
      Node<Integer> n10 = tree.addNode(7);
      Node<Integer> n11 = tree.addNode(9);
      Node<Integer> n12 = tree.addNode(11);
      Node<Integer> n13 = tree.addNode(6);
      Node<Integer> n14 = tree.addNode(18);

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
      Node<Integer> n1  = tree.addNode(3);
      Node<Integer> n2  = tree.addNode(4);
      Node<Integer> n3  = tree.addNode(12);
      Node<Integer> n4  = tree.addNode(14);
      Node<Integer> n5  = tree.addNode(10);
      Node<Integer> n6  = tree.addNode(5);
      Node<Integer> n7  = tree.addNode(1);
      Node<Integer> n8  = tree.addNode(8);
      Node<Integer> n9  = tree.addNode(2);
      Node<Integer> n10 = tree.addNode(7);
      Node<Integer> n11 = tree.addNode(9);
      Node<Integer> n12 = tree.addNode(11);
      Node<Integer> n13 = tree.addNode(6);
      Node<Integer> n14 = tree.addNode(18);

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
      Node<Integer> n1  = tree.addNode(3);
      Node<Integer> n2  = tree.addNode(4);
      Node<Integer> n3  = tree.addNode(12);
      Node<Integer> n4  = tree.addNode(14);
      Node<Integer> n5  = tree.addNode(10);
      Node<Integer> n6  = tree.addNode(5);
      Node<Integer> n7  = tree.addNode(1);
      Node<Integer> n8  = tree.addNode(8);
      Node<Integer> n9  = tree.addNode(2);
      Node<Integer> n10 = tree.addNode(7);
      Node<Integer> n11 = tree.addNode(9);
      Node<Integer> n12 = tree.addNode(11);
      Node<Integer> n13 = tree.addNode(6);
      Node<Integer> n14 = tree.addNode(18);

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
      Node<Integer> n1  = tree.addNode(3);
      Node<Integer> n2  = tree.addNode(4);
      Node<Integer> n3  = tree.addNode(12);
      Node<Integer> n4  = tree.addNode(14);
      Node<Integer> n5  = tree.addNode(10);
      Node<Integer> n6  = tree.addNode(5);
      Node<Integer> n7  = tree.addNode(1);
      Node<Integer> n8  = tree.addNode(8);
      Node<Integer> n9  = tree.addNode(2);
      Node<Integer> n10 = tree.addNode(7);
      Node<Integer> n11 = tree.addNode(9);
      Node<Integer> n12 = tree.addNode(11);
      Node<Integer> n13 = tree.addNode(6);
      Node<Integer> n14 = tree.addNode(18);

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
      Node<Integer> n1  = tree.addNode(3);
      Node<Integer> n2  = tree.addNode(4);
      Node<Integer> n3  = tree.addNode(12);
      Node<Integer> n4  = tree.addNode(14);
      Node<Integer> n5  = tree.addNode(10);
      Node<Integer> n6  = tree.addNode(5);
      Node<Integer> n7  = tree.addNode(1);
      Node<Integer> n8  = tree.addNode(8);
      Node<Integer> n9  = tree.addNode(2);
      Node<Integer> n10 = tree.addNode(7);
      Node<Integer> n11 = tree.addNode(9);
      Node<Integer> n12 = tree.addNode(11);
      Node<Integer> n13 = tree.addNode(6);
      Node<Integer> n14 = tree.addNode(18);

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
      Node<Integer> n1  = tree.addNode(30);
      Node<Integer> n2  = tree.addNode(40);
      Node<Integer> n3  = tree.addNode(120);
      Node<Integer> n4  = tree.addNode(140);
      Node<Integer> n5  = tree.addNode(150);
      Node<Integer> n6  = tree.addNode(50);
      Node<Integer> n7  = tree.addNode(10);
      Node<Integer> n8  = tree.addNode(80);
      Node<Integer> n9  = tree.addNode(20);
      Node<Integer> n10 = tree.addNode(70);
      Node<Integer> n11 = tree.addNode(90);
      Node<Integer> n12 = tree.addNode(110);
      Node<Integer> n13 = tree.addNode(60);
      Node<Integer> n14 = tree.addNode(180);
      Node<Integer> n15 = tree.addNode(135);

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
      Node<Integer> n1  = tree.addNode(30);
      Node<Integer> n2  = tree.addNode(40);
      Node<Integer> n3  = tree.addNode(120);
      Node<Integer> n4  = tree.addNode(140);
      Node<Integer> n5  = tree.addNode(150);
      Node<Integer> n6  = tree.addNode(50);
      Node<Integer> n7  = tree.addNode(10);
      Node<Integer> n8  = tree.addNode(80);
      Node<Integer> n9  = tree.addNode(20);
      Node<Integer> n10 = tree.addNode(70);
      Node<Integer> n11 = tree.addNode(90);
      Node<Integer> n12 = tree.addNode(110);
      Node<Integer> n13 = tree.addNode(60);
      Node<Integer> n14 = tree.addNode(180);
      Node<Integer> n15 = tree.addNode(135);

      System.out.println(TestBST.toArray(tree));
      Node<Integer> root = tree.getRoot();
      System.out.println("removing node " + root + " ...");
      tree.deleteNode(root);
      System.out.println(TestBST.toArray(tree));
    }
    catch(Exception e) {
      System.out.println(e.getMessage());
    }
  }




}
