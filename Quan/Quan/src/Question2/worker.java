package Question2;

public class worker extends human{
	
	private double weekSalary, workHoursPerDay;
	
	public worker(String firstName, String lastName, double weekSlry, double wrkHrsPerDay)
	{
		super(firstName, lastName);
		weekSalary = weekSlry;
		workHoursPerDay = wrkHrsPerDay;
	}
	
	public void ShowWorkerInfo()
	{
		System.out.println(this.FirstName()+ " " +this.LastName()+ " " +weekSalary+ " " +workHoursPerDay);
		
	}
	
	public double MoneyPerHour()
	{
		return (weekSalary/workHoursPerDay);
	}

}
