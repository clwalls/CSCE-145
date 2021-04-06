/**
 * Written by Christopher Walls.
 */
import java.util.Scanner;
public class LoginAttempt {
  
  
  public static void main(String[] args) { 
    Scanner kb = new Scanner(System.in);
    System.out.println("What is your name");
    String name = kb.next();
    System.out.println("What is your password?");
    String password = kb.next();
    
    if (name.equals("Bob") && password.equals("schnitzel")) {
    System.out.println("Meet at the rendezvous at 1900");
    }
    
    else {
    System.out.println("Something smells fishy...");
    }
    kb.close();
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
