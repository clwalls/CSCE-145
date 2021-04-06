/**
 * Wirrten by Christopher Walls.
 */
import java.util.Scanner;
public class ExtraCredit00 {
  
  
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    String ans="";
    int input=0;
    int loopCounter=1;
    int multiple=0;
    
    System.out.println("This program outputs the first 10 multiples of a number");
    while (!"no".equals(ans)){//Struggled on string comparison to not equal in while loop.
      if (loopCounter>=10){
        System.out.println("Would you like to continue? (\"yes\" or \"no\"):");
        ans=kb.nextLine();
        if (ans.equalsIgnoreCase("yes")){
          loopCounter=1;
          //continue;
      }
            else if (ans.equalsIgnoreCase("no")){
              break;
            }
                     else{
                       System.out.println("Invalid input! Program ending.");
                       break;
                     }
      }
    System.out.println("What number would you like the first 10 multiples of?:");
    ans=kb.nextLine();
    System.out.println("The first 10 multiples of "+ans+" are:");
      while (loopCounter<=10)
      {
        input=Integer.parseInt(ans);
        multiple=input*loopCounter;
        System.out.println(input+"*"+loopCounter+"="+multiple);
        ++loopCounter;
      }
    }
  }
}

