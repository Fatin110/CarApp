package carApp;

public class CheetahF21 implements Features {

	double price; 
	String color;
	Measurements measurements;
	DigitalFeatures digitals;
	CarPerformance performance;
	
	CheetahF21(double price, String color){
		this.price = price;
		this.color = color;
		System.out.println("\n2.The CheetahF21\n-------------------");
		System.out.println("Available colors: "+color);
		System.out.println("priced @ $"+price);
	}

	@Override
	public void measurements(Measurements measurements) {
		this.measurements = measurements;
		
	}

	@Override
	public void digitalFeatures(DigitalFeatures digitals) {
		this.digitals = digitals;
		
	}

	@Override
	public void carPerformance(CarPerformance performance) {
		this.performance = performance;
		
	}
	
	void displayF21() {
		System.out.println("~ Measurements of CheetahF21:");
		System.out.println("1.Height - "+measurements.height+" feet"+"\n2.Width - "+measurements.width+" feet"+"\n3.Weight - "+measurements.weight+" lbs."+"\n4.Ground Clearance - "+measurements.groundClearance+" inches");
		
		System.out.println("\n~ Digital Features of CheetahF21:");
		System.out.println("1.Seat - "+digitals.seat+"\n2.Roof Type - "+digitals.roofType+"\n3.Back Camera - "+digitals.backCamera+"\n4.Navigation - "+digitals.navigation+"\n5.Bluetooth Compatibility - "+digitals.bluetooth+"\n6.Remote Start - "+digitals.remoteStart+"\n7.Push Quick Start - "+digitals.pushStart+"\n8.TV Monitor - "+digitals.monitor+"\n9.Voice Control Activation - "+digitals.voiceControl+"\n10.Auto Parking System - "+digitals.autoParking);
		
		System.out.println("\n~ Performance of CheetahF21:");
		System.out.println("1.Engine Type - "+performance.engineType+"\n2.Transmission Mode - "+performance.transmissionMode+"\n3.Tire Type - "+performance.tire+"\n4.Engine Capacity - "+performance.cc+"\n5.Number of Cylinders - "+performance.cylinderNumber+"\n6.Maximum Speed - "+performance.maxSpeed+" KM/H"+"\n7.Maximum Torque - "+performance.maxTorque+" @1700RPM"+"\n8.Fuel Tank Capacity - "+performance.tankCapacity+" Liters"+"\n9.Mileage - "+performance.mileage+"KM/L");
		
	}

}