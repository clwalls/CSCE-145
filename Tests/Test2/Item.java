/**
 * Written by Christopher Walls.
 */
public class Item {
  private String name;
  private int quantity;
  private double cost;
  Salmon salmon = new Salmon();
  Napkins napkin = new Napkins();
  Comb comb = new Comb();
  
  public Item() { 
    name = "Name not set yet!";
    quantity = 0;
    cost = 0.0;
  }
  public Item(String n, int q, double c) {
    name = n;
    quantity = q;
    cost = c;
  }
  //ACCESSORS
  public String getName(){
    return name;
  }
  public int getQuantity(){
    return quantity;
  }
  public double getCost(){
    return cost;
  }
  //MUTATORS
  public void setName(String n){
    name = n;
  }
  public void setQuantity(int q){
    quantity = q;
  }
  public void setCost(Double c){

    cost = c;
  }
  //METHODS 
  public double getTotalCost(){
    return cost*quantity;
  }
  public String toString(){
    return quantity + " "+ name + " @" +cost+" berries each";
  }
  
  
  /* ADD YOUR CODE HERE */
  
}
