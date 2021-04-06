/**
 * Written by Christopher Walls.
 */
import java.util.Scanner;
public class DresserFrontEnd {
  /**
   * Responsible for prompting user on what they want to do
   */
  
  public static void main(String[] args) { 
    Clothing piece = new Clothing();
    Dresser dresser = new Dresser();
    Scanner kb = new Scanner(System.in);
    
    System.out.println("Welcome to the dresser!");
    String input = "";
    while (input.equalsIgnoreCase("quit")!= true)
    {
      int response = getUserInput();
      switch(response){
        case 1:
          piece = getItem();
          dresser.add(piece);
          break;
        case 2:
          piece = getItem();
          dresser.remove(piece);
          break;
        case 3:
          dresser.print();
          break;
        case 9:
          System.out.println("Goodbye");
          System.exit(0);
      }  
    }
  }
  //promptUser asks for user input, returning their choice.
  public static int getUserInput () {
    Scanner kb = new Scanner(System.in);
    int input;
    System.out.println("Enter 1: to add an item\nEnter 2: to remove an item");
    System.out.println("Enter 3: to print out the dresser contents\nEnter 9: to quit");
    input = kb.nextInt();
    return input;
  }
  public static Clothing getItem() {
    Clothing piece = new Clothing();
    Scanner kb = new Scanner(System.in);
    String input = "";
    System.out.println("Enter the type");
    System.out.println("It may be undergarment, socks, stockings, top, bottom, or cape");
    input = kb.nextLine();
    piece.setType(input);
    System.out.println("Enter a color");
    System.out.println("It may be brown, red, pink, orange, green, blue, purple, or grey");
    input = kb.nextLine();
    piece.setColor(input);
    piece.toString();
    return piece;
  }
  /* ADD YOUR CODE HERE */
  
}
