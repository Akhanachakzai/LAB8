package Question2;

public class student extends human{

	private int studentGrade;
	
	public student(String firstName, String lastName, int grade)
	{
		super(firstName,lastName);
		studentGrade = grade;
	}
	
	public void showStudentInfo()
	{
		System.out.println(this.FirstName() + " " + this.LastName() + " " + studentGrade);
	}
}
