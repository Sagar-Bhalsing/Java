//Program to apply static with variable
package executor;

public class StaticWithVariable {
	
	static int a=1;//When used as static variable once it is changed the change remains throughout,due to this memory is saved
	//int a=1;//This is non-static variable in here every time we call the variable new memory location is create
	StaticWithVariable(){
		a++;//Post Incrementing value of a
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticWithVariable s=new  StaticWithVariable();//Object creation
		StaticWithVariable s1=new StaticWithVariable();//Object creation
		StaticWithVariable s2=new StaticWithVariable();//Object creation
				

	}

}
