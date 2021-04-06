/*
 * Written by Christopher Walls.
 */

public class RPSPlayer implements RPSPlayerInterface {
  
  private String gesture;
  private int points;
  
  public RPSPlayer(){
    gesture = "none";
    points = 0;
  }
  
  //ACCESSORS
  public int getPoints(){
    return points;
  }
  public String getGesture(){
    return gesture;
  }
  
  //MUTATORS
  public void setPoints(int aPoints){
    points = aPoints;
  }
  public void setGesture(String aGesture){
    if(aGesture.equalsIgnoreCase("rock") || (aGesture.equalsIgnoreCase("paper")) || (aGesture.equalsIgnoreCase("scissors"))){
      gesture = aGesture;
    }
    else {
      gesture = "none";
    System.out.println("Incorrect choice");
    }
  }
  
  //METHODS
  public void chooseGesture(){
    setGesture("none");
  }
  
}
