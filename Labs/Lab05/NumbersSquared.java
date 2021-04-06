/**
 * Written by Christopher Walls and Shyam Patel. 
 */
import java.util.Scanner;
public class NumbersSquared {
  
  public static void main(String[] args) { 
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter a 4 digit number: ");
    String digits = keyboard.next();
    
    String firstDigit = digits.substring(0,1);  
    String secondDigit = digits.substring(1,2);
    String thirdDigit = digits.substring(2,3);
    String fourthDigit = digits.substring(3,4);
    
    System.out.println(digits);
    System.out.println(digits.substring(1,2)+"  " + thirdDigit); //This was done with substrings and variables
    System.out.println(digits.substring(2,3)+"  " + secondDigit);//to show the usage of both in different applications.
    System.out.println(fourthDigit+thirdDigit+secondDigit+firstDigit);
    keyboard.close();
  
  
    }
  
  /* ADD YOUR CODE HERE */
  
}
