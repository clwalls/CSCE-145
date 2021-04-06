import java.util.Scanner;
/**
 * Written by Christopher Walls.
 */
public class ManyLoops {
  

  
  //G.T.O.E = greater than or equal to argument, >=
  //use a while loop or a do-while
  public static int smallestPowerOf2GTOE(int num) {
    int power2;
    power2=1;
    while(power2<num){
    power2=power2*2;
    }
    return power2;
  }
  
  //L.T.O.E = less than or equal to argument, <=
  //use a for loop
  //update step can use specialized assignment
  //may assume num > 2
  public static int greatestPowerOf2LTOE(int num) {
    int rnum=1;
    for(; num>=rnum;rnum*=2);
    
    return rnum/2;
  }
  
  
  // this method performs integer division (a/b)
  // you may assume a and b are both positive
  // use a loop to do it "manually"
  // this will return the quotient
  // DIY = do it yourself
  // you may assume b>0
  public static int  DIYDivide(int a, int b){
    int ans=0;
    while(b<=a){
      a-=b;//a= a-b;
      ans++;
    }
    return ans;
  }
  
  /* this method performs the same thing as indexOf()
  * for String s, looking for char c
  * use a loop to do it "manually"
  * this returns -1 if c not in s
  * DIY = do it yourself
  * you can use charAt()
  * you can return at anypoint in your code (espcially in an if..)
  * you can return at multiple points too
  */
  public static int DIYindexOf(String s, char c){
    int index=0;
    index=s.indexOf(c);
    return index;
  }
  
  //returns the first n letters of alphabet, altoether as a String
  //you may assume n is >
  public static  String firstNAlphabet(int n){
    String alphabet ="abcdefghijklmnopqrstuvwxyz";
    String out ="";
    out = alphabet.substring(0,n);
    return out;
  }
  
  //go until SUCCESSIVE repeats or nothing entered
  public static void goUntilRepeatsOrNothing(){
    Scanner kb = new Scanner(System.in);
    int a =0;
    int b =1;
    while (a!=b)
    {
      System.out.println("Enter a Number that you like");
      a = kb.nextInt();
      b = kb.nextInt();
    }
      if (a==b){
        System.out.println("Good");
      }
    //void functions don't return anything (you can use "return;", but don't have to)
  }
  
  //Don't need to fill anything out here
  public static void main(String[] args) { 
    System.out.println("Press \"Test\" to run JUnit tests");
    
    System.out.println("TEST goUntilRepeatsOrNothing() at command line for NOTHING, i.e. \"\"");
    goUntilRepeatsOrNothing();
    
    System.out.println("TEST goUntilRepeatsOrNothing() at command line for REPEATS");
    goUntilRepeatsOrNothing();
    
  }
  

  
}
