import java.util.Comparator;
import java.util.ArrayList;

public class Tree<T> {
  private TreeNode<T> root;
  private Comparator<T> comparator;

  public Tree(T value, Comparator<T> comparator) {
    this.root = new TreeNode<T>(value, null, null, null);
    this.comparator = comparator;
  }

  public TreeNode<T> getRoot() {
    return this.root;
  }

  public int getNumberOfNodes() {
    return this.getNumberOfNodes(root);
  }

  public TreeNode<T> find(T value) {
    return this.find(root, value);
  }

  public void deleteNode(TreeNode<T> node) throws Exception {
    int size = node.getChildren().size();
    TreeNode<T> parent = node.getParent();
    if(parent != null) {
      if(size == 0) {
        parent.getChildren().remove(node);
      }
      else if(size == 1) {
        int index = parent.getChildren().indexOf(node);
        parent.getChildren().set(index, node.getChildren().get(0));
      }
      else {
        throw new Exception("deleteNode failed : Node with more than 1 children can't be removed.");
      }
    }
    else {
      if(size == 0) {
        this.root = null;
      }
      else if(size == 1) {
        this.root = node.getChildren().get(0);
      }
      else {
        throw new Exception("deleteNode failed : Node with more than 1 children can't be removed.");
      }
    }
  }

  private int getNumberOfNodes(TreeNode<T> node) {
    int numberOfNodes = 1;
    for(TreeNode child : node.getChildren()) {
      numberOfNodes += this.getNumberOfNodes(child);
    }
    return numberOfNodes;
  }

  public TreeNode<T> find(TreeNode<T> node, T value) {
    int compare = this.comparator.compare(value, node.getValue());
    if(compare == 0)  {
      return node;
    }
    for(TreeNode child : node.getChildren()) {
      TreeNode<T> found = this.find(child, value);
      if(found != null) {
        return found;
      }
    }
    return null;
  }

  public TreeNode<T> addChild(TreeNode<T> node, T value) throws Exception {
    TreeNode<T> child = new TreeNode<T>(value, node, null, null);
    node.addChild(child);
    return child;
  }
}

class TreeNode<T> {

  private T value;
  private TreeNode<T> parent;
  private ArrayList<TreeNode<T>> children = new ArrayList<TreeNode<T>>();

  public TreeNode(T value, TreeNode<T> parent, TreeNode<T> left, TreeNode<T> right) {
    this.value = value;
    this.parent = parent;
  }

  public T getValue() {
    return this.value;
  }
 
  public TreeNode<T> getParent() {
    return this.parent;
  }

  ArrayList<TreeNode<T>> getChildren() {
    return this.children;
  }

  public void addChild(TreeNode<T> node) throws Exception {
    if(this.children.contains(node)) {
      throw new Exception("add child failed : duplicate child.");
    }

    this.children.add(node);
  }

  public String toString() {
    return this.value.toString();
  }
}
