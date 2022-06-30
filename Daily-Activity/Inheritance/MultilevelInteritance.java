//Program for multileveled Inheritance
package executor;

class Parent1{//Parent class
	 void show() {//Parent class method
		 System.out.println("Parent class executed.....");
	 }
}

class child1 extends Parent{//Child class creation
	void disp(){//Child class method
		System.out.println("Child class executed.....");
	}
}
class grandchild extends child1{//Grandchild class creation
	void out() {
		System.out.println("Grandchild class executed....");
	}
}

public class MultilevelInteritance {
	public static void main(String[] args)
	{
		grandchild g=new grandchild();//Object of grandchild class
		g.show();
		g.disp();
		g.out();
	}

}
