import java.util.Deque;
import java.util.LinkedList;

public class Palindrome {

  public static void main(String[] args) {
    System.out.println(isPalindrome("abcba"));
    System.out.println(isPalindrome("abc"));
  }

  public static boolean isPalindrome(String word) {
    Deque<Character> deque = new LinkedList<Character>();
    char[] charArray = word.toCharArray();
    for(char c : charArray) {
      deque.addLast(c);
    }
    while(deque.size() > 1) {
      Character first = deque.removeFirst();
      Character last = deque.removeLast();
      if(!first.equals(last)) {
        return false;
      }
    }
    return true;
  }
}
