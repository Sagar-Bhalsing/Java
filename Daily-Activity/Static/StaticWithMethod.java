// Write a program to apply static with method
package executor;
public class StaticWithMethod {

    int rollno;
    String studentname;
    static String collegename = "SPIT";

    StaticWithMethod(int r, String s){//Parameterized Constructor
        rollno = r;
        studentname = s;
    }
    
    static void change(){//Static Method
        collegename = "COEP";   // same variable for every object (STATIC)
    }

    void display(){//Method to display
        System.out.println("\nRoll no.: " + rollno + "\nStudent Name: " + studentname + "\nCollege Name: " + collegename);
    }

    public static void main(String[] args){

        StaticWithMethod s1 = new StaticWithMethod(24, "Sagar");//Object Creation
        StaticWithMethod s2 = new StaticWithMethod(14, "Anchal");
        StaticWithMethod.change();//Calling method to change
        s1.display();
        s2.display();
    }  
}
