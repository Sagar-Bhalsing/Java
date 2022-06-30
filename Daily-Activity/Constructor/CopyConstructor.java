//Program for Copy Constructor 
package executor;
public class CopyConstructor {
	int rollno;
	String name;
	CopyConstructor(int r, String n){//Parameterized Constructor with 2 arguments
		 rollno=r;
		 name=n;
	 }
	 CopyConstructor(CopyConstructor c){//Copy Constructor to copy the 1st Constructor
		 rollno=c.rollno;
		 name=c.name;
	 }
	 CopyConstructor(){//Default Constructor
	 }
	 void disp() {//Display method 
		 System.out.println("This is my name "+name+" and rollno "+rollno);
	 } 
	public static void main(String args[]) {
		//Copying object values with Copy Constructor
		CopyConstructor c=new CopyConstructor(24,"Sagar");//Creating object of Constructor
		CopyConstructor c1=new CopyConstructor(c);//Creating object of copy constructor
		c.disp(); 
		c1.disp();
		//Copying object values without Copy Constructor,but by copying values of objects manually
		//What was happening in the CopyConstructor above is just taken out and performed outside the Constructor
		CopyConstructor a=new CopyConstructor(25,"Vishal");//Creating object of Constructor
		CopyConstructor a1=new CopyConstructor();//Creating object of copy constructor
		a1.rollno=a.rollno;         //Copying values of object a to a1
		a1.name=a.name;             //Copying values of object a to a1
		a.disp();
		a1.disp();
		}
}
