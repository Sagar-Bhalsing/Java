package executor;
import java.util.Scanner;
public class Breakfast {
int sum;
int x;
int y;
int[] arrayx = new int[8];  
int[] arrayy = new int[8];  
Scanner s=new Scanner(System.in);
String Breakfast[]={"Coffee","Egg","Toast","Waffles","Pancake","Poha","Idli Sambar","Dhokla"}; 
int Price[]= {30,30,40,80,100,50,30,40};
void input() {
	System.out.println("Breakfast Menu:");
	System.out.println("");
	for(int i=0; i<Breakfast.length;i++) {
		System.out.println(i+1+")"+" "+Breakfast[i]+"--"+Price[i]+"Rs");
	}
}
void order() {
	System.out.println("Enter the corresponding number to the dish you want");
	System.out.println("To exit enter 0");
	for(int i=0; i<Breakfast.length; i++)  
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
		System.out.println(Breakfast[arrayx[i]-1]+"-- "+Price[arrayx[i]-1]+"x"+arrayy[i]);
		}
	}
		
	System.out.println("----------------");
	System.out.println("Total Bill--"+sum+"Rs");
	System.out.println("");
	System.out.println("                   ~~THANK YOU~~");
	System.out.println("               ~~PLEASE COME AGAIN~~");
}


}
