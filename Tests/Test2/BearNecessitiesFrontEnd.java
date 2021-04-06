/**
 * Written by Christopher Walls.
 */
import java.util.*;
public class BearNecessitiesFrontEnd {
  
  
  public static void main(String[] args) { 
    Scanner kb = new Scanner(System.in);
    double totalCharge = 0.0;
    int amountChoice = 0;
    
    System.out.println("How many items in list, max? (DO NOT HAVE TO FILL LIST)");
    int numItems = kb.nextInt();
    Item[] items = new Item[numItems];
    
    int input = 0;
    for (int i = 0; i <= numItems; i++){ //KEEP PROMPTING TILL NUM ITEMS MET
      items[i] = new Item();
      while(input!=3){
        System.out.println("1. Add an item,\n2.remove an item or\n3.quit and print total");
        input = kb.nextInt();
        if(i>=numItems){
          System.out.println("List is full, cannot add more");
          break;
        }
        if(input==1){ //add an item
          System.out.println("Enter\n1. for Salmon,\n2. for comb, or\n3.for napkins");
          int itemChoice = kb.nextInt();
          switch(itemChoice){
            case 1: //for Salmon
              items[i].setName("salmon");
              System.out.println("How many?");
              amountChoice = kb.nextInt();
              items[i].setQuantity(amountChoice);
              items[i].setCost(50.0);
              totalCharge = totalCharge + (amountChoice*50.0);
              break;
            case 2: //for comb
              items[i].setName("comb");
              System.out.println("How many?");
              amountChoice = kb.nextInt();
              items[i].setQuantity(amountChoice);
              items[i].setCost(100.0);  
              totalCharge = totalCharge + (amountChoice*100.0);
              break;
            case 3: //for napkins
              items[i].setName("napkins");
              System.out.println("How many?");
              amountChoice = kb.nextInt();
              items[i].setQuantity(amountChoice);
              items[i].setCost(20.0);
              totalCharge = totalCharge + (amountChoice*20.0);
              //ADD TO TOTAL COST
              break;
          }
        }
        else if (input==2){ //remove an item
          System.out.println("Enter the item index to remove: ");
          System.out.println();
          for (int j = 0; j<numItems; j++){
            System.out.println(i+". "+items[j]);
          }
          int removeChoice = 0;
          removeChoice = kb.nextInt();
          items[removeChoice] = null;
          //PRINT ARRAY VALUES WITH quantity, itemType, cost
          System.out.println("Item removed!");
        }
        else if (input==3){
          System.out.println("Thanks for shopping at the Bear Kiosk!");
          System.out.println("Your total charge today is: " +totalCharge +"berries.");
          System.exit(0);
        }
      }
    }
  }
  
  
  
  
}
