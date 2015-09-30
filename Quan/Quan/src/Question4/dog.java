package Question4;

public class dog extends animal{

	public dog(String dogName, String dogSex, int dogAge)
	{
		super(dogName, dogSex, dogAge);
	}
	
	public String speaks()
	{
		return "bark";
	}
}
