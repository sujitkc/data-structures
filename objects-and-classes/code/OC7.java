/*
  OBJECTIVE
  ---------
  - final attribute
  - static attributes
*/
public class OC7 {

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
  public final static float PI = 3.141f;

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
