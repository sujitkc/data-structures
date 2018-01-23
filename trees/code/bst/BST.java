package bst;

import binarytree.BinaryTree;
import binarytree.Node;

import java.util.Map;
import java.util.HashMap;
import java.util.Comparator;

public class BST<T extends Comparable> extends BinaryTree<T> {
//  private Node<T> root;
  private Comparator comparator;

  public BST(T value, Comparator comparator) {
    super(value, comparator);
  }
/*
  public Node<T> getRoot() {
    return this.root;
  }

  public int getNumberOfNodes() {
    return this.getNumberOfNodes(this.root);
  }
*/

  public Node<T> addNode(T value) {
    Node<T> node = new Node<T>(value, null, null, null);
    this.addNode(root, node);
    return node;
  }

/*
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
*/

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

/*
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
*/

  public void deleteNode(Node<T> node) throws Exception {
    Node<T> right = node.getRight();
    Node<T> left = node.getLeft();

    if(this.root != node) {
      Node<T> parent = node.getParent();
      Node<T> l = parent.getLeft();
      Node<T> r = parent.getRight();
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
        Node<T> minmax = this.largest(left);
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
        Node<T> minmax = this.largest(left);
        node.setValue(minmax.getValue());
        this.deleteNode(minmax);
      }
    }
  }

  private Node<T> smallest(Node<T> node) {
    if(node.getLeft() == null) {
      return node;
    }
    return this.smallest(node.getLeft());
  }

  private Node<T> largest(Node<T> node) {
    if(node.getRight() == null) {
      return node;
    }
    return this.largest(node.getRight());
  }

  public void addNode(Node<T> parent, Node<T> node) {
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

