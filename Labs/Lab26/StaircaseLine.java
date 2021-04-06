/**
 * Written by Christopher Walls.
 */
public class StaircaseLine implements Line{
  private double width;
  private double height;
  
  public StaircaseLine() { 
    this.width = width;
    this.height = height;
  }
  public StaircaseLine(double w, double h) {
    width = w;
    height = h;
  }
  
  public double getWidth() {
    return width;
  }
  public double getHeight() {
    return height;
  }
  
  public void setWidth(double w) {
    width = w;
  }
  public void setHeight(double h) {
    height = h;
  }
  
  public double getYPoint(double x) {
    return Math.floor((int)x/(int)width)*height;
  }
  /* ADD YOUR CODE HERE */
  
}
