package lab24;
//Written by Chris, Javon, Sara
public class Vehicle {

	  private String manuName;
	  private int cylinders;
	  private String ownersName;
	  
	  public Vehicle() { 
	    manuName = "Manufacturer's name not set!";
	    cylinders = 0;
	    ownersName = "Owner's name not set!";
	  }
	  public Vehicle(String m, int cy, String owner) { 
		  manuName = m;
		  cylinders = cy;
		  ownersName = owner;
	  }
	  //MUTATORS
	  public void setManuName(String m) {
		  manuName = m;
	  }
	  public void setCylinders(int c) {
		  if (c>0) {
		  cylinders = c;
		  }
	  }
	  public void setOwnersName(String owner) {
		  ownersName = owner;
	  }
	  //ACCESSORS
	  public String getManuName() {
		  return manuName;
	  }
	  public int getCylinders() {
		  return cylinders;
	  }
	  public String getOwnersName() {
		  return ownersName;
	  }
	  //METHODS
	  public boolean equals(Object vehicleCheck1) {
		  if(vehicleCheck1 instanceof Vehicle) {
			  Vehicle vehicleCheck = (Vehicle) vehicleCheck1;
		  return vehicleCheck != null && this.manuName.equals(getManuName()) && this.cylinders==(getCylinders()) && this.ownersName.equals(getOwnersName());
	  }
		  else
			  return false;
	  }
	  public String toString() {
		  return "Manufacturer's Name: " + manuName +"\nNumber of Cylinders: " + cylinders + "\nOwner's Name: " + ownersName;
	  }

}
