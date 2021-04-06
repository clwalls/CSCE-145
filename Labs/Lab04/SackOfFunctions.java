/**
 * Java Class to demostrate a variety of functions (in practice there is too much variety -- we would define
 * these in separate classes.) 
 * Sack of Functions was edited by Christopher Walls.
 */
public class SackOfFunctions {
  
  //this is an example in the code, don't change
  public static double twice(double a){
    return a+a;
  }
  
  //calculate the square of a number
  //e.g. 4 is the square of 2 (2*2=4)
  //e.g 100 is the square of 10 (10*10=100)
  public static double square(double a){
   return a*a;
  }
  
  //calculate the BMI given the weight in points and height in inches
  // from http://www.thecalculatorsite.com/articles/health/bmi-formula-for-bmi-calculations.php
  public static double calcBMI(double weight, double height){
    return weight * 703 / height / height;
  }
  
  //calculate the volume of an ideal gas given:
  // P -- pressure in atmospheres
  // n -- number of moles of gas
  // T -- temperature in Kelvin
  // R = 0.082057 L atm / (mol*K)
  // returns V -- volume in liters
  // Ideal Gas Law:
  //     PV = nRT 
  // (you'll need to do a single algebraic manipulation to use this equation)
  //"ideal gas" is chemistry term -- this law generally but not always applicable, depending on details
  public static double idealGasVolume(double Patm, double nMoles, double TKelvin){
  double r = 0.082057; //Worried about how you have to declare r, or if you should just write num to do this equation. 
    return nMoles*TKelvin*r / Patm;
  }
  
  public static double hypotenuseLength(double a,double b){
    
    return Math.sqrt(a*a+b*b);
  }
  
  public static void main(String[] args) { 
    System.out.println("Whoops, don't run this program, run the unit tests!");
    System.out.println("Click \"Test Project\" in the toolbar at the top, right beside \"Run\"");
  }
  
  /* ADD YOUR CODE HERE */
  
}
