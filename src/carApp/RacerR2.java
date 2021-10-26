package carApp;

public class RacerR2 implements Features {

	double price; 
	String color1, color2, color3, color4;
	Measurements measurements;
	DigitalFeatures digitals;
	CarPerformance performance;
	
	RacerR2(double price, String color1, String color2, String color3, String color4){
		this.price = price;
		this.color1 = color1;
		this.color2 = color2;
		this.color3 = color3;
		this.color4 = color4;
		System.out.println("\n5.The RacerR2\n-------------------");
		System.out.println("Available colors: "+color1+", "+color2+", "+color3+", "+color4);
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
	
	void displayR2() {
		System.out.println("~ Measurements of RacerR2:");
		System.out.println("1.Height - "+measurements.height+" feet"+"\n2.Width - "+measurements.width+" feet"+"\n3.Weight - "+measurements.weight+" lbs."+"\n4.Ground Clearance - "+measurements.groundClearance+" inches");
		
		System.out.println("\n~ Digital Features of RacerR2:");
		System.out.println("1.Seat - "+digitals.seat+"\n2.Roof Type - "+digitals.roofType+"\n3.Back Camera - "+digitals.backCamera+"\n4.Navigation - "+digitals.navigation+"\n5.Bluetooth Compatibility - "+digitals.bluetooth+"\n6.Remote Start - "+digitals.remoteStart+"\n7.Push Quick Start - "+digitals.pushStart+"\n8.TV Monitor - "+digitals.monitor+"\n9.Voice Control Activation - "+digitals.voiceControl+"\n10.Auto Parking System - "+digitals.autoParking);
		
		System.out.println("\n~ Performance of RacerR2:");
		System.out.println("1.Engine Type - "+performance.engineType+"\n2.Transmission Mode - "+performance.transmissionMode+"\n3.Tire Type - "+performance.tire+"\n4.Engine Capacity - "+performance.cc+"\n5.Number of Cylinders - "+performance.cylinderNumber+"\n6.Maximum Speed - "+performance.maxSpeed+" KM/H"+"\n7.Maximum Torque - "+performance.maxTorque+" @1700RPM"+"\n8.Fuel Tank Capacity - "+performance.tankCapacity+" Liters"+"\n9.Mileage - "+performance.mileage+"KM/L");
		
	}
}
