public class Hof {
  public static void main(String[] a) {

//    Function f = new Dbl();
    int[] ar = {1, 2, 3};
    Function f = new Function() {
      public int execute(int n) {
        return 3 * n;
      }
    };

    int[] newarray = MyMap.map(f, ar);

    for(int n : newarray) {
      System.out.println(n);
    }
  }
}

interface Function {
  int execute(int n);
}

class Dbl implements Function {
  public int execute(int n) {
    return 2 * n;
  }
}

class Sqr implements Function {
  public int execute(int n) {
    return n * n;
  }
}

class MyMap {
  public static int [] map(Function f, int [] a) {

    int[] newarray = new int[a.length];
    for(int i = 0; i < a.length; i++) {
      newarray[i] = f.execute(a[i]);
    }
    return newarray;
  }
}
