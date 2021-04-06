/**
 * Written by Christopher Walls.
 */
import java.util.Scanner;
public class BobsTools {
  
  
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    
    //Variable declaration and assignment.
    String ans, wireColor;
    ans="";
    wireColor="";
    int loop, feet, inchesIncrement, inches;
    loop=0; feet=1; inchesIncrement=12; inches=12;
    double base, height, area; 
    base=0.0; height=0.0; area=0.0;
    
    
    System.out.println("What tool would you like to use?");
    System.out.println("\"1\" - triangle area\n\"2\" - wire color to gauge\n\"3\" - feet to inches chart");
    ans = kb.nextLine();
    
    if (ans.equals("1")){
      System.out.println("Base of triangle = ");
      base=kb.nextDouble();
      System.out.println("Height of triangle = ");
      height=kb.nextDouble();
      area=(.5*base*height);
      System.out.println("The area of the triangle is " +area);
    }//end of if "case 1"
    else if (ans.equals("2")){
      System.out.println("What's the wire color? : ");
      wireColor=kb.next();
      if (wireColor.equalsIgnoreCase("white")){
        System.out.println("14 gauge");
      }//end of "white"
          else if (wireColor.equalsIgnoreCase("yellow")){
            System.out.println("12 gauge");
          }//end of "yellow"
          else if (wireColor.equalsIgnoreCase("orange")){
            System.out.println("10 gauge");
          }//end of "orange"
          else if (wireColor.equalsIgnoreCase("black")){
            System.out.println("8 or 6 gauge");
          }//end of "black"
          else {
            System.out.println("You need to look elsewhere");
          }//end of "anything else"
    }//end of else if "case 2"
    else if (ans.equals("3")){
      while (loop<9){
      System.out.println(feet+" foot ="+inches+ "inches");
      ++loop;
      ++feet;
      inches=feet*inchesIncrement;
      }//end of while (loop<9)
      
    }//end of else if "case 3"
    else{
      System.out.println("Player pick a valid tool!");
    }//end of else for cases 
  }//main
}//class
