package Qone;

public class Person {
public String Firstname;
public String Lastname;
public String Email;
public int Day,mon,year;
public String Birthday;

Person(String First,String Last,String mail,int day,int month,int y ){
	Firstname = First ;
	Lastname = Last ;
	Email = mail ;
	Day =day;
	mon = month;
	year = y;
	Birthday = " "+Day +" "+mon+" "+year;
}
Person(String First,String Last,String mail){
	Firstname = First ;
	Lastname = Last ;
	Email = mail ;
	
}
Person(String First,String Last,int d,int m,int y){
	Firstname = First ;
	Lastname = Last ;
	Day =d;
	mon = m;
	year = y;
	Birthday = Day +"  " +mon+"  "+year;
	Email = "\t";
}
public void showid(){
	System.out.printf("%s\t%s\t%s\t%s\n",Firstname,Lastname,Email,Birthday);
}
public void showbirthday(){
	if(Day==1 &&mon == 10){
		System.out.println("Happy birthday");
	}
	else{
		System.out.println("todays not your birthday");
	}}
	public void adult(){
		System.out.println((2015- year)>18 ? "Adult": "child");
	}
}

