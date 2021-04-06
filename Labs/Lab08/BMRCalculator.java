import java.util.Scanner;
  /**
 * Written by Christopher Walls.
 */
public class BMRCalculator {
  
  public static void main(String[] args) { 
    Scanner kb = new Scanner(System.in); 
    
    System.out.println("Welcome to the BMR calculator!");
    System.out.println("First are you male or female? Enter M or F:");
    String gender = kb.next();
    System.out.println("How tall are you in inches?");
    int height = kb.nextInt();
    System.out.println("What is your weight in pounds?");
    int weight = kb.nextInt();
    System.out.println("What is your age in years?");
    int age = kb.nextInt();                
    System.out.println("How would you describe your lifestyle? Sedentary, Somewhat Active, Active, Highly Active?");
    String lifestyle = kb.next();
    
    Double BMR = 0.0;
    //Calculates BMR based on user input, different formula depending on gender.
         if (gender.equals("M")) {
           BMR = (66+(6.3*weight)+(12.9*height)-(6.8*age));
         }
         else if (gender.equals("F")) {
           BMR = (655+(4.3*weight)+4.7*height)-(4.7*age);
         }
         else {
         System.out.println("There are only two genders!");
         System.exit(1);
         }
    //Calculates BMR multiplier based on user's inputted lifestyle. 
         if( lifestyle.equals("Sedentary")){
           BMR = (BMR*1.2);
         }
         else if (lifestyle.equals("Somewhat Active")){
           BMR = (BMR*1.3);
         }
         else if (lifestyle.equals("Active")){
           BMR = (BMR*1.4);
         }
         else if (lifestyle.equals("Highly Active")){
           BMR = (BMR*1.5);
         }
    System.out.println("Your BMR is " + BMR + " calories!");
    kb.close();
  }
  
  /* ADD YOUR CODE HERE */
  
}
