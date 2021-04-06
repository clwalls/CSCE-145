//Written by Christopher Walls
import java.util.Scanner;
import java.util.Random;

public class MineWalker {
  
  public static void main(String[] args) { 
    Scanner kb = new Scanner(System.in);
    
    int dX = 0; int dY = 0;
    int posX = 0; int posY = 0;
    String ans = "";
    
    System.out.println("Welcome to Mine Walker. Get the ice cream cone and avoid the mines.");
    
    //DECLARES BOARD SIZE
    int rows = 10; int columns = 10;
    int[][] board = new int[rows][columns];
    
    /********************************************************************************************
      ***---------------------ENTIRE BOARD INITIALIZATION BEGINS HERE---------------------------***
      ********************************************************************************************/
    Boolean playAgain=true;
    
    while (playAgain=true){
      for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
          board[i][j] = 0;  
        }
      }
      //starting pos X
      board[0][0] = 2;
      //finishing goal ^
      int iceX = new Random().nextInt(board.length);
      int iceY = new Random().nextInt(board.length);
      for(;board[iceX][iceY]!=3;){
        if (board[iceX][iceY] == 0){
          board[iceX][iceY] = 3;
          continue;
        }
        else {
          iceX = new Random().nextInt(board.length);
          iceY = new Random().nextInt(board.length);
        }
      }//end cones
      //mine generation *
      int mineX = new Random().nextInt(board.length);
      int mineY = new Random().nextInt(board.length);
      for(int i = 0; i < 10;){
        if(board[mineX][mineY] == 0){
          board[mineX][mineY] = 1;
          i++;
        }
        else{
          mineX = new Random().nextInt(board.length);
          mineY = new Random().nextInt(board.length);
        }
      }//end mines
      /********************************************************************************************
        ***---------------------ENTIRE BOARD INITIALIZATION ENDS HERE-----------------------------***
        ********************************************************************************************/
      //BOARD PRINT
      Boolean gameplay = true;
      while (gameplay=true){
        for (int i = 0; i < board.length; i++) {
          for (int j = 0; j < board[i].length; j++) {
            //CHANGE * TO _ to hide/see mines
            if (board[i][j] == 1){
              System.out.print("_ ");//1 is active mine, shown by asterik(*)
            }
            if (board[i][j] == 2){
              System.out.print("X ");//user pos is X, value 2 in array board
            }
            if (board[i][j] == 3){
              System.out.print("^ ");//ice cream cone is 3, ^ on board.
            }
            if (board[i][j] == 0){
              System.out.print("_ ");//0 is blank space, shown by underscore
            }
          }//end for loop, claims board ints to be a char
          System.out.println("");
        }//BOARD PRINT 
        /** ***********************************************************************************************
          * *****************************M O V E M E N T     C A S E S ************************************
          * **********************************************************************************************/
        board[posY][posX] = 0;
        System.out.println("Enter either a '-1', '0', or '1' in the X or '9' to quit");
        dX=kb.nextInt();
        if(dX == 9){
          System.out.println("Game Over");
          System.exit(0);}
        System.out.println("Enter either a '-1', '0', or '1' in the Y");
        dY=kb.nextInt();
        if(dX <-1 || dX>1){
          System.out.println("Invalid input X");
          dX = 0;}
        if(dY < -1 || dY >1){
          System.out.println("Invalid input Y");
          dY = 0;}
        /** ******************************* BOUNDRY CHECK ************************************/
        if((posX+dX) < 0) {
          dX = 0;}
        else if(posX>board.length-1){
          posX = board.length-1;}
        if((posY+dY) < 0){
          dY = 0;}
        else if(posY> board.length-1){
          posY = board.length-1;}
        if((posX+dX) > 9) {
          dX = 0;}
        if((posY+dY) > 9) {
          dY = 0;}
        
        /*********************************G A M E  C A S E S *******************************/
        if (board[posY+dY][posX+dX] == 1)
        {
          System.out.println("Boom! Dead!\nWould you like to play again? Enter 'Yes' or 'No'");
          ans = kb.next();
          kb.nextLine();
          if (ans.equalsIgnoreCase("yes")){
            playAgain = true;
            posX=0; posY=0; dX=0; dY=0;
            break;}
          else if (ans.equalsIgnoreCase("no")){
            System.out.println("Goodbye!");
            System.exit(0);
          } else //(ans!="yes" || ans!="no")
          {
            System.out.println("Invalid input! ");}
        }
        
        if (board[posY+dY][posX+dX] == 3)
        {
          System.out.println("Congratulations, you win!\nWould you like to play again? Enter 'Yes' or 'No'");
          ans = kb.next();
          kb.nextLine();
          if (ans.equalsIgnoreCase("yes")){
            playAgain = true;
            posX=0; posY=0; dX=0; dY=0;
            break;
          } if (ans.equalsIgnoreCase("no")){
            System.out.println("Goodbye!");
            System.exit(0);
          } else {
            System.out.println("Invalid input! 2");}
        }
        if (board[posY+dY][posX+dX] == 0){
          board[posY+dY][posX+dX] = 2;
        } 
        posX+=dX;
        posY+=dY;
      }//END GAMEPLAY TRUE
    }
    kb.close();
    //method and class follows, only two 
  } 
}