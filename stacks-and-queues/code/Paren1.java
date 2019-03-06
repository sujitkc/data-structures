public class Paren1 {
 /*
   NOTE
   ----
 */

  public static void main(String[] args) {
    try {
      System.out.println(match("()"));
      System.out.println(match("((((((()))))))"));
      System.out.println(match("(((((()))))))"));
      System.out.println(match("(((((()))))))"));
      System.out.println(match("(((()(((()))))))"));
    }
    catch(Exception e) {
      System.out.println(e.getMessage());
    }
  }

  public static boolean match(String parens) throws Exception {
    int count = 0;
    for(char c : parens.toCharArray()) {
      if(c == '(') {
        count++;
      }
      else if(c == ')') {
        if(count > 0) {
          count--;
        }
        else {
          return false;
        }
      }
      else {
        throw new Exception("Unexpected character " + c);
      }
    }
    if(count == 0) {
      return true;
    }
    else {
      return false;
    }
  } 
}
