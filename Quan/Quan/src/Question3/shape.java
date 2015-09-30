package Question3;

public abstract class shape {

	protected int height, width, radius;
	
	public shape(int h, int w)
	{
		height = h;
		width = w;
	}
	
	public shape(int r)
	{
		radius = r;
	}

	public abstract double CalculateSurface();
}
