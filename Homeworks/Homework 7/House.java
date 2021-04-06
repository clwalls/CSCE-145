/**
 * Auto Generated Java Class.
 */
public class House {
  private String address;
  private int cost;
  private double baths;
  private int bedrooms;
  
  public House() { 
    this.address = "";
    this.cost = 0;
    this.baths = 0.0;
    this.bedrooms = 0;
  }
  /*
  public House(String aAddress, int aCost, double aNumberOfBaths, int aNumberOfRooms){
    this.address = aAddress;
    this.cost = aCost;
    this.baths = aNumberOfBaths;
    this.bedrooms = aNumberOfRooms;
  } */
  //ACCESSORS
  public String getAddress() {
    return address;
  }
  public int getCost() {
    return cost;
  }
  public double getBaths() {
    return baths;
  }
  public int getBedrooms() {
    return bedrooms;
  }
  //MUTATORS
  public void setAddress(String a){
  //NEED TO ADD IF TO CHECK IF ADDRESS CONTAINS ATLEAST 1 NUMBER AND 1 LETTER
    address = a;
  }
  public void setCost(int c){
    cost = c;
  }
  public void setBaths(double bath){
    baths = bath;
  }
  public void setBedrooms(int bed){
    bedrooms = bed;
  }
  //METHODS
  public String toString(){
    return ("-------------------------------------------------")+"\nHouse @ "+getAddress()+"\nCost="+getCost()+"\n#BR="+getBedrooms()+"\n#bath="+getBaths()+"\n-------------------------------------------------";
  }
  
  /* ADD YOUR CODE HERE */
  
}
