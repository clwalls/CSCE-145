/**
 * Written by Christopher Walls.
 */
import java.util.Scanner;
public class LetterFrequency {
  
  
  public static void main(String[] args) { 
    Scanner kb = new Scanner(System.in);
    
    int[] alphabet = new int[26];
    String input="";
    
    System.out.println("Input String:");
    input = kb.nextLine();
    input = input.toLowerCase();
    
    for (int i=0;i<input.length();i++){
      char d=input.charAt(i);
      int value = (int) d;
      if(value>=97 && value<=122){
        alphabet[d-'a']++;
      }
    }
    for (int i=0; i<alphabet.length; i++){
      if (alphabet[i]>0){
        char d=(char)(i+97);
        System.out.println("There were " +alphabet[i]+" " +d);
      }
          }
    kb.close();
  }
  
  /* ADD YOUR CODE HERE */
  
}
