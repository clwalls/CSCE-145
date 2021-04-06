/**
 * Written by Christopher Walls.
 */
public class ExponentialLine implements Line{
  private double exponent;
  
  public ExponentialLine() { 
    this.exponent = exponent;
  }
  public ExponentialLine(double ex) {
    exponent = ex;
  }
  
  public double getYPoint() {
    return this.exponent;
  }
  public void setExponent(double ex) {
    exponent = ex;
  }
  
  public double getYPoint(double x) {
    return Math.pow(x, exponent);
  }
  /* ADD YOUR CODE HERE */
  
}