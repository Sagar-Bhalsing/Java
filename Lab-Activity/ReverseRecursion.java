package executor;
import java.util.Scanner;
public class ReverseRecursion {
	int num;
	int rev;
	int remainder;
	static void rec(int num) {
		if (num<10) {
			System.out.print(num);
		}
		else  {
			System.out.print(num%10);
			rec(num/10);
		}
		
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n=s.nextInt();
	    rec(n);
	}
	
}
