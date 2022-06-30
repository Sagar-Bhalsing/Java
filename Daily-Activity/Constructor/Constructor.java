//Program for Constructor
package executor;
import java.util.Scanner;//Importing Scanner class

public class Constructor {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);//Creating Scanner class object
	System.out.print("Enter Name:");
	String name= sc.nextLine();
	System.out.print("Enter Roll number:");
	int rollno= sc.nextInt();
	Constructor c=new Constructor(rollno,name);//Creating object of Constructor class
	}
	int roll;
	String name;
	Constructor(int r, String n){//Constructor 
		roll=r;
		name=n;
		System.out.println("The name of student is" +" "+n);
		System.out.println("The Rollon of student is" +" "+r);
		
	}
}
