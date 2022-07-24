package executor;//package 
import java.util.Scanner;//scanner library 
public class Restaurant {
	public static void main(String[] args) {
		int x;
		Scanner s=new Scanner(System.in);//scanner object
		Breakfast b=new Breakfast();//Object of Breakfast class
		Lunch l=new Lunch();        //Object of Lunch class
		Dinner d=new Dinner();      //Object of Dinner class
		System.out.println("            ~~~Welcome to Azure Restaurant~~~");//Header Statement
        System.out.println("");
		System.out.println("What would you like to have:");
		//Choose your Menu
		System.out.println("1) Breakfast");
		System.out.println("2) Lunch");
		System.out.println("3) Dinner");
		x=s.nextInt();//Your choice 
		
		switch(x) {//Switch case for different Menus
		  case 1://Breakfast Ordering
		    b.input();
		    b.order();
		    b.bill();
		    break;
		  case 2://Lunch Ordering
			l.input();
			l.order();
			l.bill();
		    break;
		  case 3://Dinner Ordering
			d.input();
			d.order();
			d.bill();
			break;
		  default:
		}
	}
}
