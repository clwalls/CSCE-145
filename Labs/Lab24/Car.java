package lab24;
//Written by Chris, Javon, Sara
public class Car extends Vehicle {
	private double mileage;
	private int passengers;
	//retV = new Car(manuName,cylinders,ownersName,mileage,passengers);
	public Car() {
		super();
		mileage = 0.0;
		passengers = 0;
	}
	public Car(String manuName, int cylinders, String ownersName, double m, int p) {
		super(manuName, cylinders, ownersName);
		mileage = m;
		passengers = p;
	}
	
	public void setMileage(double m) {
		if (m>0.0) {
			mileage = m;
		}
	}
	public void setPassengers(int p) {
		if (p>0) {
			passengers = p;
		}
	}
	
	public double getMileage() {
		return mileage;
	}
	public int getPassengers() {
		return passengers;
	}
	public boolean equals(Object carCheck1) {
		if(carCheck1 instanceof Car) {
			Car carCheck = (Car) carCheck1;
		  return carCheck != null && this.getManuName().equals(carCheck.getManuName()) && this.getCylinders()==(carCheck.getCylinders()) && this.getOwnersName().equals(carCheck.getOwnersName()) && this.mileage==(getMileage()) && this.passengers==(getPassengers());
	  }
		else
			return false;
	}
	
	public String toString() {
		return super.toString()+"\nGas Mileage: " + mileage +"\nNumber of Passengers: " + passengers;
	}
	
	

}
