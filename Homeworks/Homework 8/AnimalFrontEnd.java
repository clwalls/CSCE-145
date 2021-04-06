
import java.util.Scanner;
public class AnimalFrontEnd {
  static Scanner keyboard;
  
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in); 
    
    
    System.out.println("Welcome to the Cat and Dog Collection!");
    AnimalCollection AC = new AnimalCollection();
    
    boolean quit = false;
    while(!quit)
    {
      printOptions();
      
      int pick = keyboard.nextInt();
      keyboard.nextLine();
      switch(pick)
      {
        case 1:
          AC.addAnimal(makeAnimalDialog());
          break;
        case 2: //SHOULD BE REMOVED BASED ON NAME
          AC.removeAnimal(makeAnimalDialog());
          break;
        case 3:
          quit = true;
          break;
        default:
          System.out.println("Invalid choice");
      }
      
    }
    System.out.println("Goodbye");
  }
  
  public static void printOptions()
  {
    System.out.println("1. Add a cat or dog\n2. Remove a cat or dog\n3. Quit\nEnter a selection");
  }
  
  public static Animal makeAnimalDialog()
  {
    Animal aA;
    int choice = 0;
    System.out.println("Would you like to add a 1. House Cat, 2. A Leopard, 3. A Domestic Dog, or 4. A wolf");
    choice = keyboard.nextInt();
    keyboard.nextLine();
    while(choice != 1 && choice != 2 && choice != 3)
    {
      System.out.println("Invalid choice, choose again");
      choice = keyboard.nextInt();
      keyboard.nextLine();
    }
    switch(choice)
    {
      case 1:
        System.out.println("Enter the house cat's name, weight, mood, and type");
        String name = keyboard.nextLine();
        keyboard.nextLine();
        double weight = keyboard.nextDouble();
        keyboard.nextLine();
        String mood = keyboard.nextLine();
        keyboard.nextLine();
        String type = keyboard.nextLine();
        aA = new HouseCat(name,weight,mood,type);
        
        break;
      case 2:
        System.out.println("Enter the leopard's name, weight, mood, and number of spots");
        String lname = keyboard.nextLine();
        keyboard.nextLine();
        double lweight = keyboard.nextDouble();
        keyboard.nextLine();
        String lmood = keyboard.nextLine();
        keyboard.nextLine();
        int numberofSpots = keyboard.nextInt();
        aA = new Leopard(lname,lweight,lmood, numberofSpots);
        break;
      case 3:
        System.out.println("Enter the domestic dog's name, weight, energy level, and type");
        String dname = keyboard.nextLine();
        keyboard.nextLine();
        double dweight = keyboard.nextDouble();
        keyboard.nextLine();
        int denergyLevel = keyboard.nextInt();
        keyboard.nextLine();
        String dtype = keyboard.nextLine();
        aA = new DomesticDog(dname,dweight, denergyLevel, dtype);
        break;
      case 4:
        System.out.println("Enter the wolf's name, weight, energy level, and type");
        String wname = keyboard.nextLine();
        keyboard.nextLine();
        double wweight = keyboard.nextDouble();
        keyboard.nextLine();
        int wenergyLevel = keyboard.nextInt();
        keyboard.nextLine();
        String wtype = keyboard.nextLine();
        aA = new Wolf(wname,wweight,wenergyLevel, wtype);
        break;
        
      default:
        String aName= null;
        double aWeight = 0.0;
        aA = new Animal(aName,aWeight);
        
    }
    
    return aA;
  }
  
  
  
  
  /* ADD YOUR CODE HERE */
  
}
