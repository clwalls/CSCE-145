/**
 * Auto Generated Java Class.
 */
public class Leopard extends Cat{
  private int numberOfSpots;
  public Leopard() { 
    super();
    numberOfSpots = 0;
  }
  public Leopard(String name, double weight, String mood, int spots) { 
    super(name, weight, mood);
    numberOfSpots = spots;
  }
  
  public void setNumberOfSpots(int spots){
    numberOfSpots = spots;
  }
  
  public int getNumberOfSpots(){
    return numberOfSpots;
  }
  
  public String toString(){
    return super.toString() + " Number of Spots: " + numberOfSpots;
  }
 public Boolean equals(Leopard leopardCheck){
    return leopardCheck != null && this.getName().equals(leopardCheck.getName()) && this.getWeight()==leopardCheck.getWeight() && this.getMood().equalsIgnoreCase(leopardCheck.getMood()) && this.numberOfSpots==getNumberOfSpots();
  }
}
