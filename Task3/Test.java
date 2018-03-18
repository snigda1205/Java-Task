
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Cylinder c=new Cylinder();
          c.areaCircle(2);
          System.out.println("area of circle is  " +c.areac);
          c.circumCircle(2);
          System.out.println("Circumference " +c.circum);
          c.AreaRec(6,c.circum);
          System.out.println("Area of rectangle "+c.areaCy);
          System.out.println("Area of Cylinder "+(c.areac+c.areaCy));
          }
}
