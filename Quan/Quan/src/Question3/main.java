package Question3;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		rectangle rect1 = new rectangle(10,20);
		triangle tri1 = new triangle(10,20);
		circle cir1 = new circle(49);
		
		System.out.println("Rectangle Area = "+ rect1.CalculateSurface());
		System.out.println("Triangle Area = "+ tri1.CalculateSurface());
		System.out.println("Circle Area = "+ cir1.CalculateSurface());

		

	}

}
