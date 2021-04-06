/**
 * Written by Christopher Walls.
 */
public class Comb extends Item {
  final private double price = 100.0;
   
  public Comb() { 
    super();
  }
  public Comb(String name, int quantity, double cost) { 
    super(name, quantity, cost);
  }
  
  public double getPrice(){
    return price;
}

}
