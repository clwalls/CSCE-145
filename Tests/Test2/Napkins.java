/**
 * Written by Christopher Walls.
 */
public class Napkins extends Item{
  final private double price = 20.0;
  
  public Napkins() { 
    super();
  }
  public Napkins(String name, int quantity, double cost){
    super(name, quantity, cost);
  }
  
  public double getPrice(){
    return price;
}
  
}
