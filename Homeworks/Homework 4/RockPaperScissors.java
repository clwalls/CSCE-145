/**
 * Written by Christopher Walls.
 */
import java.util.Scanner;
public class RockPaperScissors 
{ 
  public static void main(String[] args) 
  {
    Scanner kb = new Scanner(System.in);
    //Variable declaration and assignment.
    int rock, paper, scissors, wins, losses, rounds, computerIn, ties;
    rock=0;
    paper=1; 
    scissors=2;
    wins=0; 
    losses=0;
    rounds=0;
    ties=0;
    String ans, userIn;//Strings
    ans = "";
    userIn ="";
    Boolean gameplay = true;
    System.out.println("Welcome to Rock Paper Scissors! Best 2 out of 3!");
    while (gameplay == true)
    {
    while(rounds<3) 
    //Program runs when rounds is less than 3, best of 3 game, but doesn't end when 0-2(based off HW example).
    {
      computerIn = (int)(Math.random()*3);//Chooses a random number from 0 to 2.
      System.out.println("Enter \"Rock\", \"Paper\", \"Scissors\"");
      userIn = kb.nextLine();
      //Logic for when computerInput is rock.
      if (computerIn==rock) 
      {
        if (userIn.equalsIgnoreCase("paper")) 
        {
          System.out.println("Paper v Rock! Player Wins!");
          ++wins;
        }
        else if(userIn.equalsIgnoreCase("rock")) 
        {
          System.out.println("Rock v Rock! Tie!");
          ++ties;
        }
        else if(userIn.equalsIgnoreCase("scissors")) 
        {
          System.out.println("Scissors v Rock! Computer Wins!");
          ++losses;
        }
        else 
        {
          System.out.println("Not a valid input! Computer Wins!");
          ++losses;
        } 
        System.out.println("Player has won "+wins+" and the computer has won " +losses+" times");
      }
      //End of logic when computerInput is rock.
      //Logic for when computerInput is paper.
      if (computerIn==paper)  
      {
        if (userIn.equalsIgnoreCase("paper")) 
        {
          System.out.println("Paper v Paper! Tie!");
          ++ties;
        }
        else if(userIn.equalsIgnoreCase("rock")) 
        {
          System.out.println("Rock v Paper! Computer Wins!");
          ++losses;
        }
        else if(userIn.equalsIgnoreCase("scissors")) 
        {
          System.out.println("Scissors v Paper! Player Wins!");
          wins++;
        }
        else 
        {
          System.out.println("Not a valid input! Computer wins!");
          ++losses;
        }
        System.out.println("Player has won "+wins+" and the computer has won " +losses+" times");
      } 
      //End of logic when computerInput is paper.  
      //Logic for when computerInput is scissors.
      if (computerIn==scissors) {
        if (userIn.equalsIgnoreCase("paper")) {
          System.out.println("Paper v Scissors! Computer Wins!");
          losses++;
        }
        else if(userIn.equalsIgnoreCase("rock")) {
          System.out.println("Rock v Scissors! Players Wins!");
          wins++;
        }
        else if(userIn.equalsIgnoreCase("scissors")) {
          System.out.println("Scissors v Scissors! Tie!");
          ++ties;
        }
        else {
          System.out.println("Not a valid input! Computer wins!");
          ++losses;
        }
      System.out.println("Player has won "+wins+" and the computer has won " +losses+" times");
      }
      //End of logic when computerInput is scissors.
      rounds=ties+wins+losses;//Adds one to the round counter at the end of the logic of all situations.
    }//End of Round>3 loop, when rounds <= 3 (after Bo3 runs).
    if (rounds>=3){
        if (wins>losses){
          System.out.println("The Player Wins!");
          }
        if (losses>wins){
          System.out.println("The Computer Wins!");
          }
        else if (losses==wins){
          System.out.println("Tie!");
        }
        System.out.println("Play again? \"Yes\" or \"No\"");
        ans = kb.nextLine();//When this was kb.next, it wouldn't work. Got stuck for 2.5 hrs.
       
          if (ans.equalsIgnoreCase("Yes")) {
            System.out.println("");
            gameplay =true;
            rounds=0; 
            wins=0;
            ties=0;
            losses=0;
          }
          else {
            gameplay=false;
            System.out.println("Goodbye!");
      }
    }
  }
      
  kb.close();
  }
}
