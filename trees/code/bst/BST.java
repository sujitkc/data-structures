import java.util.Map;
import java.util.HashMap;
import java.util.Comparator;

public class BST<T extends Comparable> {
  private BSTNode<T> root;
  private Comparator comparator;

  public BST(T value, Comparator comparator) {
    this.root = new BSTNode<T>(value, null, null, null);
    this.comparator = comparator;
  }

  public BSTNode<T> getRoot() {
    return this.root;
  }

  public int getNumberOfNodes() {
    return this.getNumberOfNodes(this.root);
  }

  public BSTNode<T> addNode(T value) {
    BSTNode<T> node = new BSTNode<T>(value, null, null, null);
    this.addNode(root, node);
    return node;
  }

  public BSTNode<T> find(T value) {
    return this.find(root, value);
  }

  private int getNumberOfNodes(BSTNode<T> node) {
    int numberOfNodes = 1;

    if(node.getLeft() != null) {
      numberOfNodes += this.getNumberOfNodes(node.getLeft());
    }
    if(node.getRight() != null) {
      numberOfNodes += this.getNumberOfNodes(node.getRight());
    }
    return numberOfNodes;
  }

  private BSTNode<T> find(BSTNode<T> node, T value) {
    int compare = this.comparator.compare(value, node.getValue());
    if(compare == 0)  {
      return node;
    }
    if(node.getLeft() != null) {
      BSTNode<T> found = this.find(node.getLeft(), value);
      if(found != null) {
        return found;
      }
    }
    if(node.getRight() != null) {
      BSTNode<T> found = this.find(node.getRight(), value);
      if(found != null) {
        return found;
      }
    }
    return null;
  }

  public BSTNode<T> setRight(BSTNode<T> node, T value) throws Exception {
    if(node.getRight() != null) {
      throw new Exception("setRight failed because node " + node + " already has a right child.");
    }
    BSTNode<T> child = new BSTNode<T>(value, node, null, null);
    node.setRight(child);
    return child;
  }

  public BSTNode<T> setLeft(BSTNode<T> node, T value) throws Exception {
     if(node.getLeft() != null) {
      throw new Exception("setLeft failed because node " + node + " already has a Left child.");
    }
    BSTNode<T> child = new BSTNode<T>(value, node, null, null);
    node.setLeft(child);
    return child;
  }

  public void deleteNode(BSTNode<T> node) throws Exception {
    BSTNode<T> right = node.getRight();
    BSTNode<T> left = node.getLeft();

    if(this.root != node) {
      BSTNode<T> parent = node.getParent();
      BSTNode<T> l = parent.getLeft();
      BSTNode<T> r = parent.getRight();
      if(left == null && right == null) {
        if(node == l) {
          parent.setLeft(null);
        }
        else {
          parent.setRight(null);
        }
      }
      else if(left != null && right == null) {
        if(node == l) {
          parent.setLeft(left);
          left.setParent(parent);
        }
        else {
          parent.setRight(left);
          left.setParent(parent);
        }   
      }
      else if(left == null && right != null) {
        if(node == l) {
          parent.setLeft(right);
          right.setParent(parent);
        }
        else {
          parent.setRight(right);
          right.setParent(parent);
        }   
      }
      else { // both left and right child exist.
        BSTNode<T> minmax = this.largest(left);
        node.setValue(minmax.getValue());
        this.deleteNode(minmax);
      }
    }
    else {// if(this.root == node)
      if(left == null && right == null) {
        this.root = null;
      }
      else if(left != null && right == null) {
        this.root = left;
        left.setParent(null);
      }
      else if(left == null && right != null) {
        this.root = right;
        right.setParent(null);
      }
      else { // (both left and right child exist.
        BSTNode<T> minmax = this.largest(left);
        node.setValue(minmax.getValue());
        this.deleteNode(minmax);
      }
    }
  }

  public BSTNode<T> smallest(BSTNode<T> node) {
    if(node.getLeft() == null) {
      return node;
    }
    return this.smallest(node.getLeft());
  }

  public BSTNode<T> largest(BSTNode<T> node) {
    if(node.getRight() == null) {
      return node;
    }
    return this.largest(node.getRight());
  }

  public void addNode(BSTNode<T> parent, BSTNode<T> node) {
    int compare = node.getValue().compareTo(parent.getValue());
    if(compare == 0)  {
      return;
    }
    else if(compare < 0) {
      if(parent.getLeft() != null) {
        this.addNode(parent.getLeft(), node);
      }
      else {
        parent.setLeft(node);
        node.setParent(parent);
      }
    }
    else if(compare > 0) {
      if(parent.getRight() != null) {
        this.addNode(parent.getRight(), node);
      }
      else {
        parent.setRight(node);
        node.setParent(parent);
      }
    }
  }
}

class BSTNode<T extends Comparable> {

  private T value;
  private BSTNode<T> parent;
  private BSTNode<T> left;
  private BSTNode<T> right;

  public BSTNode(T value, BSTNode<T> parent, BSTNode<T> left, BSTNode<T> right) {
    this.value = value;
    this.parent = parent;
    this.left  = left;
    this.right = right;
  }

  public T getValue() {
    return this.value;
  }
 
  public BSTNode<T> getParent() {
    return this.parent;
  }
 
  public BSTNode<T> getLeft() {
    return this.left;
  }

  public BSTNode<T> getRight() {
    return this.right;
  }

  public String toString() {
    return this.value.toString();
  }

  public void setValue(T value) {
    this.value = value;
  }

  public void setParent(BSTNode<T> node) {
    this.parent = node;
  }

  public void setRight(BSTNode<T> node) {
    this.right = node;
  }

  public void setLeft(BSTNode<T> node) {
    this.left = node;
  }
}
