//Program to implement Abstraction using Interface
//Interface is used to Implement 100% Abstraction i.e
//Every method is abstract method 
//Abstract methods are methods with no body
package executor;
interface Myinterface{//Interface 
	void disp();//Abstract method
	void show();//Abstract method
}
class My implements Myinterface{//child class of interface 
	public void disp(){//Abstract method of interface is been declared here
		System.out.println("Methof defined....");	
		}
   public void show() {//Abstract method of interface is been declared here
	System.out.println("Method defined....");
}
}
public class Interface {
	public static void main(String[] args) {
		Myinterface m=new My();//objection creation 
		m.disp();//Method
		m.show();//Method
	}
}
