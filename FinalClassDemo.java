package JavaDemo;
final class Final
{
	final double PI=3.14;
	int r=10;
	int a=7;
	void circum()
	{
		double c= 2*PI*r;
		System.out.println("The circumference of the circle is: "+c);
	}
	final void area()
	{
		int d=a*a;
		System.out.println("The area of the square is: "+d);
	}
}

public class FinalClassDemo {

	public static void main(String[] args) {
		Final f=new Final();
		f.circum();
		f.area();

	}

}
