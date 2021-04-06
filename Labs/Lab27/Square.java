/**
 * Written by Christopher Walls.
 */
public class Square {
  //INSTANCE VARIABLES
  private int length;
  //CONSTRUCTORS
  public Square() { 
    length = 1;
  }
  public Square(int length) {
    this.length = length;
  }
  
  //ACCESSORS
  public int getLength() {
    return length;
  }
  //MUTATORS
  public void setLength(int aLength) throws DimensionException {
    if(length<=0){ 
      throw new DimensionException();
    }
    else
      length = aLength;
  }
  
  //METHODS
  public void draw() {
    for(int i=0;i<this.length;i++) {
      for(int j=0;j<this.length;j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
  public int getArea() {
    return length*length;
  }
  public int getPerimeter() {
    return length*4;
  }
  
  
  /* ADD YOUR CODE HERE */
  
}
