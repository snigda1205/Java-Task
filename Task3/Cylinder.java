
public class Cylinder  implements Rectangle,Circle {
	double areac;
	double circum;
	double areaCy;
	double aCyl;
	public Cylinder()
	{
		
	}
	public Cylinder(double areac, double circum, double areaCy,double aCyl) {
		super();
		this.areac = areac;
		this.circum = circum;
		this.areaCy = areaCy;
		this.aCyl=aCyl;
	}
	
	public void areaCircle(int radius)
	{
		
		
		this.areac=2*Math.PI*(radius*radius);
	}
	public void areaCircle(double radius)
	{
		
		
		this.areac=2*Math.PI*(radius*radius);
	}
	public void circumCircle(int raduis)
	{
		circum=2*Math.PI*raduis;
	}
	public void AreaRec(int h,double circum )
	{
		areaCy=h*circum;
	}
	
}