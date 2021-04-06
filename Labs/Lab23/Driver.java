import java.util.*;
/**
 * Written by Christopher Walls.
 */
public class Driver {
  
  
  public static void main(String[] args) { 
    Card c1 = new Card("(T/F) A dog is a feline", "False");
    Card c2 = new Card("(T/F) Birds can be flightless","True");
    Card c3 = new Card("(T/F) Cabbage is considered an animal","False");
    Set s1 = new Set(c1,c2,c3);
    Set r1 = s1.randomize(s1);
    Card c4 = new Card("(T/F) I have a huge neck","True");
    Card c5 = new Card("(T/F) My ego expanse across the nation","True");
    Card c6 = new Card("(T/F) I like to be alone in my room thinking about the fact that I ahve no idea what i am doing","False");
    Set s2 = new Set(c4,c5,c6);
    Set r2 = s2.randomize(s2);
    
    Scanner kb = new Scanner (System.in);
    int input = 0;
    while (input!=3){  
      if (input==1){
        for (int i=0;i<3;i++){
          System.out.println(r1.getSet()[i].getquestion());
          kb.next();
          System.out.println(r1.getSet()[i].getanswer());
        }
      }
      if (input==2){
        for (int i=0;i<3;i++){
          System.out.println(r2.getSet()[i].getquestion());
          kb.next();
          System.out.println(r2.getSet()[i].getanswer());
        }
      }
    System.out.println("Please pick an option");
    System.out.println("1 Animal Questions");
    System.out.println("2 Personal Questions");
    System.out.println("3 Quit");
    input=kb.nextInt();
    }
    
    
  }
  
}

