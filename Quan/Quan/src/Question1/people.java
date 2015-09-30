package Question1;

public class people extends classes{

	private String peopleName;
	
	
	public people(String className, String name)
	{
		super(className);
		peopleName = name;
	}
	
	public void showPeopleName()
	{
		System.out.println(peopleName);
		
	}
}
