// Write a program to apply static as block

package executor;
public class Staticblock {

    // static block will get executed before main 
    // but cannot get executed without main
    // because it is stored in the memory at the time of class loading and before the object creation
	static {//Static block 
        System.out.println("Executes StaticBlock...");   
    }
    public static void main(String[] args){//Main 

        System.out.println("Executes Main...");
    }
}
