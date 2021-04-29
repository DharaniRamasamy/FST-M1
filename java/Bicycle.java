package activities;

public class Bicycle implements BicycleParts,BicycleOperations{
	int gears;
	int currentSpeed;
Bicycle(int gears,int currentspeed)
{
	this.gears=gears;
	this.currentSpeed=currentspeed;
		
}
public void applyBrake(int decrement)
{
	currentSpeed=currentSpeed-decrement;
	System.out.println("Current speed of Bicycle after brake is " + currentSpeed);
}
public void speedUp(int increment)
{
	currentSpeed=currentSpeed+increment;
	System.out.println("Current speed of Bicycle after speedup is " + currentSpeed);
	
}
public String bicycleDesc() {
    return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed);
}

}
