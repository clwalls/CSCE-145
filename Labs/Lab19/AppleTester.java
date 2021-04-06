/**
 * Written by Christopher Walls.
 */
public class AppleTester 
{
  public static void main(String[] args) 
  { 
    System.out.println("Welcome to the apple tester\n");
  
    System.out.println("Creating a default apple\nPrinting the default apple's values");
    Apple definition = new Apple();
    System.out.println(definition.toString()); System.out.println();
   
    System.out.println("Creating another apple"); 
    System.out.println("Setting the new apple's values to the following valid values \"Granny Smith\" 0.75 0.99");
    Apple valid = new Apple();
    valid.setFlavors("Granny Smith");
    valid.setWeight(0.75);
    valid.setPrice(0.99);
    System.out.println(valid.toString()); System.out.println();

    System.out.println("Creating another apple");
    System.out.println("Setting the new apple's values to the following invalid values \"iPad\" 2.5 -200");
    Apple invalid = new Apple();
    invalid.setFlavors("iPad");
    invalid.setWeight(2.5);
    invalid.setPrice(-200);
    
    System.out.println("Printing apple's values which should have not changed from the default values");
    System.out.println(invalid.toString());
  }
}
