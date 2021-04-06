package lab24;
//Written by Chris, Javon, Sara
public class Truck extends Vehicle {
	private double loadCap;
	private double towCap;
//retV = new Car(manuName,cylinders,ownersName,mileage,passengers);
	public Truck() {
		super();
		loadCap = 0.0;
		towCap = 0.0;
	}
	public Truck(String manuName, int cylinders, String ownersName, double lC, double tC) {
		super(manuName, cylinders, ownersName);
		loadCap = lC;
		towCap = tC;
	}
	
	public void setLoadCap(Double lC) {
		if (lC>0.0)
		loadCap = lC;
	}
	public void setTowCap(Double tC) {
		if (tC>0.0)
		towCap = tC;
	}
	
	public double getLoadCap() {
		return loadCap;
	}
	public double getTowCap() {
		return towCap;
	}
	
	public boolean equals(Object truckCheck1) {
		if(truckCheck1 instanceof Truck) {
			Truck truckCheck = (Truck) truckCheck1;
		  return truckCheck != null && this.getManuName().equals(truckCheck.getManuName()) && this.getCylinders()==(truckCheck.getCylinders()) && this.getOwnersName().equals(truckCheck.getOwnersName()) && this.loadCap==(getLoadCap()) && this.towCap==(getTowCap());
	  }
		else
			return false;
	}
	
	public String toString() {
		return super.toString()+"\nTowing Capacity: " +towCap+"\nLoad Capacity: " +loadCap;
	}
	

}
