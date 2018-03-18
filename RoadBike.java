
public class RoadBike extends Bicycle {

	int handelBars;

	
	public RoadBike(float speed, float pedalCadence, float gearValue,int handelBars) {
		super(speed, pedalCadence, gearValue);
		this.handelBars = handelBars;
	}


	public void getDetails()
	{
		super.getDetails();
		System.out.println("handel bars " +handelBars);
	}
	
}
