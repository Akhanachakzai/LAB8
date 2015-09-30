package Question4;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		animal[] animals = new animal[5];
		
		animals[0] = new frog("frog1","male",2);
		animals[1] = new dog("dog","male",2);
		animals[2] = new kitten("kitten",1);
		animals[3] = new tomcat("tomcat",2);
		animals[4] = new frog("frog2","male",2);
		
		for(int i = 0; i <animals.length;i++)
		{
			System.out.println(animals[i].animalName + " " +animals[i].animalAge+" "+animals[i].animalSex+" "+animals[i].speaks());
			;
			
		}
	}

}
