public class IandP8a {
  public static void main(String[] args) {
    int[] a = { 1, 2, 3};
    printArray(doubleArray(a));
    System.out.println("");
    printArray(squareArray(a));
    System.out.println("");
  }

  private static int dbl(int n) {
    return n * 2;
  }

  private static int square(int n) {
    return n * n;
  }

  private static int[] doubleArray(int[] array) {
    int[] ans = new int[array.length];
    for(int i = 0; i < array.length; i++) {
      ans[i] = dbl(array[i]);
    }
    return ans;
  }

  private static int[] squareArray(int[] array) {
    int[] ans = new int[array.length];
    for(int i = 0; i < array.length; i++) {
      ans[i] = square(array[i]);
    }
    return ans;
  }

  private static void printArray(int[] array)  {
    int[] ans = new int[array.length];
    for(int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
  }
}
