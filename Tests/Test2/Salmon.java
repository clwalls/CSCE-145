/**
 * Written by Christopher Walls.
 */
public class Salmon extends Item{
  final private double price = 50.0;
  
  public Salmon() { 
    super();
  }
  public Salmon(String name, int quantity, double cost){
    super(name, quantity, cost);
  }
  
  public double getPrice(){
    return price;
  }
  
}
