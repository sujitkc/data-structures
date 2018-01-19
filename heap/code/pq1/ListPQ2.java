import java.util.List;

public class ListPQ2 extends ListPQ {
  public void add(Integer element) {
    if(!this.isEmpty()) {
      for(int i = 0; i < this.list.size(); i++) {
        Integer e = this.list.get(i);
        if(e.compareTo(element) >= 0) {
          this.list.add(i, element);
          return;
        }
      }
    }
    this.list.add(element);
  }

  public Integer removeMinimum() {
    return this.list.remove(0);
  }

  public Integer minimum() {
    return this.list.get(0);
  }
}
