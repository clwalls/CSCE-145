/**
 * Auto Generated Java Class.
 */
public class DomesticDog extends Dog {
  private String type;
  
  public DomesticDog() {
    super();
    type = "Type not set yet";
  }
  public DomesticDog(String name, double weight, int energyLevel, String t) { 
    super(name, weight, energyLevel);
    type = t;
    /* YOUR CONSTRUCTOR CODE HERE*/
  }
  public void setType(String t){
    if(t.equalsIgnoreCase("retriever") || t.equalsIgnoreCase("terrier") || t.equalsIgnoreCase("husky") || t.equalsIgnoreCase("yappy") || t.equalsIgnoreCase("mutt")){  
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
  public Boolean equals(DomesticDog domesticDogCheck){
    return domesticDogCheck != null && this.getName().equals(domesticDogCheck.getName()) && this.getWeight()==domesticDogCheck.getWeight() && this.getEnergyLevel()==domesticDogCheck.getEnergyLevel() && this.type.equalsIgnoreCase(getType());
  }
  /* ADD YOUR CODE HERE */
  
}
