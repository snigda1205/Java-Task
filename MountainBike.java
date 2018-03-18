
public class MountainBike extends Bicycle
{
   int chainRing;

public MountainBike(float speed, float pedalCadence, float gearValue,int chainRing) {
	super(speed,pedalCadence,gearValue);
	this.chainRing = chainRing;
}

public void getDetails()
{
	super.getDetails();
	System.out.println("Chain Ring " +chainRing);
}
   
}
