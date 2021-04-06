/**
 * Written by Christopher Walls.
 */
import java.util.*;
public class HouseHunter {
  
  
  public static void main(String[] args) { 
    Scanner kb = new Scanner(System.in);
    System.out.println("Welcome to HouseHunter 3000!");
    String str = "";
    int numHouses = 0;
    int input = 1;
    double inputDouble = 0.0;
    
    do {
      System.out.println("How many houses are we looking at today? (must be >1)");
      numHouses = kb.nextInt();
    } while(numHouses <= 1);
    House[] houses = new House[numHouses];
    for (int i = 0; i < numHouses; i++){
      houses[i] = new House();
      
      System.out.println("House " +i+":");
      do {
        System.out.println("Enter cost >$0: $");
        input = kb.nextInt();
      } while(input<=0);
      houses[i].setCost(input);
      
      do {
        System.out.println("Enter # bedrooms >$0: $");
        input = kb.nextInt();
      } while(input<=0);
      houses[i].setBedrooms(input);
      
      do {
        System.out.println("Enter # baths >$0: $");
        inputDouble = kb.nextDouble();
      } while(inputDouble<=0);
      houses[i].setBaths(inputDouble);
      
      kb.nextLine(); //address fix, java bug when changing variable type
      
      Boolean b1 = false; Boolean b2 = false; Boolean addressCorrect = false; String address = "";
      
      while(addressCorrect!=true){
        System.out.println("Enter an address, it must contain numbers and letters");
        address = kb.nextLine();
        for (int j = 0; j < address.length(); j++){
          if(Character.isDigit(address.charAt(j))){
            b1 = true; 
          }
          else if(Character.isAlphabetic(address.charAt(j))){
            b2 = true;
          }
        }
        if (b1 == true && b2 == true){
          addressCorrect = true;
        }
        else {
          b1 = false;
          b2 = false;
        }
      }
      houses[i].setAddress(address);
    }
    
    System.out.println("That's all the houses. . . going to search");
    while (str!="quit"){
      System.out.println("What criteria would you like to search by?");
      System.out.println("1 max cost\n2 min number of bedrooms\n3 min number of bathrooms\nYour selection:");
      input = kb.nextInt();
      int in = 0;
      switch(input)
      {
        case 1:
          System.out.println("What is the maximum cost?:");
          in = kb.nextInt();
          for (int i = 0; i<numHouses; i++){
            if(houses[i].getCost()<=in){
              houses[i].toString();
              System.out.println(houses[i]);
            }
          }
          break;
        case 2:
          System.out.println("What is the minimum # of bedrooms?");
          in = kb.nextInt();
          for (int i = 0; i<numHouses; i++){
            if(houses[i].getBedrooms()>=in){
              houses[i].toString();
              System.out.println(houses[i]);
            }
          }
          break;
        case 3:
          System.out.println("What is the minimum # of bathrooms?");
          inputDouble = kb.nextDouble();
          for (int i = 0; i<numHouses; i++){
            if(houses[i].getBaths()>=in){
              houses[i].toString();
              System.out.println(houses[i]);
            }
          }
          break;
      }
      kb.nextLine();
      System.out.println("Enter \"quit\" to quit or anything else to try other searches");
      str = kb.nextLine();
      if (str.equalsIgnoreCase("quit")){
        System.exit(0);
      }
      
    }
    kb.close();
  }
  
  
  /* ADD YOUR CODE HERE */
  
}
