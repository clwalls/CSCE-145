/**
 * Written by Christopher Walls.
 */
public class Box {
  private String label;
  private double length;
  private double width;
  private double height;
  
  public Box() { 
    label = "";
    length = 0.0;
    width = 0.0;
    height = 0.0;
  }
  //Mutators
  public void setLabel(String lab){
    label = lab;
  }
  public void setLength(double len){
    if (len>0.0) {
      length = len;
    }
  }
  public void setWidth(double wid){
    if (wid>0.0) {
      width = wid;
    }
  }
  public void setHeight(double hei){
    if (hei>0.0) {
      height = hei;
    }
  }
  
  //Accessors
  public String getLabel(){
    return label;
  }
  public double getLength(){
    return length;
  }
  public double getWidth(){
    return width;
  }
  public double getHeight(){
    return height;
  }
  
  //Methods
  public double getVolume(){
    return getHeight()*getWidth()*getLength();
  }
  public String toString(){
    return "Label: "+getLabel()+" "+getVolume();
  }
  /* ADD YOUR CODE HERE */
  
}
