//Program to show interface inheritance
package executor;
interface First{//Interface
	void disp();//Abstract method
}
interface Second extends First{//Interface with inherited properties of 'First' Interface
	void show();//Abstract method
}
class Interfacetest implements Second{//Child class of 'Second' Interface
	public void disp() {//Declaration of abstract method
		System.out.println("First method...");
	}
	public void show() {//Declaration of abstract method
		System.out.println("Second method...");
	}
}
public class Interface2 {
	public static void main(String[] args) {
		Interfacetest i=new Interfacetest();//Object creation
		i.disp();//Method call
		i.show();//Methid call
	}
}
