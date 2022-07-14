//Write a program for Airline company,you are in the luggage check department and as per the rules u can allow only 20kg per customer-if more than 20kg of weight is not accepted.
package executor;
import java.util.Scanner;//Importing scanner methods

public class Airline {
	int weight;
	void input() {//Method for input
		Scanner s=new Scanner(System.in);//Object of scanner class
		System.out.println("Enter weight of your luggage: ");
		weight =s.nextInt();
	}
	void check() {//Method to check weights of luggage
		if (weight<20) {
			System.out.println("Your luggage weighs in acceptable range");
		}
		else {
			System.out.println("Sorry but your luggage weighs more than 20kg");
		}
	}
	public static void main(String[] args) {
		Airline a=new Airline();//Object of class
		a.input();//Method
		a.check();//Method 
		
	}
}
