/**
 * Written by Christopher Walls.
 */
public class Card {
  
  private String question;
  private String answers;
  
  public Card (String a, String q){
    question = q;
    answers = a;
  }
  
  public Card(){
    question = "";
    answers = "";
  }
  public void setquestion(String q){
    question = q;
  }
  public void setanswer(String a){
    answers = a;
  }
  public String getquestion(){
    return question;
  }
  public String getanswer(){
    return answers;
  }
}
