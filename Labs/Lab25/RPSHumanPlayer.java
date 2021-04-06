/*
 * Written by Christopher Walls.
 */

import java.util.Scanner;

public class RPSHumanPlayer extends RPSPlayer{
  
  private Scanner keyboard;
  
  public RPSHumanPlayer(){
    super();
    keyboard = new Scanner(System.in);
  }
  
  public void chooseGesture(){
    super.setGesture(keyboard.nextLine());
  }
}
