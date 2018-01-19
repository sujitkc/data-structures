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
}
