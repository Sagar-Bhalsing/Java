// Write a program to test this keyword with instance class variable
package executor;
public class ThisWithVariable {
	int rollno;
	String name;
	
	ThisWithVariable(int rollno, String name){
		this.rollno=rollno;//this keyword refers to the current object in a method or constructor
		this.name=name;	
	}
	void showOutput() {//Method for displaying
		System.out.println("My rollno is "+rollno+" & my name is " +name);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ThisWithVariable t=new ThisWithVariable(24,"Sagar");//Object creation
       t.showOutput();
	}
}
