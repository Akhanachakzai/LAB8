package G3;

public class employee extends person implements payabe {
	private int salary;
	private String Address;
	public int i,j,k;
	public employee(int Salary,String address){
	super ("employee");
	salary = Salary;
	Address = address;
}
	
	@Override
	public void Retrieve(int x) {
		// TODO Auto-generated method stub
		System.out.println("The retrieved amount :" +( salary-x));
	}
	@Override
	public void Add(int y) {
		// TODO Auto-generated method stub
		System.out.println("The added amount :"+ salary + y);
	}
	@Override
	public void paymentadd() {
		// TODO Auto-generated method stub
		System.out.println("The address is :"+ Address);
	}
}
