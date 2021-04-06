/**
 * Auto Generated Java Class.
 */
public class Wolf extends Dog{
  private String packLeaderName;
  
  public Wolf() {
    super();
    packLeaderName = "Pack leader name not set yet";
  }
  public Wolf(String name, double weight, int energyLevel, String plN) { 
    super(name, weight, energyLevel);
    packLeaderName = plN;
    /* YOUR CONSTRUCTOR CODE HERE*/
  }
  
  public void setPackLeaderName(String name){
    packLeaderName = name;
  }
  
  public String getPackLeaderName(){
    return packLeaderName;
  }
  
  public String toString(){
    return super.toString() + " Pack Leader Name: " + packLeaderName;
  }
  public Boolean equals(Wolf packLeaderCheck){
    return packLeaderCheck != null && this.getName().equals(packLeaderCheck.getName()) && this.getWeight()==packLeaderCheck.getWeight() && this.getEnergyLevel()==packLeaderCheck.getEnergyLevel() && this.packLeaderName.equalsIgnoreCase(getPackLeaderName());
  }
  /* ADD YOUR CODE HERE */
  
}
