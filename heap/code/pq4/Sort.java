import java.lang.Comparable;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class Sort {

  public static void main(String[] args) {
    t1();
    t2();
    t3();
    t4();
  }

  public static void t1() {
    List<Integer> list = new ArrayList<Integer>();
    list.add(3);
    list.add(5);
    list.add(1);
    list.add(4);
    list.add(2);

    class DefaultComparator<T extends Comparable> implements Comparator<T> {

      public int compare(T o1, T o2) {
        return o1.compareTo(o2);
      }
    }


    MyPriorityQueue<Integer> pq = new Heap<Integer>(new DefaultComparator());

    while(list.isEmpty() == false) {
      pq.add(list.remove(0));
    }

    while(pq.isEmpty() == false) {
      list.add(pq.removeMinimum());
    }
    for(Integer i : list) {
      System.out.println(i);
    }
    System.out.println("");
  }

  static class Account {
    public final int balance;
    public final int loyaltyPoints;

    public Account(int balance, int loyaltyPoints) {
      this.balance = balance;
      this.loyaltyPoints = loyaltyPoints;
    }

    public String toString() {
      return "account(" + this.balance + ", " + this.loyaltyPoints + ")";
    }
  }

  public static void t2() {
    List<Account> list = new ArrayList<Account>();
    list.add(new Account(100, 500));
    list.add(new Account(200, 400));
    list.add(new Account(300, 300));
    list.add(new Account(400, 200));
    list.add(new Account(500, 100));

   class BalanceComparator<T extends Account> implements Comparator<T> {

      public int compare(T o1, T o2) {
        Account a1 = (Account)o1;
        Account a2 = (Account)o2;
        if(a1.balance < a2.balance) {
          return -1;
        }
        else if(a1.balance > a2.balance) {
          return 1;
        }
        else {
          return 0;
        }
      }
    }

    MyPriorityQueue<Account> pq = new Heap<Account>(new BalanceComparator());

    while(list.isEmpty() == false) {
      pq.add(list.remove(0));
    }

    while(pq.isEmpty() == false) {
      list.add(pq.removeMinimum());
    }
    for(Account a : list) {
      System.out.println(a);
    }
    System.out.println("");
  }

  public static void t3() {
    List<Account> list = new ArrayList<Account>();
    list.add(new Account(100, 500));
    list.add(new Account(200, 400));
    list.add(new Account(300, 300));
    list.add(new Account(400, 200));
    list.add(new Account(500, 100));

    class LoyaltyComparator<T extends Account> implements Comparator<T> {

      public int compare(T o1, T o2) {
        Account a1 = (Account)o1;
        Account a2 = (Account)o2;
        if(a1.loyaltyPoints < a2.loyaltyPoints) {
          return -1;
        }
        else if(a1.loyaltyPoints > a2.loyaltyPoints) {
          return 1;
        }
        else {
          return 0;
        }
      }
  }


    MyPriorityQueue<Account> pq = new Heap<Account>(new LoyaltyComparator());

    while(list.isEmpty() == false) {
      pq.add(list.remove(0));
    }

    while(pq.isEmpty() == false) {
      list.add(pq.removeMinimum());
    }
    for(Account a : list) {
      System.out.println(a);
    }
    System.out.println("");
  }

  public static void t4() {
    List<Integer> list = new ArrayList<Integer>();
    list.add(3);
    list.add(5);
    list.add(1);
    list.add(4);
    list.add(2);

    class ReverseComparator<T extends Comparable> implements Comparator<T> {

      public int compare(T o1, T o2) {
        return -o1.compareTo(o2);
      }
    }

    MyPriorityQueue<Integer> pq = new Heap<Integer>(new ReverseComparator());

    while(list.isEmpty() == false) {
      pq.add(list.remove(0));
    }

    while(pq.isEmpty() == false) {
      list.add(pq.removeMinimum());
    }
    for(Integer i : list) {
      System.out.println(i);
    }
    System.out.println("");
  }
}
