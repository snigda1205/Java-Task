
public class TestBicycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		MountainBike mb = new MountainBike(30, 100, 25,10);
		mb.getDetails();
		RoadBike rd=new RoadBike(11,23,45,3);
		rd.getDetails();
		TandemBike tb=new TandemBike(15,20,35);
		tb.getDetails();
		
	}

}
