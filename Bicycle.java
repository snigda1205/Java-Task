
public class Bicycle {
	float speed;
	float pedalCadence;
	float gearValue;
	
	public Bicycle()
	{
		
	}

	public Bicycle(float speed, float pedalCadence, float gearValue) {
		
		this.speed = speed;
		this.pedalCadence = pedalCadence;
		this.gearValue = gearValue;
	}
	
	public void getDetails()
	{
		System.out.println("speed , pedal cadence, gear value " +speed+ " " +pedalCadence +" " +gearValue);
		
	}

}
