/**
 * Written by Christopher Walls.
 */
import java.util.*;
public class BoxSorter {
  
  
  public static void main(String[] args) { 
    Box[] boxes = new Box[5];
    Scanner kb = new Scanner(System.in);
    
    System.out.println("Welcome to the box sorter!");
    System.out.println("Enter the information about boxes and I'll sort them!");
    
    for (int i = 0; i < boxes.length; i++){
      boxes[i] = new Box();
      System.out.println("Enter the label, length, width, and height (all feet) of box "+ i);
      boxes[i].setLabel(kb.nextLine());
      boxes[i].setLength(Double.parseDouble(kb.nextLine()));
      boxes[i].setWidth(Double.parseDouble(kb.nextLine()));
      boxes[i].setHeight(Double.parseDouble(kb.nextLine()));
    }
    boolean hasSwapped = true;
    while (hasSwapped)
    {
      for(int i = 0; i<boxes.length-1; i++) {
        if(boxes[i].getVolume()>boxes[i+1].getVolume())
        {
          Box temp = boxes[i];
          boxes[i] = boxes[i+1];
          boxes[i+1] = temp;
          i=-1;
          hasSwapped=true; 
        }
        hasSwapped = false;
      }
      for (int i = 0; i<5; i++)
      {
        System.out.println(boxes[i]);
      }
    }
  }
  
  /* ADD YOUR CODE HERE */
  
}
