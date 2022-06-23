//Write a program to calculate the area of rectangle by initialising the data members inside the method.//

package executor;
import java.util.Scanner;

public class AreaOfRectangle { 
	public static void main(String args[]) {
		rectangle rect=new rectangle();
				
		//create scanner class object
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter breath number:");
		 rect.breath= sc.nextInt();
		System.out.println("Enter length number:");
		rect.length= sc.nextInt();
		rect.area();
	}
		
}

class rectangle{
	int breath;
	int length;
	
	void area() {
		int product=breath * length;
		System.out.println("The area of Reactangle is:" + product );
	}
	
}
