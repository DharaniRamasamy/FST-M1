package activities;

public class MountainBike extends Bicycle {
	int seatHeight;
	public MountainBike(int gears,int currentSpeed,int seatHeight){
		
		super(gears,currentSpeed);
		this.seatHeight=seatHeight;
		
			
	}
	
	public void setHeight(int newValue) {
	    seatHeight = newValue;
	}
	
	public String bicycleDesc() {
	    //return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed + "\n Seat Height is " + seatHeight);
	    return (super.bicycleDesc()+"\nSeat Height is " + seatHeight);
	} 

}
