package Question3;

public class circle extends shape{

	public circle(int radius)
	{
		super(radius);
	}
	
	public double CalculateSurface()
	{
		
		return 2*22*radius/7;
	}
}
