/**
 * Written by Christopher Walls.
 */
public class Triangle implements Shape{
  
  //INSTANCE VARIABLES
  private double base;
  private double height;
  
  //CONSTRUCTORS
  public Triangle() { 
    base = 0.0;
    height = 0.0;
  }
  public Triangle(double b, double h) {
    base = b;
    height = h;
  }
  
  //ACCESSORS
  public double getBase() {
    return base;
  }
  public double getHeight() {
    return height;
  }
  
  //MUTATORS
  public void setBase(double d) {
    if (d>0.0) {
      base = d;
    }
    else {
      System.out.println("Invalid base");
      base = 0.0;
    }
  }
  public void setHeight(double d) {
    if (d>0.0) {
      height = d;
    }
    else {
      System.out.println("Invalid height");
      height = 0.0;
    }
  }
  
  //METHODS
  public double getArea() {
    return (0.5*base*height);
  }
  public String toString() {
    return "Triangle " + "Base " + getBase() + " Height " + getHeight() + " Area " + getArea();
  }
  public String getShapeType() {
    return "Triangle";
  }
  
  /* ADD YOUR CODE HERE */
  
}
