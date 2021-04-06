import java.util.Scanner;
/**
 * Made by Christopher Walls and Samuel. 
 */
public class C2Fconverter {
  
  public static void main(String[] args) {  
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter the temperature, numbers only: ");
    double temp=keyboard.nextDouble();
    keyboard.nextLine();
    System.out.println("Enter the unit, C or F: ");
    String ans = keyboard.nextLine();
    if ( ans.equals("C") ){
      System.out.println( (9.0/5.0)*temp + 32.0 + "F");
    }
    else if (ans.equals("F")) {
      System.out.println( (5.0/9.0)*(temp-32.0) + "C");
    }
    keyboard.close();
  }
  
  /* ADD YOUR CODE HERE */
  
}
