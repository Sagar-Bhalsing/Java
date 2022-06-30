//Program for MethodOverloading
package executor;
public class MethodOverloading {

    static int sum(int num1, int num2){//Static variable
        return num1+num2;
    }
    
    int sum(int num1, int num2, int num3){//Non-static variable
        return num1+num2+num3;
    }

    public static void main(String[] args){

        System.out.println(MethodOverloading.sum(10, 20));
        // calling method from classname
        // method should be static

        MethodOverloading m = new MethodOverloading();//Object creation of Class MethodOverlaoding
        System.out.println(m.sum(10, 20, 30));
    }
}