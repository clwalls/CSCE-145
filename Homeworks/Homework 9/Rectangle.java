/**
 * Written by Christopher Walls.
 */
public class Rectangle implements Shape{
  
  //INSTANCE VARIABLES
  private double length;
  private double width;
  
  //CONSTRUCTORS
  public Rectangle() { 
    length = 0.0;
    width = 0.0;
  }
  public Rectangle(double l, double w) {
    length = w;
    width = w;
  }
  
  //ACCESSORS
  public double getLength() {
    return length;
  }
  public double getWidth() {
    return width;
  }
  
  //MUTATORS
  public void setLength(double d){
    if (d>0.0) {
    length = d;
    }
    else {
      System.out.println("Invalid length");
      length = 0.0;
    }
  }
  public void setWidth(double d) {
    if (d>0.0) {
    width = d;
    }
    else {
      System.out.println("Invalid width");
      width = 0.0;
    }
  }
  
  //METHODS
  public double getArea() {
    return length*width;
  }
    public String toString() {
    return "Rectangle " + "Length " + getLength() + " Width " + getWidth() + " Area " + getArea();
  }
  public String getShapeType() {
    return "Rectangle";
  }
  
  /* ADD YOUR CODE HERE */
  
}
