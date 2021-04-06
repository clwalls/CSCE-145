/**
 * Written by Christopher Walls.
 */
public class SlopedLine implements Line{
  private double slope;
  
  public SlopedLine() { 
    this.slope = slope;
  }
  public SlopedLine(double s) {
    slope = s;
  }
  
  public double getSlope() {
    return slope;
  }
  public void setSlope(double s) {
    slope = s;
  }
  
  public double getYPoint(double x) {
    return (slope*x);
  }
  /* ADD YOUR CODE HERE */
  
}
