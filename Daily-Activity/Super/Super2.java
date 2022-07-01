//Program for Accessing the Method of parent class if the method is override in child class
package executor;
class Parent1{

	public Parent1() {//Constructor of parent class
		super();//Here by default we have super keyword
		System.out.println("Parent class executed...");
	}
	
}
class Child1 extends Parent1{

	public Child1() {//Constructor of child class
		super();
		System.out.println("Child class excuted...");
		
	}
	
}
public class Super2 {

	public static void main(String[] args){
		Child1 c=new Child1();//Object of child class
	}
}
