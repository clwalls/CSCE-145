/**
 * Written by Christopher Walls.
 */
import java.util.Scanner;
public class TooMuchTime {
  
  public static void main(String[] args) {  
  
  Scanner keyboard = new Scanner(System.in);
  System.out.println("Enter a time in the following format: 'hr:mm:ss'" 
                      + " and I will give you the time in seconds.");
  String time = keyboard.next();
  
  String hoursEntry   = time.substring(0,2);
  int hours= (Integer.parseInt(hoursEntry));
  
  String minutesEntry = time.substring(3,5);
  int minutes=(Integer.parseInt(minutesEntry));
  
  String secondsEntry = time.substring(6,8);
  int initialSeconds =(Integer.parseInt(secondsEntry)); 
  
  int seconds;
  seconds = hours*3600+minutes*60+initialSeconds;
  System.out.println("The number of seconds are " + seconds);
  System.out.println("Enter a number of seconds to add:");
  int secondsAdd = keyboard.nextInt();
  int secondsFinal = secondsAdd+seconds;

  int hoursFinal = secondsFinal/3600;
  int minutesFinal = secondsFinal%3600;
  minutesFinal = minutesFinal/60;
  secondsFinal = secondsFinal%60;
  System.out.println("The new time is "+ hoursFinal+":"+ minutesFinal+":"+secondsFinal);
  
  keyboard.close();
  }  
    
  }
  
  /* ADD YOUR CODE HERE */
  

 