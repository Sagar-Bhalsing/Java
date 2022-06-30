// Write a program to test this keyword for the current class method
package executor;
public class ThisWithMethod {
	void display(){//method
        System.out.println("Test this for method...");
    }

    void Ouput(){
        this.display();//this keyword to call display method
    }
    
    public static void main(String[] args){

        ThisWithMethod t = new ThisWithMethod();//Object creation
        t.Ouput();
    }
}
