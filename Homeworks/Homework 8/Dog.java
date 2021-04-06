/**
 * Auto Generated Java Class.
 */
public class Dog extends Animal {
  private int energyLevel;
  public Dog() { 
    super();
    energyLevel = 0;
  }
  public Dog(String name, double weight, int e) { 
    super(name, weight);
    energyLevel = e;
  }
  
  public void setEnergyLevel(int e){
    if(e>=0 && e<=100){
    energyLevel = e;
    }
    else
      System.out.println("Energy level is not between 0 and 100!");
  }
  
  public int getEnergyLevel(){
    return energyLevel;
  }
  
  public String toString(){
    return super.toString() + " Energy Level: " + energyLevel;
  }
  public Boolean equals(Dog dogCheck){
    return dogCheck != null && this.getName().equals(dogCheck.getName()) && this.getWeight()==dogCheck.getWeight() && this.energyLevel==getEnergyLevel();
  }
  /* ADD YOUR CODE HERE */
  
}
