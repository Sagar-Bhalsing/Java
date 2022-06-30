//Program to test Single Inheritance
package executor;

class Parent{//Parent class
	 void show() {//Parent class method
		 System.out.println("Parent class executed.....");
	 }
}

class child extends Parent{//Child class creation
	void disp(){//Child class method
		System.out.println("Child class executed.....");
	}
}
public class SingleInheritance {
	public static void main(String[] args)
	{
	child c=new child();//Object of child class
	//Here we can create parent class but we can only access method of parent class but not the method of child class
	c.show();//Parent class method
	c.disp();//child class method
	}
}
