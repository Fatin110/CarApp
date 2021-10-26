package carApp;

public class CarPerformance {
	int cc,  maxTorque, cylinderNumber, tankCapacity; 
	double maxSpeed,mileage;
	String engineType, tire, transmissionMode;
	
	public CarPerformance(int cc, int maxTorque, double maxSpeed, String engineType, String tire, 
			double mileage, int cylinderNumber, int tankCapacity, String transmissionMode) {
		
		this.cc = cc;
		this.maxTorque = maxTorque;
		this.maxSpeed = maxSpeed;
		this.engineType = engineType;
		this.tire = tire;
		this.mileage = mileage;
		this.cylinderNumber = cylinderNumber;
		this.tankCapacity = tankCapacity;
		this.transmissionMode = transmissionMode;
				
	}
}
