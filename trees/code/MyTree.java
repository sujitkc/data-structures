import java.util.Map;
import java.util.HashMap;

public class MyTree<T extends Comparable> {
  private Node<T> root;
  public MyTree(Node<T> root) {
    this.root = root;
  }

  public Node<T> getRoot() {
    return this.root;
  }

  public int getNumberOfNodes() {
    return this.root.getNumberOfNodes();
  }

  public void addNode(Node<T> node) {
    this.root.addNode(node);
  }

  public Node find(T value) {
    return this.root.find(value);
  }
}

class Node<T extends Comparable> {

  private T value;
  private Node<T> left;
  private Node<T> right;

  public Node(T value, Node<T> left, Node<T> right) {
    this.value = value;
    this.left  = left;
    this.right = right;
  }

  public Node(T value) {
    this.value = value;
    this.left  = null;
    this.right = null;
  }

  public T getValue() {
    return this.value;
  }

  public Node<T> getLeft() {
    return this.left;
  }

  public Node<T> getRight() {
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

  public void addNode(Node<T> node) {
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

  public Node<T> find(T value) {
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

  public String toString() {
    return this.value.toString();
  }
}
