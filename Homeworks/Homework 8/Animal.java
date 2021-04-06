/**
 * Auto Generated Java Class.
 */
public class Animal {
  private String name;
  private double weight;
  
  public Animal() { 
    name = "Name not assigned yet!";
    weight = 0.0;
  }
  public Animal(String n, Double w) { 
    name = n;
    weight = w;
  }
  
  public void setName(String n){
    name = n;
  }
  public void setWeight(double w){
    if(w>0.0){
      weight = w;
    }
  }
  
  public String getName(){
    return name;
  }
  public double getWeight(){
    return weight;
  }
  
  public String toString(){
    return "Name: " + name + " Weight: " + weight;
  }
  public Boolean equals(Animal nameWeight){//add super
    return nameWeight != null && this.name.equalsIgnoreCase(name) && this.weight==weight;
  }
  /* ADD YOUR CODE HERE */
  
}
