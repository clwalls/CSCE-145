/**
 * Written by Christopher Walls.
 */
public class Circle implements Shape{
  
  //INSTANCE VARIABLES
  private double radius;
  
  //CONSTRUCTORS
  public Circle() { 
    radius = 0.0;
  }
  public Circle(double r) {
    radius = r;
  }
  
  //ACCESSORS
  public double getRadius() {
    return radius;
  }
  
  //MUTATORS
  public void setRadius(double d) {
    if (d>0.0) {
    radius = d;
    }
    else {
      System.out.println("Invalid radius");
      radius = 0.0;
    }
  }
  
  //METHODS
  public double getArea() {
    return (3.1459*radius*radius);
  }
    public String toString() {
    return "Circle " + "Radius " + getRadius() + " Area " + getArea();
  }
  public String getShapeType() {
    return "Circle";
  }
  
  
  /* ADD YOUR CODE HERE */
  
}
