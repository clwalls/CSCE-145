/**
 * Written by Christopher Walls.
 */
import java.util.Scanner;

public class ShapeFrontEnd {
  
  
  public static void main(String[] args) { 
    Scanner kb = new Scanner(System.in);
    ShapeCollection newShape = new ShapeCollection();
    
    System.out.println("Welcome to the Shapes collections");
    
    int input = 0;
    while (input!=9) {
      System.out.println("Enter 1: Add a shape\nEnter 2: Remove a shape\nEnter 9: Quit");
      input = kb.nextInt();
      if (input==9) {
        System.out.println("Good bye");
        System.exit(0);
      }
      String shape = "";
      switch (input) {
        case 1: //add a shape
          System.out.println("What type of shape?\nRectangle, Triangle, or Circle?");
          shape = kb.nextLine();
          kb.nextLine();
          if (shape.equalsIgnoreCase("rectangle")) {
            System.out.println("Enter a length followed by a width");
            double length = 0.0; double width = 0.0;
            length = kb.nextDouble();
            width = kb.nextDouble();
            if (length > 0 || width > 0) {
              Rectangle newRectangle = new Rectangle(length, width);
              newShape.addShape(newRectangle);
            }
          }//end rectangle
          else if (shape.equalsIgnoreCase("triangle")) {
            System.out.println("Enter a base followed by a height");
            double base = 0.0; double height = 0.0;
            base = kb.nextDouble();
            height = kb.nextDouble();
            if (base > 0 || height > 0) {
              Triangle newTriangle = new Triangle(base, height);
              newShape.addShape(newTriangle);
            }
          }//end triangle
          else if (shape.equalsIgnoreCase("circle")) {
            System.out.println("Enter a radius");
            double radius = 0.0;
            radius = kb.nextDouble();
            if (radius > 0) {
              Circle newCircle = new Circle(radius);
              newShape.addShape(newCircle);
            }
          }//end circle
          break;
        case 2: //remove a shape
          double area = 0.0; String type = "";
          System.out.println("Enter the shape type");
          type = kb.nextLine();
          kb.nextLine();
          System.out.println("Enter an area");
          area = kb.nextDouble();
          newShape.removeShape(type, area);
          break;
        default:
          System.out.println("Invalid input");
          break;
      }//end switch
      newShape.printShapes();
    }//end while
    
  }//end main
  
}//end class