import java.util.Queue;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;

public class Money2 {
  public static void main(String[] args) {

    try {
      State s = process(4345);
      System.out.println("Answer:" + s);
    }
    catch(Exception e) {
      System.out.println("Failure!");
    }
  }

  // For every State, this computes the set of next states.
  public static Set<State> singleStep(State state) {
    int[] denominations = { 1, 2, 5, 10, 20, 50, 100, 500, 1000, 2000 };
    Set<State> nextStates = new HashSet<State>();
    for(int d : denominations) {
      nextStates.add(state.append(d));
    }
    return nextStates;
  }

  public static State process(int target) {
    Queue<State> queue = new LinkedList<State>();
    queue.add(new State());
    while(true) {
      State state = queue.remove();
      Set<State> nextStates = singleStep(state);
      for(State ns : nextStates) {
        if(ns.getValue() == target) {
          return ns;
        }
        else if(ns.getValue() < target) {
          queue.add(ns);
        }
        else {
          // don't add if val > target
        }
      }
    }
  }
}

class State {
  private List<Integer> values = new ArrayList<Integer>();

  public State() {
  }

  public State(State s) {
    for(Integer v : s.getValues()) {
      this.values.add(v);
    }
  }

  public List<Integer> getValues() {
    return this.values;
  }

  public int getValue() {
    int val = 0;
    for(Integer i : this.values) {
      val += i;
    }
    return val;
  }

  public void add(int i) {
    this.values.add(i);
  }

  // Creates a new State as this one, added with the integer d.
  public State append(int d) {
    State ns = new State(this);
    ns.add(d);
    return ns;
  }

  public String toString() {
    String s = "[";
    for(Integer v : this.values) {
      s += v + ", ";
    }

    return s + "]";
  }
}
