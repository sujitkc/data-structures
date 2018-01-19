/*
  OBJECTIVE
  ---------
  - To learn constructors
*/
public class OC5 {

  public static void main(String[] a) {
    Circle c1 = new Circle(10f);
    System.out.println(c1.area());
    Circle c2 = new Circle(20f);
    System.out.println(c2.area());
  }
}

class Circle {
  public float radius;

  public Circle(float r) {
    radius = r;
  }

  public float area() {
    return 3.141f * radius * radius;
  }
}

/* 
  WHAT NEW DID WE LEARN?
  ----------------------
  - How to create a constructor
  - Instantiation of a class with a constructor.

  EXERCISE
  --------
  - Modify the square class to have a constructor of its own.
*/
