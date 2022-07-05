//Program to implement Abstraction
package executor;

abstract class TestAbstract//Abstract class 
{
	abstract public void disp();//Here we have created abstract method but have not declared anything in it
	void show() {//Method
		System.out.println("Implementing Abstraction..");
	}
}
class Childclass extends TestAbstract{//Child class of abstract class
	
		public void disp()//The undeclared method of abstract is been declared in this child class
		{
			System.out.println("Override method ");
		}
	
}
public class Abstraction {
	public static void main(String[] args)
	{
		Childclass c=new Childclass();//Object creation
		c.disp();//This method is abstract method of abstract class which has been declared in child class
		c.show();//This method is inherited by child class from abstract class
	}
}
