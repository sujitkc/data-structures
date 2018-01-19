public class Institute {
  public static void main(String[] a) {

    ProfessorWarden pw = new ProfessorWarden("SKC");

    IProfessor p = pw;
    IWarden    w = pw;

    p.teach("OOP", "Upgrad");
    w.approve("Festival request");

    pw.teach("OOP", "Upgrad");
    pw.approve("Party request");
    pw.doWork();
  }
}

interface IProfessor {
  void teach(String course, String cl);
}

interface IWarden {
  void approve(String request);
}

class Person {
  protected String name;

  public Person(String n) {
    this.name = n;
  }
}

class Professor extends Person implements IProfessor {
  public Professor(String n) {
    super(n);
  }

  public void teach(String course, String cl) {
    System.out.println("Prof. " + this.name + " teaches " + course + " to " + cl + ".");
  }
}

class Warden extends Person implements IWarden {
  public Warden(String n) {
    super(n);
  }

  public void approve(String request) {
    System.out.println("Warden " + this.name + " approves request " + request + ".");
  }
}

class ProfessorWarden extends Person implements IProfessor, IWarden {
   public ProfessorWarden(String n) {
    super(n);
  }

  public void teach(String cl, String s) {
    System.out.println("Prof. " + this.name + " teaches " + s + " to " + cl + ".");
  }

  public void approve(String request) {
    System.out.println(this.name + "  " + request + ".");
  }

  public void doWork() {
    System.out.println("Prof. " + this.name + " teaches and approves requests.");
  }
}
