import java.util.Scanner;

public class Menu {
	
		
	
	    void displayMainMenu() {
		
		System.out.println("1. Conversions");
		System.out.println("2. Calculations:");
		System.out.println("3. Exit:");
	
	
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter your option:");
		int option = ob.nextInt();
		if(option==1) {
			displayConversionSubMenu();
		}else if(option==2) {
			displayCalculationSubMenu();
		}else {
			
		}	
		
	}
	void displayConversionSubMenu() {
		
		System.out.println("1. Weight:");
		System.out.println("2. Length:");
		System.out.println("3. temparachare:");
		System.out.println("4. Exit:");
		
		
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter your option:");
		int option = ob.nextInt();
		if(option==1) {
			displayConversionWeightSubmenu();
		}else if(option==2) {
			displayConversionLengthSubmenu();
		}else if(option==3) {
			displayConversionTemperatureSubmenu();	
		}else {
			
		}
		
	}
	void displayCalculationSubMenu() {
		System.out.println("1.Sum of Series");
		System.out.println("2.Sum of Array");
		System.out.println("3.Product of Series");
		System.out.println("4.Product of Array");
		System.out.println("5.Exit");
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter your option:");
		int option = ob.nextInt();
		if(option==1) {
			
			Scanner hb = new Scanner(System.in);
			System.out.println("Enter start number:");
			int start = hb.nextInt();
			System.out.println("Enter end number:");
			int end = hb.nextInt();
			System.out.println("Enter inc number:");
			int inc = hb.nextInt();
		}else if(option==2) {
			
		}
			
		else if(option==3) {
			
		}else {
			
		}
	}
	void displayConversionLengthSubmenu() {
		System.out.println("1. KMToMiles");
		System.out.println("2. MilesToKM:");
		
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter your option:");
		int option = ob.nextInt();
		
		if(option==1) {
			Scanner ab = new Scanner(System.in);
			System.out.println("Enter your distance:");
			double distance = ab.nextDouble();
			Menu kd = new Menu();
			System.out.println(kd.KMToMiles(distance));
			
		}else if(option==2) {
			Scanner ab = new Scanner(System.in);
			System.out.println("Enter your distance:");
			double distance = ab.nextDouble();
			Menu kd = new Menu();
			System.out.println();
		}else {
			
		}
		
	}
	void displayConversionWeightSubmenu() {
		System.out.println("1. KgToPounds");
		System.out.println("2. poundsTokg");
		
		
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter your option:");
		int option = ob.nextInt();
		if(option==1) {
			Scanner ab = new Scanner(System.in);
			System.out.println("Enter your weight:");
			double weight = ab.nextDouble();
			Menu kd = new Menu();
			System.out.println(kd.MilesToKM());
			
		}else if(option==2) {
			Scanner ab = new Scanner(System.in);
			System.out.println("Enter your weight:");
			double weight = ab.nextDouble();
			Menu kd = new Menu();
			System.out.println(kd.MilesToKM());
			
		}else {
			
		}
		
	}
	void displayConversionTemperatureSubmenu() {
		System.out.println("1. CelciusToFahrenheit");
		System.out.println("2. FahrenheightToCelcius");
		
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter your option:");
		int option = ob.nextInt();
		if(option==1) {
			Scanner ab = new Scanner(System.in);
			System.out.println("Enter your temperature:");
			double temperature = ab.nextDouble();
			Menu kd = new Menu();
			System.out.println();
		}else if(option==2) {
			Scanner ab = new Scanner(System.in);
			System.out.println("Enter your temperature:");
			double temperature = ab.nextDouble();
			Menu kd = new Menu();
			System.out.println(kd.MilesToKM());
		}else {
			
		}
		
	}
	}	


	
