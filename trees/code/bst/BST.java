import java.util.Map;
import java.util.HashMap;

public class BST<T extends Comparable> {
  private BSTNode<T> root;
  public MyTree(BSTNode<T> root) {
    this.root = root;
  }

  public BSTNode<T> getRoot() {
    return this.root;
  }

  public int getNumberOfNodes() {
    return this.root.getNumberOfNodes();
  }

  public void addNode(BSTNode<T> node) {
    this.root.addNode(node);
  }

  public BSTNode<T> find(T value) {
    return this.root.find(value);
  }

  public BSTNode<T> deleteNode(T value) {
    BSTNode<T> node = this.find(value);
    if(node == null) {
      return null;
    }
    
  }
}

class BSTNode<T extends Comparable> {

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

  public BSTNode<T> setRight(BSTNode<T> node) {
    if(node.value(compareTo(this.value) < 0) {
      throw new Exception("Can't set a lower valued node as a right child. Node: " + this + " child: " + node);
    }
    return super.setRight(node);
    
  }

  public BSTNode<T> setLeft(BSTNode<T> node) {
    if(node.value(compareTo(this.value) > 0) {
      throw new Exception("Can't set a higher valued node as a left child. Node: " + this + " child: " + node);
    }
    return super.setLeft(node);

  }

  public String toString() {
    return this.value.toString();
  }
}
