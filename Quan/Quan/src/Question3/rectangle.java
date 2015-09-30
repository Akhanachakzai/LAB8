package Question3;

public class rectangle extends shape{
	
	public rectangle(int height,int width)
	{
		super(height,width);
	}
	
	public double CalculateSurface()
	{
		return height*width;
	}

}
