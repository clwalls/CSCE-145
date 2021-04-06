/**
 * Written by Christopher Walls.
 */
public class Clothing {
  /**
   * has toString which returns type and color of garment of the section user chooses. 
   */
  String type;//Undergarment, socks, stockings, top, bottom, and cape
  String color;//Brown, red, pink, orange, green, blue, purple, and grey
  
  public Clothing ()
  {
    this.type = "";
    this.color = "";
  }
  public String toString() { 
    String str ="";
    str = this.type +" "+this.color;
    return str;
  }
  public Boolean equals(Clothing piece)
  {
    return piece != null && type.equals(piece.getType()) && color.equals(piece.getColor());
    
  }
  public void setType(String type)
  {
    if ((type.equals("undergarment") || type.equals("socks") || type.equals("stockings") || type.equals("top") || type.equals("bottom") || type.equals("cape")))
    {
      this.type = type;
    }
    else
    {
      System.out.println("Invalid Type");
    }
  }
  public String getType()
  {
    return this.type;
  }
  
  public void setColor(String color)
  {
    if ((color.equals("brown") || color.equals("red") || color.equals("pink") || color.equals("orange") || color.equals("green") || color.equals("blue") || color.equals("purple") || color.equals("grey")))
    {
      this.color = color;
    }
    else
    {
      System.out.println("Invalid Color");
    }
  }
  public String getColor()
  {
    return this.color;
  }
  
} 
