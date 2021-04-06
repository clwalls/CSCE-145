/*
 * Written by Christopher Walls.
 */

import java.util.Random;

public class RPSComputerPlayer extends RPSPlayer {
  
  private Random rand;
  
  public RPSComputerPlayer(){
    super();
    rand = new Random();
  }
  
  public void chooseGesture(){
    switch (rand.nextInt(3)){
      case 0:
        super.setGesture("rock");
        break;
      case 1:
        super.setGesture("paper");
        break;
      case 2:
        super.setGesture("scissors");
        break;
    }
    
  }
  
  
}
