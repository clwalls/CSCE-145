/**
 * Written by Christopher Walls. 
 */
public class Concert {
  private String name;
  private int capacity; 
  private int numberOfTicketsSoldByPhone; 
  private int numberOfTicketsSoldAtVenue; 
  private double priceByPhone; 
  private double priceAtVenue;
  
  public Concert() { 
    this.name = "No name yet";
    this.numberOfTicketsSoldByPhone = 0;
    this.numberOfTicketsSoldAtVenue = 0;
    this.priceByPhone = 0.0;
    this.priceAtVenue = 0.0;
  }
  public Concert(String name, int capacity, double priceByPhone, double priceAtVenue) {
    this.name = name;
    this.capacity = capacity;
    this.priceByPhone = priceByPhone;
    this.priceAtVenue = priceAtVenue;
  }
  
  public String getName() {
    return name;
  }
  public int getCapacity () {
    return capacity;
  }
  public int getNumberOfTicketsSoldByPhone () {
    return numberOfTicketsSoldByPhone;
  }
  public int getNumberOfTicketsSoldAtVenue () {
    return numberOfTicketsSoldAtVenue;
  }
  public double getPriceByPhone () {
    return priceByPhone;
  }
  public double getPriceAtVenue () {
    return priceAtVenue;
  }
  
  public void setName(String band) {
    name = band;
  }
  public void setCapacity (int cap) {
    capacity = cap;
  } 
  public void setNumberOfTicketsByPhone (int numPhone) {
    numberOfTicketsSoldByPhone = numPhone;
  }
  public void setNumVenue (int numVenue) {
    numberOfTicketsSoldAtVenue = numVenue;
  }
  public void setPriceByPhone (double pP) {
    priceByPhone = pP;
  }
  public void setPriceAtVenue (double pV) {
    priceAtVenue = pV;
  }
  
  
  
  public int TotalNumberOfTicketsSold() {
    return numberOfTicketsSoldByPhone + numberOfTicketsSoldAtVenue;
  }
  public int TicketsRemaining() {
    return (capacity - TotalNumberOfTicketsSold());
  }
  public void BuyTicketsAtVenue (int v) {
    if(numberOfTicketsSoldByPhone + numberOfTicketsSoldAtVenue + v <= capacity) {
      numberOfTicketsSoldAtVenue += v;
    }
    else {
      System.out.println("The concert is sold out!");
    }
  }
  public void BuyTicketsByPhone (int p) {
    if(numberOfTicketsSoldByPhone + numberOfTicketsSoldAtVenue + p <= capacity) {
      numberOfTicketsSoldByPhone += p;
    }
    else {
      System.out.println("The concert is sold out!");
    }
  }
  public double TotalSales () {
    return ((getNumberOfTicketsSoldByPhone() * priceByPhone) + (getNumberOfTicketsSoldAtVenue()* priceAtVenue));
  }
  
  
  
  
}
