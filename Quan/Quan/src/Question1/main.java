package Question1;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		disciplines dis1 = new disciplines("Math",3,5);
		students stu1 = new students("Stu 1", 101);
		
		System.out.println("Student Info");
		stu1.showStudentInfo();
		//System.out.println(stu1.className);
		
		dis1.showDisciplineInfo();

	}

}
