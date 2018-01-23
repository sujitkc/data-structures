package binarytree;

public class Node<T> {

  protected T value;
  protected Node<T> parent;
  protected Node<T> left;
  protected Node<T> right;

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

  public void setParent(Node<T> node) {
    this.parent = node;
  }

  public void setRight(Node<T> node) {
    this.right = node;
  }

  public void setLeft(Node<T> node) {
    this.left = node;
  }
}
