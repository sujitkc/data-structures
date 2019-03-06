/*
  OBJECTIVE
  ---------
  - To demonstrate the use of classes as containers of data
  - To demonstrate methods as computations specific to an object.
*/
public class OC4 {

  public static void main(String[] a) {
    Circle c1 = new Circle();
    c1.radius = 10f;
    System.out.println(c1.area());
    Circle c2 = new Circle();
    c2.radius = 20f;
    System.out.println(c2.area());
  }
}

class Circle {
  public float radius;
  public float area() {
    return 3.141f * radius * radius;
  }
}

/* 
  WHAT NEW DID WE LEARN?
  ----------------------
  - Non-static attribute/variable
  - Non-static method
  - Instantiation of a class
  - Calling a non-static method of a class.

  EXERCISE
  --------
  - Modify the square class to have a length attribute and a non-static area method.

  ISSUE
  -----
  We show that instantiating a Circle and initialising its radius attribute
  in two steps is an error prone approach by actually creating an error.

  SOLUTION
  --------
  See OC5.java
*/
