//Define class Employee with instance variable empname,salary and inherit two child classes for the parent class Employee where hike as data member of child class,implement Hierarchical inheritnace and claculate the hike of employee where the percentage for permanat employee is 0.5 and and for tempoary employee is 0.3
package executor;
import java.util.Scanner;//Importing scanner methods
class Employee{
    static String ename;
	static double Salary;
	void input() {//Method for input
		Scanner s=new Scanner(System.in);//Object of scanner class
		System.out.println("Enter your name:");
		ename=s.nextLine();
		System.out.println("Enter your Salary ");
		Salary=s.nextInt();
		
	}
}
class PermanentEmployee extends Employee{
	double hike=0.5;
	void dispPerm() {
		System.out.println("The hike in the salary for permanent employee "+ename+" is: "+(Salary*hike));
	}
}
class TempEmployee extends Employee{
	double hike=0.3;
	void disptemp() {
		System.out.println("The hike in the salary for temporary employee "+ename+" is: "+(Salary*hike));
	}
}
public class EmployeeHike {
	public static void main(String[] args) {
		int type;
		Scanner s=new Scanner(System.in);
		Employee e=new Employee();
		PermanentEmployee p=new PermanentEmployee();
		TempEmployee t=new TempEmployee();
		e.input();
		System.out.println("Employee type (Permanent-1/Temporary-2):");
		type=s.nextInt();
		
		if (type==1) {
			p.dispPerm();
		}
		else if(type==2) {
			t.disptemp();
		}
		else {
			System.out.println("Enter correct input");
		}
		
	}
}
