/**
 * Program written by Christopher Walls and Jordan Banks. 
 */
import java.util.Scanner;

public class BearNecessitiesStore {
  
  public static void main(String[] args) { 
     Scanner keyboard = new Scanner(System.in);
     System.out.println("Welcome to the Big Bears Club.");
     System.out.println("Please enter the number of Salmon that you'll be purchasing:");
     int numSalmon = keyboard.nextInt();
     System.out.println("Please enter the number of Combs that you'll be purchasing:");
     int numCombs = keyboard.nextInt();
     System.out.println("Please enter the number of Napkins that you'll be purchasing:");
     int numNapkins = keyboard.nextInt();
     int priceSalmon = (numSalmon*50);
     int priceCombs = (numCombs*100);
     int priceNapkins = (numNapkins*20);
     int costBerries = (priceNapkins+priceCombs+priceSalmon);
     System.out.println("Total cost in berries: " + costBerries + ".");
     keyboard.close();
  }
  
  /* ADD YOUR CODE HERE */
  
}
