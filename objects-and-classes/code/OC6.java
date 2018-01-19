/*
  OBJECTIVE
  ---------
  - multiple methods
  - multiple attributes
*/
public class OC6 {

  public static void main(String[] a) {
    Circle c1 = new Circle(10f);
    System.out.println(c1.area());
    Circle c2 = new Circle(20f);
    System.out.println(c2.area());
    System.out.println(c2.circumference());
  }
}

class Circle {
  public float radius;
  public float PI = 3.141f;

  public Circle(float r) {
    radius = r;
  }

  public float area() {
    return PI * radius * radius;
  }

  public float circumference() {
    return 2f * PI * radius;
  }
}

/*
  ISSUES
  ------
  - PI can be changed accidentally. It really is meant to be a constant.
  - PI is same for all instances of Circle.

  SOLUTION
  --------
  - See OC7.java
*/
