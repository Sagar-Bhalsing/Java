package executor;
import java.util.Scanner;
public class Restaurant {
	public static void main(String[] args) {
		int x;
		Scanner s=new Scanner(System.in);
		Breakfast b=new Breakfast();
		Lunch l=new Lunch();
		Dinner d=new Dinner();
		System.out.println("            ~~~Welcome to Azure Restaurant~~~");
        System.out.println("");
		System.out.println("What would you like to have:");
		System.out.println("1) Breakfast");
		System.out.println("2) Lunch");
		System.out.println("3) Dinner");
		x=s.nextInt();
		
		switch(x) {
		  case 1:
		    b.input();
		    b.order();
		    b.bill();
		  case 2:
			l.input();
			l.order();
			l.bill();
		    break;
		  case 3:
			d.input();
			d.order();
			d.bill();
			    break;
		  default:
		}
	}
}
