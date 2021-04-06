/**
 * Written by Christopher Walls.
 */
import java.util.*;

public class ShapeCollection {
  
  private Shape[] shapes;
  private int arraySize = 10;
  
  public ShapeCollection() { 
    shapes = null;
  }
  public ShapeCollection(Shape[] a) { 
    shapes = a;
  }
  
  public void addShape(Shape a) {
    for (int i = 0; i<shapes.length; i++) { 
      if (shapes[i] == null) {
        shapes[i] = a;
      }
    }
  }
  
  private void sortShapes() { //BUBBLE SORT
    boolean hasSwapped = true;
    
    while(hasSwapped = true) {
      hasSwapped = false;
      for(int i = 0; i<shapes.length-1 && shapes[i+1]!=null; i++) {
        if(shapes[i].getArea() > shapes[i+1].getArea()) {
          Shape temp = shapes[i];
          shapes[i] = shapes[i+1];
          shapes[i+1] = temp;
          hasSwapped = true;
        }
      }
    }
  }
  
  
  public void removeShape(String type, double area) {
    for (int i = 0; i<shapes.length; i++) {
      if ((shapes[i].getShapeType().equalsIgnoreCase(type)) && (shapes[i].getArea()==area)) {
        shapes[i] = null;
      }
    }
  }
  
  public void printShapes() {
    for(int i = 0; i<shapes.length; i++) {
      if(shapes[i]!=null) {
        System.out.println(shapes[i]);
      }
    }
  }
  
}
