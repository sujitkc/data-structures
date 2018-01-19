import java.util.List;

public class ListPQ1 {
  public void add(Integer element) {
    this.list.add(element);
  }

  public Integer removeMinimum() {
    return this.list.remove(minIndex());
  }

  public Integer minimum() {
    return this.list.get(0);
  }

  private int minIndex() {
    int minIndex = 0;
    T min = this.list.get(0);
    for(int i = 0; i < this.list.size(); i++) {
      T e = this.list.get(i);
      if(e < min) {
        min = e;
        minIndex = i;
      }
    }
    return minIndex;
  }
}
