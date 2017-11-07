package JavaDemo;

 class FinalDemo1 {
	final double PI=3.14;
	int r=5;
	int a=4;
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
public class FinalDemo extends FinalDemo1
{
	void area1()
	{
		double e=PI*r*r;
		System.out.println("The area of the circle: "+e);
	}
	public static void main(String[] args)
	{
		FinalDemo f=new FinalDemo();
		f.area1();
		f.circum();
		f.area();
	}
}
