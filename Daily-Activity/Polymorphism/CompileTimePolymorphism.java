//Program to implement Compile time Polymorphism
package executor;
public class CompileTimePolymorphism {
	
	void show(int a) {//Method with 1 argument
		System.out.println("The value of a : "+a);
	}
	//Here in this method we come to know the difference in both method during making objects of this class and then calling them with these methods
	//Method call for both methods is same but passing the number of arguments differs.
	void show(int a,int b) {//Same method name but different number of arguments passed
		System.out.println("The value of a is : "+a+" the value of b is: "+b);
	}
	 public static void main(String[] args){
		 CompileTimePolymorphism c=new CompileTimePolymorphism();//Object creation
		 c.show(2);//Method with 1 argument
		 c.show(2,4);//Method with 2 arguments
	 }

}
