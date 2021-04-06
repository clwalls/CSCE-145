/**
 * Auto Generated Java Class.
 */
import java.util.Scanner;

public class TacoDB {
  
  public static final int NUM_TACOS = 10;
  public static void main(String[] args) { 
    Scanner keyboard = new Scanner(System.in);
    String[] names = new String[NUM_TACOS];
    double[] prices = new double[NUM_TACOS];
    
    System.out.println("Welcome to the taco price sorter! Enter 10 taco names and prices and I'll sort it!");
    for(int i=0; i<NUM_TACOS; i++) 
    {
      System.out.println("Enter the name of taco " + (i+1));
      names[i] = keyboard.nextLine();
      System.out.println("Enter taco's price");
      prices[i] = keyboard.nextDouble();
      keyboard.nextLine();
    }
    keyboard.close();
    //Sort by price
    System.out.println("Sorted Tacos are");
    boolean hasSwapped = true;
    while (hasSwapped)
    {
      for(int i=0; i<NUM_TACOS-1; i++) {
        if(prices[i]>prices[i+1])
        {
          double temp = prices[i];
          prices[i] = prices[i+1];
          prices[i+1] = temp;
          i=-1;
          hasSwapped=true; 
        }
        hasSwapped = false;
      }
      for (int i=0; i<NUM_TACOS; i++)
      {
        System.out.println(names[i]+" "+prices[i]);
      }
    }
  }
  
  /* ADD YOUR CODE HERE */
  
}
