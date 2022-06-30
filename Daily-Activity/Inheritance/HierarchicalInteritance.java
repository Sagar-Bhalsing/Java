//Program for Hierarchical Inheritance
package executor;

class College{//Parent Class
	String cname;
	String city;
	College(){//Constructor
		cname="SPIT";
		city="Mumbai";
	}
}
class Students extends College{//Child class of college
	String sname="Sagar";
	Students(){//Constructor
	System.out.println("My name is:"+sname);
	System.out.println("I am from college:"+cname);
	}
	
}
class Department extends College{//Child class of college
	String dept="EXTC";
	Department(){//Constructor
		System.out.println("I am from college:"+cname);
		System.out.println("I am from "+dept+" Deparment");
	}
}

public class HierarchicalInteritance {
	public static void main(String[] args)
	{
		Department d=new Department();//Object of child class Department
		Students s=new Students();//Object of child class Students
		
	}
}
