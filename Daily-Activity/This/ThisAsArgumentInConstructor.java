//Program to pass as this argument in the constructor
package executor;
public class ThisAsArgumentInConstructor {
	Testthis5 r1;//Object of Constructor
	ThisAsArgumentInConstructor(Testthis5 r1)
	{
		this.r1=r1;
	}
	void disp() {//Method 
		System.out.println(r1.a);

	}
}
class Testthis5//Constructor
{
int a=10;
Testthis5()
{
	ThisAsArgumentInConstructor t1=new ThisAsArgumentInConstructor(this);//Object Creation with this keyword as argument
	t1.disp();
	}
public static void main(String[] args)
{
	Testthis5 t=new Testthis5();//Object creation
	}
}