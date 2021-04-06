/**
 * Written by Christopher Walls.
 */
public class Apple 
{
  //attributes
  private String flavor;
  private double weight;
  private double price;
  //creating a default
  public Apple()
  {
    flavor = "Gala";
    weight = 0.5;
    price = 0.89;
  }
  public void setFlavors(String flavor)
  {
    if(flavor.equals("Red Delicious") || flavor.equals("Golden Delicious") || flavor.equals("Gala") || flavor.equals("Granny Smith"))
    {
      this.flavor = flavor;
    }
    else
    {
      System.out.println("Invalid Name");
    }
  }
  public String getFlavors()
  {
    return this.flavor;
  }
  
  public void setWeight(double weight)
  {
    if(weight > 0.0 && weight < 2.0)
    {
      this.weight = weight;
    }
    else
    {
      System.out.println("Invalid Weight");
    }
  }
  public Double getWeight()
  {
    return this.weight;
  }
  
  public void setPrice(double price)
  {
    if (price > 0)
    {
      this.price = price;
    }
    else
    {
      System.out.println("Invalid Price");
    }
  }
  public Double getPrice()
  {
    return this.price;
  }
  public String toString()
  {
    return "Name: " + this.flavor + " Weight: " + this.weight + ", Price: " + this.price;
  }
  public Boolean equals(Apple app)
  {
    return app != null && this.flavor.equals(app.getFlavors()) && this.weight==(app.getWeight()) && this.price==(app.getPrice());
    
  }
}

