//Program for Constructor Overloading
package executor;
public class ConstructorOverloading {
    
    int rollno;
    String name;

    ConstructorOverloading(){}//Default Constructor
    
    ConstructorOverloading(int r){//Parameterized Constructor
        rollno = r;
    }
    
    ConstructorOverloading(int r, String n){//Parameterized Constructor
        rollno = r;
        name = n;
    }

    void disp(){//Method for display
        System.out.println("\nRoll no.: " + rollno);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args){
    	//Creating Objects of Constructors and then calling disp method with these objects
        ConstructorOverloading p1 = new ConstructorOverloading();
        p1.disp();
        ConstructorOverloading p2 = new ConstructorOverloading(24);
        p2.disp();
        ConstructorOverloading p3 = new ConstructorOverloading(24, "Sagar");
        p3.disp();
    }
}