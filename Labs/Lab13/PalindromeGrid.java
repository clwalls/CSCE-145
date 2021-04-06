/**
 * Written by Christopher Walls.
 * Samuel McFall
 */
import java.util.Scanner;
public class PalindromeGrid {
  
  
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    
    String input;
    input="";
    int length, i, start, mid, end, width, height, widthIncrement;//i for increment, rest to find string positions or grid.
    
    System.out.println("Enter a word to see if it's a palidrome: ");
    input = kb.nextLine();
    length = input.length();
    
    start=0;
    end=length-1;//-1 to find end position because counting starts at 0
    mid=(start+end)/2;
    
    for (i=start; i<=mid; i++){
      if (input.charAt(start)==input.charAt(end)){
        start++;
        end--;//When first and last letters are the same, it will keep going till they are the same position.
      }//end if loop
      else {
        break;
      }//end else
    }
    if (i==mid+1){
      System.out.println("Is a palindrome.");
      i=0;
    }//end print if statement
    else {
      System.out.println("Not a palindrome.");
      i=0;
    }//end else statement
    System.out.println("Beginning grid code. . . . ");
    System.out.println("What's the string?");
    input = kb.nextLine();
    System.out.println("What's the width?");
    width = kb.nextInt();
    widthIncrement=width;
    System.out.println("What's the height?");
    height = kb.nextInt();
    kb.close();
    
    while ((height>0)&&(width!=0)){
    for (i=0; width>0; --width){
      System.out.print(input+" ");
    }//end width grid for loop
    System.out.println("");
    width=widthIncrement;
    --height;
    }//end while loop height
    }//end public
  }//end class
