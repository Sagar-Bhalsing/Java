//Program to implement Abstraction using Interface
package executor;
interface Myinterface{
	void disp();
	void show();
}
class My implements Myinterface{
	public void disp(){
		System.out.println("Methof defined....");	
		}
   public void show() {
	System.out.println("Method defined....");
}
}
public class Interface {
	public static void main(String[] args) {
		Myinterface m=new My();
		m.disp();
		m.show();
	}
}
