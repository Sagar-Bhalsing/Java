//Using conditional operator check whether the person is eligible for voting or not by accpeting input from the user
import java.util.*; 
public class ternary {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);      
		System.out.print("Enter age of the person: ");  
		int a= sc.nextInt();  
		String Result=(a>=18)?"You are eligible":"You are not eligible";
		System.out.println(Result);
		
	}
}
