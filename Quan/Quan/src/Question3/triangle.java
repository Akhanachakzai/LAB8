package Question3;

public class triangle extends shape {
	
	public triangle(int height,int width)
	{
		super(height,width);
	}
	
	public double CalculateSurface()
	{
		return height*width/2;
	}

}
