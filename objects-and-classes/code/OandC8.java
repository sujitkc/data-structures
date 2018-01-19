/*
  OBJECTIVE
  ---------
  - non-final static attributes
*/
public class OandC8 {

  public static void main(String[] a) {
    Circle c1 = new Circle(10f);
    System.out.println(c1.area());
    System.out.println(Circle.numberOfCircles + " circles created so far.");
    Circle c2 = new Circle(20f);
    System.out.println(c2.area());
    System.out.println(c2.circumference());
    System.out.println(Circle.numberOfCircles + " circles created so far.");
  }
}

class Circle {
  public float radius;
  public final static float PI = 3.141f;

  public static int numberOfCircles = 0;

  public Circle(float r) {
    radius = r;
    numberOfCircles++;
  }

  public float area() {
    return PI * radius * radius;
  }

  public float circumference() {
    return 2f * PI * radius;
  }
}

/*
  WHAT DID WE LEARN?
  ------------------
  - accessing static members from outside
*/
