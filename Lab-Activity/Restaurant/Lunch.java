package executor;
import java.util.Scanner;

public class Lunch {
	int sum;
	int x;
	int y;
	int[] arrayx = new int[8];  
	int[] arrayy = new int[8];
	Scanner s=new Scanner(System.in);
	String Lunch[]={"Mutter Panner","Chicken Makhni","Biryani","Fish Curry","Undhiyo","Chole Bhature","Rajma Chawal","Dal Makhani"}; 
	int Price[]= {180,300,450,500,350,200,300,120};
	void input() {
		System.out.println("Lunch Menu:");
		System.out.println("");
		for(int i=0; i<Lunch.length;i++) {
			System.out.println(i+1+")"+" "+Lunch[i]+"--"+Price[i]+"Rs");
		}
	}
	void order() {
		System.out.println("Enter the corresponding number to the dish you want");
		System.out.println("To exit enter 0");
		for(int i=0; i<Lunch.length; i++)  
		{  
			x=s.nextInt();
			  if (x == 0) {
		          break;}
			  else {
			  arrayx[i]=x;
			  System.out.print("Quantity:");
			  y=s.nextInt();
			  arrayy[i]=y;
			  sum+=Price[x-1]*y;
			  x=0;
			  y=0;
		  }
		}  
	}
	void bill() {
		for(int i=0;i<arrayx.length;i++) {
			if (arrayx[i]-1<0 | arrayy[i]-1<0) {
				break;
			}
			else {
			System.out.println(Lunch[arrayx[i]-1]+"-- "+Price[arrayx[i]-1]+"x"+arrayy[i]);
			}
			
		}
			
		System.out.println("----------------");
		System.out.println("Total Bill--"+sum+"Rs");
		System.out.println("");
		System.out.println("                   ~~THANK YOU~~");
		System.out.println("               ~~PLEASE COEM AGAIN~~");
	}

	

}
