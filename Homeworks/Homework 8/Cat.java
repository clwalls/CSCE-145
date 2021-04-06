/**
 * Auto Generated Java Class.
 */
public class Cat extends Animal {
  private String mood;
  public Cat() { 
    super();
    mood = "Mood not set yet!";
  }
  public Cat(String name, double weight, String m) { 
    super(name, weight);
    mood = m;
  }
  
  public void setMood(String m){
    if(m.equalsIgnoreCase("sleepy") || m.equalsIgnoreCase("playful") || m.equalsIgnoreCase("hungry")){
    mood = m;
    }
    else
      System.out.println("Invalid mood!");
  }
  
  public String getMood(){
    return mood;
  }
  
  public String toString(){
    return super.toString() + " Mood: " + mood;
  }
  public Boolean equals(Cat catCheck){
    return catCheck != null && this.getName().equals(catCheck.getName()) && this.getWeight()==catCheck.getWeight() && this.mood.equalsIgnoreCase(mood);
  }
  
  /* ADD YOUR CODE HERE */
  
}
