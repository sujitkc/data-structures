import java.util.Stack;
import java.util.EmptyStackException;

public class Paren3 {
 /*
   NOTE
   ----
   We implement the parenthetis matching algorithm using a stack.   
 */

  private static Stack<Character> stack = new Stack<Character>();

  // private static MyStack<Character> stack = new MyStack<Character>();


  public static void main(String[] args) {
    try {
      System.out.println(match("()"));
      System.out.println(match("((((((()))))))"));
      System.out.println(match("(((((()))))))"));
      System.out.println(match("(((((()))))))"));
      System.out.println(match("(((()(((()))))))"));

      System.out.println(match("{}"));
      System.out.println(match("{{{{{{{}}}}}}}"));
      System.out.println(match("{{{{{{}}}}}}}"));
      System.out.println(match("{{{{{{}}}}}}}"));
      System.out.println(match("{{{{}{{{{}}}}}}}"));

      System.out.println(match("{{({}{{{{}}}})}}"));
    }
    catch(Exception e) {
      System.out.println(e.getMessage());
    }
  }

  public static boolean match(String parens) throws Exception {
    for(char c : parens.toCharArray()) {
      if(c == '(' || c == '{') {
        stack.push(c);
      }
      else if(c == ')') {
        try {
          char t = stack.pop();
          if(t != '(') {
            return false;
          }
        }
        catch(EmptyStackException e) {
          return false;
        }
      }
      else if(c == '}') {
        try {
          char t = stack.pop();
          if(t != '{') {
            return false;
          }
        }
        catch(EmptyStackException e) {
          return false;
        }
      }
     else {
        throw new Exception("Unexpected character " + c);
      }
    }
    if(stack.isEmpty()) {
      return true;
    }
    else {
      return false;
    }
  }
}
