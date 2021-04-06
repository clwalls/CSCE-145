/**
 * Written by Christopher Walls.
 */
import java.util.Scanner;
public class ByteConverter {
  
  
  public static void main(String[] args) { 
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter an 8 bit binary number and I will convert it to decimal.");
    String binary = keyboard.next();
    
    String firstDigit   = binary.substring(0,1);
    int firstNum = (Integer.parseInt(firstDigit)*128);
    String secondDigit  = binary.substring(1,2);
    int secondNum = (Integer.parseInt(secondDigit)*64);
    String thirdDigit   = binary.substring(2,3);
    int thirdNum = (Integer.parseInt(thirdDigit)*32);
    String fourthDigit  = binary.substring(3,4);
    int fourthNum = (Integer.parseInt(fourthDigit)*16);
    String fifthDigit   = binary.substring(4,5);
    int fifthNum = (Integer.parseInt(fifthDigit)*8);
    String sixthDigit   = binary.substring(5,6);
    int sixthNum = (Integer.parseInt(sixthDigit)*4);
    String seventhDigit = binary.substring(6,7);
    int seventhNum = (Integer.parseInt(seventhDigit)*2);
    String eighthDigit  = binary.substring(7,8);
    int eighthNum = (Integer.parseInt(eighthDigit)*1);

   
    int decimal;
    decimal = firstNum+secondNum+thirdNum+fourthNum+fifthNum+sixthNum+seventhNum+eighthNum;
    System.out.println(binary+" in decimal form is " + decimal);

    keyboard.close();
  }
  
  /* ADD YOUR CODE HERE */
  
}
