//Program to pass this as argument of method
package executor;

public class ThisAsArgumentInMethod {

	void disp(ThisAsArgumentInMethod t) {//Object of class passed as argument in this method
		System.out.println("This is object");
	}
	void show() {
		//this as argument of the method 
		//this maps the method where the object is given 
		disp(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisAsArgumentInMethod t=new ThisAsArgumentInMethod();//Object creation
		t.show();

	}

}
