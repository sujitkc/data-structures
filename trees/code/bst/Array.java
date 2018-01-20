import java.util.Map;
import java.util.HashMap;

class Array {
  private Character[][] array;
  private final String title;
  public final int numberOfColumns;
  public final int numberOfRows;

  public Array(BSTNode node) {
    Array left = null;
    Array right = null;
    if(node.getLeft() != null) {
      left = new Array(node.getLeft());
    }
    if(node.getRight() != null) {
      right = new Array(node.getRight());
    }
    this.title = node.getValue().toString();
    if(left == null && right == null) {
      this.numberOfColumns = title.length();
      this.numberOfRows = 1;
    }
    else if (left == null) {
      this.numberOfColumns = Array.max(title.length(), right.numberOfColumns + 2);
      this.numberOfRows = right.numberOfRows + 4;
    }
    else if (right == null) {
      this.numberOfColumns = Array.max(title.length(), left.numberOfColumns + 2);
      this.numberOfRows = left.numberOfRows + 4;
    }
    else {
      this.numberOfColumns = Array.max(title.length(), left.numberOfColumns + right.numberOfColumns + 1);
      this.numberOfRows = Array.max(left.numberOfRows, right.numberOfRows) + 4;
    }
    this.array = new Character[this.numberOfRows][this.numberOfColumns];

    for(int row = 0; row < this.numberOfRows; row++) {
      for(int col = 0; col < this.numberOfColumns; col++) {
        this.array[row][col] = ' ';
      }
    }
    // place title
    int startTitle = (this.numberOfColumns - title.length()) / 2;
    for(int i = 0; i < title.length(); i++) {
      this.array[0][startTitle + i] = title.charAt(i);
    }
    // place hangers
    if(left != null || right != null) {
      this.array[1][this.numberOfColumns / 2] = '|';

      int startBars;
      int numberOfBars;
      if(left == null && right != null) {
        startBars = (this.numberOfColumns / 2) - 1;
        numberOfBars = 2 + (right.numberOfColumns / 2);
      }
      else if(left != null && right == null) {
        startBars = left.numberOfColumns / 2;
        numberOfBars = 2 + (left.numberOfColumns / 2);
      }
      else {
        startBars = left.numberOfColumns / 2;
        numberOfBars = (left.numberOfColumns / 2) + 2 + (right.numberOfColumns / 2);
      }
      for(int i = 0; i < numberOfBars; i++) {
        this.array[2][startBars + i] = '-';
      }
      this.array[3][startBars] = '|';
      this.array[3][startBars + numberOfBars - 1] = '|';
    }
    // transfer left
    if(left != null) {
      for(int row = 0; row < left.numberOfRows; row++) {
        for(int col = 0; col < left.numberOfColumns; col++) {
          this.array[row + 4][col] = left.get(row, col);
        }
      }
    }
    // transfer right
     if(right != null) {
      int xshift = 1;
      if(left != null) {
        xshift += left.numberOfColumns;
      }
      else {
        xshift += 1;
      }
      for(int row = 0; row < right.numberOfRows; row++) {
        for(int col = 0; col < right.numberOfColumns; col++) {
          this.array[row + 4][col + xshift] = right.get(row, col);
        }
      }
    }
  }

  public Character get(int row, int col) {
    return this.array[row][col];
  }

  private static int max(int a, int b) {
    if(a >= b) {
      return a;
    }
    return b;
  }

  public String toString() {
    String s = "";
    for(int row = 0; row < this.numberOfRows; row++) {
      for(int col = 0; col < this.numberOfColumns; col++) {
        s += this.array[row][col];
      }
      s += '\n';
    }
    return s;
  }
}
