// Program Accessing Data Member Of ParentClass
package executor;
class Parent{//Parent class
	int a=10;
}
class Child extends Parent{//Child class
	int a=100;
	void show() {//Method
		System.out.println("Value of data member of child class: "+a);//Calling data member of child class i.e "a=100"
		System.out.println("Here we can access data member of parent class using super keyword: "+super.a);//Calling data member of parent class using super keyword to call it i.e "a=10"
	}
}
public class Super {
	public static void main(String[] args){
		Child c=new Child();//Object of child class
		c.show();
	}
}
