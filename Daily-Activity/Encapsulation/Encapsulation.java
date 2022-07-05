//Program for Encapsulation
package executor;
class Employee{
	private int eid;//Access specifier is private it means you cannot access this variable outside the class
	private String ename;
	//By using getter setter method we can access private variables
	//Method for getter
	public int getEid() {//This is inbuilt get() method to return the private variable i.e eid
		return eid;
	}
	//Method for setter
	public void setEid(int eid) {//This is inbuilt set method used to assign this.eid to eid the private 
		this.eid = eid;//this is is used to refer to the value of current variable
	}
	public String getEname() {//getter method
		return ename;
	}
	public void setEname(String ename) {//setter method
		this.ename = ename;
	}
	
}
public class Encapsulation {
	public static void main(String[] args)
	{
		Employee e=new Employee();//Object creation
		e.setEid(24);//setting the values
		e.setEname("Sagar");//setting the values
		System.out.println("The id of Employee is "+e.getEid());//get method to return the value
		System.out.println("The name of Employee is "+e.getEname());//get method to return the value
	}
}
