package activities;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double seconds = 1000000000;
		double EarthSeconds = 31557600;
		double MercurySeconds = 0.2408467;
		double VenusSeconds = 0.61519726;
		double MarsSeconds = 1.8808158;
		double JupiterSeconds = 11.862615;
		double SaturnSeconds = 29.447498;
		double UranusSeconds = 84.016846;
		double NeptuneSeconds = 164.79132;
		
		System.out.println("Age on Mercury : " + calcAge(seconds,EarthSeconds,MercurySeconds));
		System.out.println("Age on Venus : " + calcAge(seconds,EarthSeconds,VenusSeconds));
		System.out.println("Age on Earth : " + calcAge(seconds,EarthSeconds,1));
		System.out.println("Age on Mars : " + calcAge(seconds,EarthSeconds,MarsSeconds));
		System.out.println("Age on Jupiter : " + calcAge(seconds,EarthSeconds,JupiterSeconds));
		System.out.println("Age on Saturn : " + calcAge(seconds,EarthSeconds,SaturnSeconds));
		System.out.println("Age on Uranus : " + calcAge(seconds,EarthSeconds,UranusSeconds));
		System.out.println("Age on Neptune : " + calcAge(seconds,EarthSeconds,NeptuneSeconds));
	}
		
		public static double calcAge(double seconds,double EarthSeconds,double PlanetSeconds)
		{
			double calcAge=seconds/EarthSeconds/PlanetSeconds;
			return calcAge;
			
		}

	}


