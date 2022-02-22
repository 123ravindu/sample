
public class Conversion {
	
	 double distance;
	 double weight;
	 double temperature;
	
	public double KMToMiles(double distance) {
		return distance*1.6;
		
	}
	public double MilesToKM(double distance) {
		return distance/1.6;
		
		
	}
	public double FeetToMetres(double distance) {
		return distance*0.30;

	}
	public double MetresToFeet(double distance) {
		return distance/0.30;

	}
	public double KgToPounds(double weight) {
		return weight*2.2;

	}
	public double PoundsToKg(double weight) {
		return weight/2.2;

	}
	public double CelciusToFahrenheit(double temperature) {
		return temperature*1.8 + 32;

	}
	public double FahrenheightToCelcius(double temperature) {
		return temperature*5/9-17.78;

	}

}
