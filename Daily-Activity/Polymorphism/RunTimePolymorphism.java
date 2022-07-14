//Program to implement Run Time Polymorphism
package executor;
class parent{
	void show() {//This method is override in child class 
		System.out.println("Parent class executed...");
	}
}
class child extends parent{
	//same method as parent class but different output 
	void show() {//override method from parent class
	System.out.println("Child class excuted...");
}
}
public class RunTimePolymorphism {
	
	public static void main(String[] args){
		 child c=new child();//Object creation
		 parent p=new parent();//Object creation
		 p.show();//method
		 c.show();//method
	 }
}
