package binarytree;

import java.util.Comparator;

public class BinaryTree<T> {
  protected Node<T> root;
  protected Comparator<T> comparator;

  public BinaryTree(T value, Comparator<T> comparator) {
    this.root = new Node<T>(value, null, null, null);
    this.comparator = comparator;
  }

  public Node<T> getRoot() {
    return this.root;
  }

  public int getNumberOfNodes() {
    return this.getNumberOfNodes(this.root);
  }

  public Node<T> find(T value) {
    return this.find(root, value);
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

  private Node<T> find(Node<T> node, T value) {
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
        left.setParent(parent);   
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
        right.setParent(parent);
      }
    }
    else {// if(this.root == node)
      if(left == null && right == null) {
        this.root = null;
      }
      else if(left != null) {
        this.root = left;
        left.setParent(null);
      }
      else { // right != null
        this.root = right;
        right.setParent(null);
      }
    }
  }
}

