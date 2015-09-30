package Question4;

public class cat extends animal{
	
	public cat(String catName, String catSex, int catAge)
	{
		super(catName, catSex, catAge);
	}

	public String speaks()
	{
		return "Meow";
	}
}
