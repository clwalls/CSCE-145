/**
 * Written by Christopher Walls.
 */
public class SineLine implements Line{
  private double amplitude;
  private double frequency;
  
  public SineLine() { 
    this.amplitude = amplitude;
    this.frequency = frequency;
  }
  public SineLine(double a, double f) {
    amplitude = a;
    frequency = f;
  }
  
  public double getAmplitude() {
    return amplitude;
  }
  public double getFrequency() {
    return frequency;
  }
  
  public void setAmplitude(double a) {
    amplitude = a;
  }
  public void setFrequency(double f) {
    frequency = f;
  }
  
  public double getYPoint(double x) {
    return (amplitude*Math.sin(x*frequency));
  }
  /* ADD YOUR CODE HERE */
  
}
