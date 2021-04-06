/**
 * Written by Christopher Walls, Jerry Eubanks,  
 */
import java.util.Scanner;
public class BooleanQuizTest {
  
  
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in); 
    System.out.println("Welcome to the boolean logic quiz program! \nEnter answer or \"quit\" to quit.");
    Boolean operand1 = true;
    Boolean operand2 = true;
    Boolean answer = null;//Actual answer
    String response = "";//User's answer
    int questionNum = 0;
    double right = 0.0;
    double wrong = 0.0;
    
    while(!response.equalsIgnoreCase("quit")) {
      
      operand1 = (Math.random()>0.5) ? true:false;//Assigns operand1 to be true or false, randomly each loop.
      operand2 = (Math.random()>0.5) ? true:false;//Assigns operand2 to be true or false, randomly each loop.
    
      questionNum = (int)(Math.random()*6);//Chooses a random number from 0 to 5
    if (questionNum == 0) {
      answer = operand1 && operand2;
      System.out.println(operand1 +" && " + operand2 + "== ");
      response = kb.next();
    }
    else if (questionNum == 1) {
      answer = operand1 & operand2;
      System.out.println(operand1 +" & " + operand2 + "== ");
      response = kb.next();
    }
    else if (questionNum == 2) {
      answer = operand1 | operand2;
      System.out.println(operand1 +" | " + operand2 + "== ");
      response = kb.next();
    }
    else if (questionNum == 3) {
      answer = operand1 || operand2;
      System.out.println(operand1 +" || " + operand2 + "== ");
      response = kb.next();
    }
    else if (questionNum == 4) {
      answer = !operand1;
      System.out.println("!"+operand1 + "== ");
      response = kb.next();
    }
    else if (questionNum == 5) {
      answer = operand1 ^ operand2;
      System.out.println(operand1 +" ^ " + operand2 + "== ");
      response = kb.next();
    }
    if (Boolean.parseBoolean(response)==answer) {
      System.out.println("Correct, Good job.");
      right +=1;
    }
     if (response.equalsIgnoreCase("quit")) {
        break;//Program ends when user enters any variation of "quit", and does not print following line.
    }
    else if (Boolean.parseBoolean(response)!=answer){
        System.out.println("Drat, Wrong answer.");
        wrong +=1;
    }
    System.out.println("Your average so far is " + (right/(wrong+right)*100) +"%");
    }
    kb.close();
  }
  
  /* ADD YOUR CODE HERE */
  
}