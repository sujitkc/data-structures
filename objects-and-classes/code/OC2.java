/*
  OBJECTIVES
  ----------
  - To demonstrate that a program can have more than one class.
  - To teach how one class can invoke/call a method of another class.
*/

public class OC2 {

  public static void main(String[] a) {
    System.out.println(Circle.area(10));
  }
}

class Circle {
  public static float area(float radius) {
    return 3.141f * radius * radius;
  }
}

/*
  Q. What's the benefit of having more than one classes?
  A. Classes can be used as modules. See OC3.java.
