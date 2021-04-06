/**
 * Auto Generated Java Class.
 */
public class HouseCat extends Cat {
  private String type;
  public HouseCat() { 
    super();
    type = "Type not set yet!";
  }
  public HouseCat(String name, double weight, String mood, String t) { 
    super(name, weight, mood);
    type = t;
  }
  
  public void setType(String t){
    if(t.equalsIgnoreCase("short hair") || t.equalsIgnoreCase("bombay") || t.equalsIgnoreCase("ragdoll") || t.equalsIgnoreCase("sphinx") || t.equalsIgnoreCase("scottish fold")){  
    type = t;
    }
    else{
      System.out.println("Invalid type!"); //make sure to add DO WHILE loop in AnimalFrontEnd to make sure user enter's value type for blank entry isn't created.
    }
  }
  
  public String getType(){
    return type;
  }
  
  public String toString(){
    return super.toString() + " Type " + type;
  }
  public Boolean equals(HouseCat houseCatCheck){
    return houseCatCheck != null && this.getName().equals(houseCatCheck.getName()) && this.getWeight()==houseCatCheck.getWeight() && this.getMood().equalsIgnoreCase(houseCatCheck.getMood()) && this.type.equalsIgnoreCase(getType());
  }
  
  
  /* ADD YOUR CODE HERE */
  
}
