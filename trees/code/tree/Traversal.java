import java.util.ArrayList;

public class Traversal<T> {

  private Tree<T> tree;
  public Traversal(Tree<T> tree) {
    this.tree = tree;
  }

  public void postorder() {
    postorder(this.tree.getRoot());
  }

  public void postorder(TreeNode<T> node) {
    for(TreeNode<T> child : node.getChildren()) {
      this.postorder(child);
    }
    System.out.println(node);
  }

  public void preorder() {
    preorder(this.tree.getRoot());
  }

  public void preorder(TreeNode<T> node) {
    System.out.println(node);
    for(TreeNode<T> child : node.getChildren()) {
      this.preorder(child);
    }
  }

  public void inorder() {
    inorder(this.tree.getRoot());
  }

  public void inorder(TreeNode<T> node) {
    ArrayList<TreeNode<T>> children = node.getChildren();
    if(!children.isEmpty()) {
      this.inorder(children.get(0));
    }
    System.out.println(node);
    for(int i = 1; i < children.size(); i++) {
      this.inorder(children.get(i));
    }
  }
}
