
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s=new Student(1,2,"male",550);
		
		
		System.out.println("id " +s.id +" section "+s.section +" gender "+ s.gender);
		System.out.println("fees " +Student.getFee());
		s.pass(-1,500);
		System.out.println("marks "+s.marks);

	}

}
