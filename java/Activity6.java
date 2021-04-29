package activities;

public class Activity6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Plane plane=new Plane(10);
		plane.onboard("Dhara");
		plane.onboard("Surea");
		plane.onboard("Maddy");
		System.out.println("Take off time of the flight is " + plane.takeOff());
		System.out.println("List of Passengers in the flight " + plane.getPassengers());
		
		Thread.sleep(5000);
		
		plane.land();
		System.out.println("Landing time of the flight is " + plane.getLastTimeLanded());
		
		
	}

}
