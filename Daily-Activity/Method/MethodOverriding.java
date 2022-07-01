//Program for Method Overriding
//When child class and parent class declare same method the method is called Method overriding
//Method overriding in java is example of run time polymorphism
package executor;

class parent{
	void show() {//This method is override in child class 
		System.out.println("Parent class executed...");
	}
}
class child extends parent{
	void show() {//override method from parent class
	System.out.println("Child class excuted...");
}
	}
public class MethodOverriding {

	public static void main(String[] args) {
		child c=new child();//Object of child class
		c.show();
	}

}
