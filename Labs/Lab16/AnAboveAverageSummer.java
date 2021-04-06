//Written by Christopher Walls
import java.util.Scanner;
public class AnAboveAverageSummer {
  
  
  public static void main(String[] args){
    Scanner kb = new Scanner(System.in);
    
    System.out.println("Welcome to the above average temperature tester program.");
    
    //Create a string array to store the temperature of days
    double arrayOfTemperature[] = new double[10];
    double temperatureAverage = 0.0;
    for (int i = 0; i < arrayOfTemperature.length; i++) {
      System.out.print("Please enter the temperature for day " + (i+1) + " : ");
      arrayOfTemperature[i] = kb.nextDouble();
      //Calculate average based on array and number of entries (10)
      temperatureAverage += arrayOfTemperature[i] / 10;
    }
    
    System.out.println("The average temperature was " + temperatureAverage);
    System.out.println("The days that were above average were: ");

    //Check for days that are above average, and print them. 
    for(int i = 0;i < 10; ++i){
    if(temperatureAverage < arrayOfTemperature[i]) {
      System.out.print("Day " + (i+1) + " with " + arrayOfTemperature[i]+"\n");
    }
    }
    System.out.println("\nDONE!");
    kb.close();
  }
  
  /* ADD YOUR CODE HERE */
  
}

