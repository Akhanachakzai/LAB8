package Question4;

public abstract class animal {

	protected int animalAge;
	protected String animalName, animalSex;
	
	public animal(String name, String sex, int age)
	{
		animalName = name;
		animalAge = age;
		animalSex = sex;
	}
	
	public abstract String speaks();
	
}
