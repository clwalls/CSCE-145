/**
 * Written by Christopher Walls. //hey parth do CTRL+A + tab for this lab
 */
import java.util.Scanner;
public class IrisType {
  
  
  public static void main(String[] args) { 
    Scanner kb = new Scanner(System.in);
    System.out.println("Answer 2-3 questions to figure out what type of iris you've got!");
    System.out.println("Bulb or Rhizome?:");
    String irisType = kb.next();
    String crested = "";
    String bearded = "";
    //Variable assignment and declaration for use later in the code.
         if (irisType.equalsIgnoreCase("Bulb")) {
              System.out.println("Bloom in Spring or Summer?: ");
              String bloom = kb.next();
              if (bloom.equalsIgnoreCase("Spring")) {
                   System.out.println("It's a RETICULATA!");
              }
              else if (bloom.equalsIgnoreCase("Summer")) {
                   System.out.println("It's a DUTCH!");
              }
                       }
         else if (irisType.equalsIgnoreCase("Rhizome")) {
           System.out.println("Does it have a Crest? (yes/no): ");
           crested = kb.next();
           //Had issues with if(kb.next().equalsIgnoreCase("yes")) double asking, so I created variables for each.
         }
           if (crested.equalsIgnoreCase("yes")) {
             System.out.println("It's a CRESTED!");
           }
           else if(crested.equalsIgnoreCase("no")) {
             System.out.println("Does it have a Beard? (yes/no)");
             bearded = kb.next();
             if (bearded.equalsIgnoreCase("yes")) {
               System.out.println("It is BEARDED!");
             }
             else if (bearded.equalsIgnoreCase("no")) {
               System.out.println("It is BEARDLESS!");
             }
             
           }
    kb.close();
                          
                        
         
  }
  
}
