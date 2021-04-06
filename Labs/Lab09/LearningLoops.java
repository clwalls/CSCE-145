/**
 * Written by Christopher Walls and Spencer Hoibak.
 */
import java.util.Scanner;
public class LearningLoops {

  public static void main(String[] args) { 
  Scanner kb = new Scanner(System.in);
  String ans = "";
  int num = 0;
  while(!ans.equals("quit")) {
    if (num==0) {
      System.out.println("===================================");
      System.out.println("(4) facts about if statements");
      System.out.println("===================================");
      ans = kb.nextLine();
      System.out.println("ifs: " + "\n> have 1 \"if\" part, 0-many \"else if\"s, and possibly an \"else\"");
      System.out.println("> ifs are branching statements");
      System.out.println("> do their tests in a top to bottom order");
      System.out.println("> only one test or else will \"pass\"");
    }
    else if (num==1) {
      System.out.println("===================================");
      System.out.println("true && false ==");
      System.out.println("===================================");
      ans = kb.nextLine();
      System.out.println("false");
    }
    else if (num==2) {
      System.out.println("===================================");
      System.out.println("false && false ==");
      System.out.println("===================================");
      ans = kb.nextLine();
      System.out.println("false");
    }
    else if (num==3) {
      System.out.println("===================================");
      System.out.println("true && true ==");
      System.out.println("===================================");
      ans = kb.nextLine();
      System.out.println("true");
    }
    else if (num==4) {
      System.out.println("===================================");
      System.out.println("false && true ==");
      System.out.println("===================================");
      ans = kb.nextLine();
      System.out.println("false");
    }
    else if (num==5) {
      System.out.println("===================================");
      System.out.println("false || true ==");
      System.out.println("===================================");
      ans = kb.nextLine();
      System.out.println("true");
    }
    else if (num==6) {
      System.out.println("===================================");
      System.out.println("Math.sqrt(a^2) =");
      System.out.println("===================================");
      ans = kb.nextLine();
      System.out.println("a");
    }
    else if (num==7) {
      System.out.println("===================================");
      System.out.println("An error in a program is called a Bug");
      System.out.println("Eliminating errors is called debugging");
      System.out.println("Three kinds of errors:");
      System.out.println("===================================");
      ans = kb.nextLine();
      System.out.println("Syntax Errors"+"\nRuntime Errors" +"\nLogic Errors");
    }
    else if (num==8) {
      System.out.println("===================================");
      System.out.println("nextLine()");
      System.out.println("===================================");
      ans = kb.nextLine();
      System.out.println("Reads the rest of the current keyboard input line and returns the characters" 
                           +"\nread as a value of type. String. Note that the line terminator \\n is read"
                           +"\nand discarded; it is not included in the string returned.");
    }
    else if (num==9) {
      System.out.println("===================================");
      System.out.println("next()");
      System.out.println("===================================");
      ans = kb.nextLine();
      System.out.println("Returns the String value consisting of the next keyboard characters up to, but not including,"                      
                         +"\nthe first delimter character. The default delimiters are whitespace characters.");
    }
    else if (num==10) {
      System.out.println("===================================");
      System.out.println("What is the purpose of a compiler?");
      System.out.println("===================================");
      ans = kb.nextLine();
      System.out.println("A compiler translates a program from a high level language to a low-level language.");
    }
    else if (num==11) {
      System.out.println("===================================");
      System.out.println("Course Information:");
      System.out.println("===================================");
      ans = kb.nextLine();
      System.out.println("Name: James O'relly"+"\nOffice: 3d19(innovation 2221 after move)"
                        + "\nSyllabus on website: http://cse.sc.edu/~oreillyj/"
                        + "\nSumbit work to dropbox dropbox.cse.sc.edu");
    }
    //YOUR if logic here
  
    System.out.print("[Enter] to continue or \"quit\" to quit");
    ans = kb.nextLine(); //get last input value
    ++num;//idomatic way to increment a counter
    num%=12;//num never gets to 12, change to match number questions
    }    
  }
  
  /* ADD YOUR CODE HERE */
  
}
