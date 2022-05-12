public class Forloop {
	public static void main(String args[]) {
		
		int my_array[]= {1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		for (int a:my_array) 
			sum += a ;
	    System.out.println("Sum of array elements is:"+sum);
	}
}
