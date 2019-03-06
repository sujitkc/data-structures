public class IandP8 {
  public static void main(String[] a) {
    int[] ar = {1, 2, 3};

    int[] newarray = map(new Dbl(), ar);
    for(int n : newarray) {
      System.out.println(n);
    }
    newarray = map(new Sqr(), ar);
    for(int n : newarray) {
      System.out.println(n);
    }

    Function triple = new Function() {
        public int execute(int n) {
          return 3 * n;
        }
      };
    newarray = map(triple, ar);
    for(int n : newarray) {
      System.out.println(n);
    }
  }

  public static int [] map(Function f, int [] a) {

    int[] newarray = new int[a.length];
    for(int i = 0; i < a.length; i++) {
      newarray[i] = f.execute(a[i]);
    }
    return newarray;
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
