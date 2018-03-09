
public class Student {
	
int id;
int section;
String gender;
int marks;
final static int fee=500;
public static int getFee()
{
	return fee;
}

public Student()
{
	
}

public Student(int id, int section, String gender, int marks) {
	super();
	this.id = id;
	this.section = section;
	this.gender = gender;
	this.marks = marks;
}
public void pass(int marks)
{
	if(marks>10)
	{
		System.out.println("passed");
	}
	else
	{
		System.out.println("fail");
	}
}
public void pass(int subtotal,int total)
{
	if(subtotal>0)
	{
		this.marks=this.marks+total;
	}
	else
	{
		System.out.println("error");
	}
		
}
}
