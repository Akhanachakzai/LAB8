package Question1;

public class classes extends school{
	
	private String className;
	public classes(String name)
	{
		super("SZABIST");
		className = name;
		
	}
	
	public void showClassName()
	{
		System.out.println(className);
	}

}
