/**
 * Auto Generated Java Class.
 */
import java.util.*;
public class FlashcardDriver {
  
  
  public static void main(String[] args) { 
    Scanner kb = new Scanner(System.in);
    int input = 0;
    String q,a;
    
    Flashcards[] flashcards = new Flashcards[6];
    CardSet cards = new CardSet(3);
    
    System.out.println("Please pick an option:");
    System.out.println("1 Class and Method questions\n2 Football questions\n3 Quit");
    input = kb.nextInt();
    switch(input)
    {
      case 1:
        for(int i = 0; i<3; i++){
        Flashcard flashcard = cards.getCard(i);
        System.out.println(cards.getQuestion());
        System.out.println(cards.getAnswer());
      }
        break;
      case 2:
        break;
      case 3:
        System.out.println("Thank you for using FlashCard Deluxe!");
        kb.nextLine();
        System.exit(0);
    }
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
