
public class TandemBike extends Bicycle {
	final static int seats=2;
	final static int handelBars=2;
	
	
	public static int getSeats() {
		return seats;
	}


	public static int getHandelbars() {
		return handelBars;
	}
public TandemBike(float speed, float pedalCadence, float gearValue)
{
	super(speed,pedalCadence,gearValue);
}

	public void getDetails()
	{
		super.getDetails();
		System.out.println("seats and handel bars"+getSeats() +" "+getHandelbars());
	}

}
