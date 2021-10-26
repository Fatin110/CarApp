package carApp;

import java.util.Scanner;

public class Main {
		static {
			System.out.println("Welcome to our SpeedLabs app. Here, you can search for your favorite car from our top 5 models of 2021.");
			System.out.println("SpeedLabs top 5 models: ");
			System.out.println("1. LightningM21\n2. CheetahF21\n3. Fast09\n4. Bolt95\n5. RacerR2\n\n");
			System.out.println("Overview of the cars:");
		}
	public static void main(String[] args) {
		LightningM21 m21 = new LightningM21(15.7, "Black", "RedWine", "Yellow");
		CheetahF21 f21 = new CheetahF21(15.2, "Yellow+Black");
		Fast09 f09 = new Fast09(12.5,"Red", "Blue", "Grey Scale");
		Bolt95 b95 = new Bolt95(11, "White", "Shades of Blue");
		RacerR2 r2 = new RacerR2(8, "Sky Blue", "Black+White", "Grey", "Brown");
		
		while(true) {
		Scanner input = new Scanner(System.in);
		System.out.println("\nSearch for your favorite model");
		String userSearch = input.nextLine();
		
		
			if (userSearch.equals("LightningM21")) {
				Measurements m = new Measurements(8.7, 4.2, 5.5, 2243);
				DigitalFeatures df = new DigitalFeatures("Pure Leather","Auto(button)","Full HD","Yes","Yes","Yes","Yes","Sony Brand","Yes","Yes");
				CarPerformance cp = new CarPerformance(2000, 900, 316, "Turbo Engine", "Tubeless (MRF)", 8.9, 4, 30, "Auto");
			
				m21.measurements(m);
				m21.digitalFeatures(df);
				m21.carPerformance(cp);
			
				m21.displayLM21();
			}
			
			else if (userSearch.equals("CheetahF21")) {
				Measurements m = new Measurements(7.9, 4, 5.3, 1637.5);
				DigitalFeatures df = new DigitalFeatures("Leahter","Auto(button)","Full HD","Yes","Yes","No","Yes","5 inch","Yes","No");
				CarPerformance cp = new CarPerformance(1700, 850, 325, "Turbo Engine", "Tubeless (Michelin)", 8.4, 6, 25, "Auto");
				
				f21.measurements(m);
				f21.digitalFeatures(df);
				f21.carPerformance(cp);
				
				f21.displayF21();
			}
			
			else if (userSearch.equals("Fast09")) {
				Measurements m = new Measurements(8, 5, 5.2, 1537.7);
				DigitalFeatures df = new DigitalFeatures("Soft Pad","Auto(button)","Full HD","Yes","Yes","No","Yes","5 inch","No","No");
				CarPerformance cp = new CarPerformance(2200, 950, 327, "Turbo Engine", "Tubeless (Bridestone)", 8, 6, 25, "Auto");
				
				f09.measurements(m);
				f09.digitalFeatures(df);
				f09.carPerformance(cp);
				
				f09.displayF09();
			}
			
			else if (userSearch.equals("Bolt95")) {
				Measurements m = new Measurements(9.4, 5.8, 6.6, 2370.7);
				DigitalFeatures df = new DigitalFeatures("Cushioned Leahter","No","Full HD","Yes","Yes","No","Yes","5.5 inch","Yes","No");
				CarPerformance cp = new CarPerformance(2000, 750, 266, "Turbo Engine", "Tubeless (Goodyear)", 12, 3, 40, "Auto");
				
				b95.measurements(m);
				b95.digitalFeatures(df);
				b95.carPerformance(cp);
				
				b95.displayB95();
			}
			
			else if (userSearch.equals("RacerR2")) {
				Measurements m = new Measurements(9.3, 4.3, 5.2, 1437.7);
				DigitalFeatures df = new DigitalFeatures("Pure Leahter","No","Full HD","No","Yes","No","No","5 inch","Yes","No");
				CarPerformance cp = new CarPerformance(1500, 680, 236, "Turbo Engine", "Tubeless (Cooper)", 12.4, 3, 40, "Auto");
				
				r2.measurements(m);
				r2.digitalFeatures(df);
				r2.carPerformance(cp);
				
				r2.displayR2();
			}
			
			else System.out.println("Sorry, Your search does not match any model!!! Try Again.");
		
		}
	}

}
