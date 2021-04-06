import java.util.*;
/**
 * Written by Christopher Walls.
 */
public class Set {
  private Card[] cardset;
  
  public Set (){
    cardset = new Card[3];
  }
  public Set(Card c1, Card c2, Card c3){
    cardset = new Card[3];
    cardset[0] = c1;
    cardset[1] = c2;
    cardset[2] = c3;
}
  public Card[] getSet(){
    return cardset;
  }
  
  public Set randomize(Set s){
    int index, j;
    Random random = new Random();
    for (int i = s.getSet().length-1; i>0; i--){
      j = random.nextInt(i);
      Card temp = s.getSet()[i];
      s.getSet()[i] = s.getSet()[j];
      s.getSet()[j] = temp;
    }
    return s;
  }
  
}