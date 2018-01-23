import java.util.Map;
import java.util.HashMap;

class Array {
  private Character[][] array;
  private final String title;
  public final int numberOfColumns;
  public final int numberOfRows;

  public Array() {
    this.numberOfRows = 1;
    this.numberOfColumns = 3;
    this.array = new Character[this.numberOfRows][this.numberOfColumns];
    this.array[0][0] = ' ';
    this.array[0][1] = ' ';
    this.array[0][2] = ' ';
    this.title = "";
  }

  public Array(BSTNode node) {
    Array left = new Array();
    Array right = new Array();

    if(node.getLeft() != null) {
      left = new Array(node.getLeft());
    }
    if(node.getRight() != null) {
      right = new Array(node.getRight());
    }
    this.title = node.getValue().toString();

    this.numberOfColumns = Array.max(title.length(), left.numberOfColumns + right.numberOfColumns + 1);
    this.numberOfRows = Array.max(left.numberOfRows, right.numberOfRows) + 4;

    this.array = new Character[this.numberOfRows][this.numberOfColumns];

    for(int row = 0; row < this.numberOfRows; row++) {
      for(int col = 0; col < this.numberOfColumns; col++) {
        this.array[row][col] = ' ';
      }
    }

    // place hangers
    this.array[1][this.numberOfColumns / 2] = '|';

    int startBars;
    int numberOfBars;

    startBars = left.numberOfColumns / 2;
    numberOfBars = (left.numberOfColumns / 2) + 3 + (right.numberOfColumns / 2);
    for(int i = 0; i < numberOfBars; i++) {
      this.array[2][startBars + i] = '-';
    }
    this.array[3][startBars] = '|';
    this.array[3][startBars + numberOfBars - 1] = '|';
    for(int row = 0; row < left.numberOfRows; row++) {
      for(int col = 0; col < left.numberOfColumns; col++) {
        this.array[row + 4][col] = left.get(row, col);
      }
    }
    // transfer right
    int xshift = 1;
    xshift += left.numberOfColumns;
    for(int row = 0; row < right.numberOfRows; row++) {
      for(int col = 0; col < right.numberOfColumns; col++) {
        this.array[row + 4][col + xshift] = right.get(row, col);
      }
    }
    
    // place title
    int startTitle = (this.numberOfColumns - title.length()) / 2;
    for(int i = 0; i < title.length(); i++) {
      this.array[0][startTitle + i] = title.charAt(i);
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
