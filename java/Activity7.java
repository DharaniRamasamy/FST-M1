package activities;

public class Activity7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MountainBike mb=new MountainBike(4,40,140);
		System.out.println("Initial description :" + mb.bicycleDesc());
		mb.applyBrake(5);
		mb.speedUp(50);
		mb.setHeight(200);
		mb.bicycleDesc();
		System.out.println("Current description :" + mb.bicycleDesc());

	}

}
