package Question1;

public class disciplines extends teachers{
	
	private String di_name;
	private int di_numLec, di_numEx;
	
	public disciplines(String name, int numOfLecs, int numOfExs)
	{
		super("Teacher 1");
		di_name = name;
		di_numLec = numOfLecs;
		di_numEx = numOfExs;
		
	}
	
	public void showDisciplineInfo()
	{
		System.out.println(di_name+" info:"+"Num of Lectures: "+di_numLec+"\tNum of Exercises"+di_numEx);
	}

}
