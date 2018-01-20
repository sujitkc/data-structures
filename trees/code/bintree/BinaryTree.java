import java.util.Comparator;

public class BinaryTree<T> {
  private Node<T> root;
  private Comparator<T> comparator;

  public BinaryTree(T value, Comparator<T> comparator) {
    this.root = new Node<T>(value, null, null, null);
    this.comparator = comparator;
  }

  public Node<T> getRoot() {
    return this.root;
  }

  public int getNumberOfNodes() {
    return this.getNumberOfNodes(root);
  }

  public Node<T> find(T value) {
    return this.find(root, value);
  }

  public void deleteNode(Node<T> node) throws Exception {
    Node<T> left = node.getRight();
    Node<T> right = node.getLeft();

    if(left != null && right != null) {
      throw new Exception("Can't delete node " + node + " as it has both children.");
    }
    if(this.root != node) {
      if(left == null && right == null) {
        Node<T> parent = node.getParent();
        Node<T> l = parent.getLeft();
        Node<T> r = parent.getRight();
  
        if(node == l) {
          parent.setLeft(null);
        }
        else {
          parent.setRight(null);
        }
      }
      else if(left != null) {
        Node<T> parent = node.getParent();
        Node<T> l = parent.getLeft();
        Node<T> r = parent.getRight();

        if(node == l) {
          parent.setLeft(left);
        }
        else {
          parent.setRight(left);
        }   
      }
      else { // right != null
        Node<T> parent = node.getParent();
        Node<T> l = parent.getLeft();
        Node<T> r = parent.getRight();
  
        if(node == l) {
          parent.setLeft(right);
        }
        else {
          parent.setRight(right);
        }   
      }
    }
    else {// if(this.root == node)
      if(left == null && right == null) {
        this.root = null;
      }
      else if(left != null) {
        this.root = left;   
      }
      else { // right != null
        this.root = right;   
      }
    }
  }

  private int getNumberOfNodes(Node<T> node) {
    int numberOfNodes = 1;

    if(node.getLeft() != null) {
      numberOfNodes += this.getNumberOfNodes(node.getLeft());
    }
    if(node.getRight() != null) {
      numberOfNodes += this.getNumberOfNodes(node.getRight());
    }
    return numberOfNodes;
  }

  public Node<T> find(Node<T> node, T value) {
    int compare = this.comparator.compare(value, node.getValue());
    if(compare == 0)  {
      return node;
    }
    if(node.getLeft() != null) {
      Node<T> found = this.find(node.getLeft(), value);
      if(found != null) {
        return found;
      }
    }
    if(node.getRight() != null) {
      Node<T> found = this.find(node.getRight(), value);
      if(found != null) {
        return found;
      }
    }
    return null;
  }

  public Node<T> setRight(Node<T> node, T value) throws Exception {
    if(node.getRight() != null) {
      throw new Exception("setRight failed because node " + node + " already has a right child.");
    }
    Node<T> child = new Node<T>(value, node, null, null);
    node.setRight(child);
    return child;
  }

  public Node<T> setLeft(Node<T> node, T value) throws Exception {
     if(node.getLeft() != null) {
      throw new Exception("setLeft failed because node " + node + " already has a Left child.");
    }
    Node<T> child = new Node<T>(value, node, null, null);
    node.setLeft(child);
    return child;
  }
}

class Node<T> {

  private T value;
  private Node<T> parent;
  private Node<T> left;
  private Node<T> right;

  public Node(T value, Node<T> parent, Node<T> left, Node<T> right) {
    this.value = value;
    this.parent = parent;
    this.left  = left;
    this.right = right;
  }

  public T getValue() {
    return this.value;
  }
 
  public Node<T> getParent() {
    return this.parent;
  }
 
  public Node<T> getLeft() {
    return this.left;
  }

  public Node<T> getRight() {
    return this.right;
  }

  public String toString() {
    return this.value.toString();
  }

  public void setRight(Node<T> node) {
    this.right = node;
  }

  public void setLeft(Node<T> node) {
    this.left = node;
  }
}
