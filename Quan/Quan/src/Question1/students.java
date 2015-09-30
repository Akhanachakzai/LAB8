package Question1;

public class students extends people{

	private int classNumber;
	public students(String studentName, int classNumber)
	{
		super("Class1",studentName);
	}
	
	public void showStudentInfo()
	{
		showPeopleName();
		System.out.println("\tClass Number: "+ classNumber);
	}
}
