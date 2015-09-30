package Question2;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//student students = new student();
		//worker workers = new worker();
		
		student[] students = new student[10];
		worker[] workers = new worker[10];
		
		String firstName, lastName;
		int studentGrade;
		double weekSalary, workHoursPerDay;
		
		for(int i = 0; i<10; i++)
		{
			firstName = "student"+i;
			lastName = "lastName"+i;
			studentGrade = 72+i;
			students[i] = new student(firstName, lastName, studentGrade);
		}
		
		for(int j = 0; j<10; j++)
		{
			firstName = "worker"+j;
			lastName = "lastName"+j;
			weekSalary = 7200.0;
			workHoursPerDay = 40.0;
			workers[j] = new worker(firstName, lastName, weekSalary, workHoursPerDay);
		}
		
		//print all
		for(int k = 0; k<10; k++)
		{
			workers[k].ShowWorkerInfo(); //= new worker(firstName, lastName, weekSalary, workHoursPerDay);
		}
		
		for(int k = 0; k<10; k++)
		{
			students[k].showStudentInfo();; //= new worker(firstName, lastName, weekSalary, workHoursPerDay);
		}
		

	}

}
