/**
 * Written by Christopher Walls.
 */
public class SawLine implements Line{
  private double modValue;
  
  public SawLine() { 
    this.modValue = modValue;
  }
  public SawLine(double mV) {
    modValue = mV;
  }
  
  public double getModValue() {
    return this.modValue;
  }
  public void setModValue(double mV) {
    modValue = mV;
  }
  
  public double getYPoint(double x) {
    return x % modValue;
  }
  /* ADD YOUR CODE HERE */
  
}

