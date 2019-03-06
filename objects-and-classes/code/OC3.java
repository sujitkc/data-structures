/*
  OBJECTIVE
  ---------
  - To demonstrate the use of classes as module.
*/
public class OC3 {

  public static void main(String[] a) {
    System.out.println(Circle.area(10));
    System.out.println(Square.area(10));
  }
}

class Circle {
  public static float area(float radius) {
    return 3.141f * radius * radius;
  }
}

class Square {
  public static float area(float length) {
    return length * length;
  }
}

/* 
  ACHIEVEMENT
  -----------
    Here, both Square and Circle have a method
    named area which identical signature. If placed in the same class, this would have led 
    to name clash. By encapsulating each method in its appropriate class, we avoid name 
    clashes while possibly letting methods having identical names, as long as they are 
    distinguished by the class they belong to.

  ISSUE
  -----
    The code here is still fundamentally traditional. In fact, the way we are using classes
    in this case -- which is as modules -- is not even the typical application of classes.
    Example 1. fees paid by a student as a function of his year.
    Example 2. area of a circle as a function of its own radius.
*/
