import java.util.Scanner;
/**
 * Created by Christopher Walls. 
 */
public class InformationCollection {
  
  
  public static void main(String[] args) { 
  Scanner keyboard = new Scanner(System.in);
  System.out.println("Welcome to Tinder. Please enter the following information for we can find who's right for you:");
  System.out.println("Enter your name: ");
  String name = keyboard.nextLine();
  System.out.println("Enter your age: ");
  Short age = keyboard.nextShort();
  System.out.println("Enter your height (in meters): ");
  Double height = keyboard.nextDouble();
  System.out.println("Enter your blood type: ");
  String bloodType = keyboard.nextLine();
  keyboard.nextLine();
  System.out.println("Are you a cat person? True or False ");
  Boolean catPerson = keyboard.nextBoolean();
  System.out.println("Are you a dog person? True or False");
  Boolean dogPerson = keyboard.nextBoolean();
  System.out.println("Are you a reptilian shape shifter? True or False ");
  Boolean shapeShifter = keyboard.nextBoolean();
  System.out.println("How much gold do you have buried on your property? In kilograms ");
  Double gold = keyboard.nextDouble();
  System.out.println("Name: " + name);
  System.out.println("Age: " + age + " years old");
  System.out.println("Height: " + height +"m");
  System.out.println("Blood Type: "+ bloodType);
  System.out.println("Cat Person: " + catPerson);
  System.out.println("Dog Person: " + dogPerson);
  System.out.println("Reptilian Shape Shifer: " + shapeShifter);
  System.out.println("Amount of gold buried on land " + gold + "kg");
  keyboard.close();
  }
  
  /* ADD YOUR CODE HERE */
  
}
