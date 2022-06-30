//Program for Default & Parameterized Constructors
package executor;
public class ConstructType {
	int r;
	String name;

	public static void main(String args[]) {
		ConstructType c1=new ConstructType();//Object of Default Constructor
		c1.display();
		ConstructType c2=new ConstructType(24);//Object of Parameterized Constructor
		c2.display();
		ConstructType c3=new ConstructType(24,"Sagar");//Object of Parameterized Constructor
		c3.display();
		
	}
	
	void display() {//Method to display
		System.out.println("My name is "+ name +"and my rollno is"+r);
	}
	//Constructor Overloading Example
	
	ConstructType(){//Default Constructor
		
	}
	ConstructType(int r){// Parameterized Constructor with 1 parameter
	  this.r=r;
	}
	
	ConstructType(int r,String name){// Parameterized Constructor with 2 parameter
		  this.r=r;
		  this.name=name;
		}
	}
