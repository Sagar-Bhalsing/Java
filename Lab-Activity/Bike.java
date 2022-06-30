//PROBLEM STATEMENT//
//Define a class called Bike with the following description:Instance variables/data members:
//String bno – to store the bike’s number(MH65AB1234)
//String name – to store the name of the customer
//int days – to store the number of days the bike is taken on rent
//int charge – to calculate and store the rental charge
//Member methods:
//void input( ) – to input and store the detail of the customer.
//void compute( ) – to compute the rental chargeThe rent for a bike is charged on the following basis.
//First five days Rs 500 per day
//Next five days Rs 400 per day
//Rest of the days Rs 200 per day
//void display ( ) – to display the details in the following format:
//Bike No. PhoneNo. No. of days Charges

package executor;
import java.util.Scanner;//Importing scanner class

public class Bike {
	//Initializing Variables
	String bikeno ="MH65AB1234";
	String cname;
	int phone;
	int days;
	Scanner s = new Scanner(System.in);//Creating scanner Object
	void input() {//Method to take input
		System.out.print("Enter your name:");
		String cname=s.nextLine();
		System.out.print("Enter number of days you want to rent the bike:");
		days=s.nextInt();

	}
	void compute() {//Method to compute charges for the days
		//Conditions depending on number of days
		if (days<=5) {
			int x= days*500;
			System.out.print("Your charges for "+ days + " days is " +x);
		}
		else if(days<=10) {
			int y = 5*500 + (days-5)*400;
			System.out.print("Your charges for "+ days + " days is " +y);
		}
		else {
			int z= 5*500 + 5*400 +(days-10)*200;
			System.out.print("Your charges for "+ days + " days is " +z);
		}
	}
	void display() {//Method to display 
		System.out.println("Bike no: "+ bikeno);
		
		System.out.println("No. of days: " +days);
	}
	public static void main(String[] args)
	{
		Bike b=new Bike();//Creating Bike class object
		//Methods for object b
		b.input();
		b.display();
		b.compute();
		
	}

}
