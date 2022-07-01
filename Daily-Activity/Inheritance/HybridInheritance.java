//Program for Hybrid Inheritance
package executor;
class College1{//Parent class
	void showname() {
		System.out.println("College name is COEP");
	}
}
class Student extends College1 {//Child class of College1 (Single Inheritance)
	void showname() {
		System.out.println("College name is COEP and the name of student is Sagar");
	}
}
class Teacher extends College1{//Child class of College1 (Multilevel Inheritance)
	void showname() {
		super.showname();
		System.out.println("College name is COEP and teacher name is Ravish");
	}
}
class Department1 extends Student{//child class of Student (Hierarchical Inheritance)
	void showname() {
		super.showname();
		System.out.println("College name is COEP and department is EXTC");
	}
}
public class HybridInheritance {
	
	public static void main(String[] args){
		Department1 d=new Department1();//Object of Department
		Teacher t=new Teacher();//Object of Teacher
		t.showname();//By calling this method with object 't' we can call method of College as well as method of Teacher class as we have used super keyword in Teacher class to call the parent class
		d.showname();//We can call Student as well as Department methods with this object
	}
}
