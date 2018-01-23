import binarytree.BinaryTree;
import binarytree.Node;
import java.util.Queue;
import java.util.LinkedList;

public class Traversal<T> {

  private BinaryTree<T> tree;
  public Traversal(BinaryTree<T> tree) {
    this.tree = tree;
  }

  public void postorder() {
    postorder(this.tree.getRoot());
  }

  public void postorder(Node<T> node) {
    Node<T> left = node.getLeft();
    Node<T> right = node.getRight();

    if(left != null) {
      this.postorder(left);
    }
    if(right != null) {
      this.postorder(right);
    }
    System.out.println(node);
  }

  public void preorder() {
    preorder(this.tree.getRoot());
  }

  public void preorder(Node<T> node) {
    System.out.println(node);
    Node<T> left = node.getLeft();
    Node<T> right = node.getRight();

    if(left != null) {
      this.preorder(left);
    }
    if(right != null) {
      this.preorder(right);
    }
  }

  public void inorder() {
    inorder(this.tree.getRoot());
  }

  public void inorder(Node<T> node) {
    Node<T> left = node.getLeft();
    Node<T> right = node.getRight();

    if(left != null) {
      this.inorder(left);
    }
    System.out.println(node);
    if(right != null) {
      this.inorder(right);
    }
  }

  public void bfs() {
    Queue<Node<T>> queue = new LinkedList<Node<T>>();
    queue.add(this.tree.getRoot());
    while(queue.isEmpty() == false) {
      Node<T> nextNode = queue.remove();
      System.out.println(nextNode);
      Node<T> left = nextNode.getLeft();
      Node<T> right = nextNode.getRight();
      if(left != null) {
        queue.add(left);
      }
      if(right != null) {
        queue.add(right);
      }
    }
  }
}
