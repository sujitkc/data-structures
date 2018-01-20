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

  public BSTNode<T> find(BSTNode<T> node, T value) {
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
    BSTNode<T> left = node.getRight();
    BSTNode<T> right = node.getLeft();

    if(left != null && right != null) {
      throw new Exception("Can't delete node " + node + " as it has both children.");
    }
    if(this.root != node) {
      if(left == null && right == null) {
        BSTNode<T> parent = node.getParent();
        BSTNode<T> l = parent.getLeft();
        BSTNode<T> r = parent.getRight();
  
        if(node == l) {
          parent.setLeft(null);
        }
        else {
          parent.setRight(null);
        }
      }
      else if(left != null) {
        BSTNode<T> parent = node.getParent();
        BSTNode<T> l = parent.getLeft();
        BSTNode<T> r = parent.getRight();

        if(node == l) {
          parent.setLeft(left);
        }
        else {
          parent.setRight(left);
        }   
      }
      else { // right != null
        BSTNode<T> parent = node.getParent();
        BSTNode<T> l = parent.getLeft();
        BSTNode<T> r = parent.getRight();
  
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
/*
  public BSTNode<T> find(BSTNode<T> node, T value) {
    int compare = value.compareTo(node.getValue());
    if(compare == 0)  {
      return this;
    }
    else if(compare < 0) {
      if(node.getLeft() != null) {
        return this.find(node.getLeft(), value);
      }
      else {
        return null;
      }
    }
    else if(compare > 0) {
      if(node.getRight() != null) {
        return this.find(node.getRight(), value);
      }
      else {
        return null;
      }
    }
    return null;
  }
*/

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
      }
    }
    else if(compare > 0) {
      if(parent.getRight() != null) {
        this.addNode(parent.getRight(), node);
      }
      else {
        parent.setRight(node);
      }
    }
  }
}

class BSTNode<T extends Comparable> {
/*
  private T value;
  private BSTNode<T> left;
  private BSTNode<T> right;

  public BSTNode(T value, BSTNode<T> left, BSTNode<T> right) {
    this.value = value;
    this.left  = left;
    this.right = right;
  }

  public BSTNode(T value) {
    this.value = value;
    this.left  = null;
    this.right = null;
  }

  public T getValue() {
    return this.value;
  }

  public BSTNode<T> getLeft() {
    return this.left;
  }

  public BSTNode<T> getRight() {
    return this.right;
  }

  public int getNumberOfNodes() {
    int numberOfNodes = 1;

    if(this.left != null) {
      numberOfNodes += this.left.getNumberOfNodes();
    }
    if(this.right != null) {
      numberOfNodes += this.right.getNumberOfNodes();
    }
    return numberOfNodes;
  }

  public void addNode(BSTNode<T> node) {
    int compare = node.getValue().compareTo(this.value);
    if(compare == 0)  {
      return;
    }
    else if(compare < 0) {
      if(this.left != null) {
        this.left.addNode(node);
      }
      else {
        this.left = node;
      }
    }
    else if(compare > 0) {
      if(this.right != null) {
        this.right.addNode(node);
      }
      else {
        this.right = node;
      }
    }
  }

  public BSTNode<T> find(T value) {
    int compare = value.compareTo(this.value);
    if(compare == 0)  {
      return this;
    }
    else if(compare < 0) {
      if(this.left != null) {
        return this.left.find(value);
      }
      else {
        return null;
      }
    }
    else if(compare > 0) {
      if(this.right != null) {
        return this.right.find(value);
      }
      else {
        return null;
      }
    }
    return null;
  }
*/


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

  public void setRight(BSTNode<T> node) {
    this.right = node;
  }

  public void setLeft(BSTNode<T> node) {
    this.left = node;
  }
}
