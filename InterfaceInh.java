package JavaDemo;
 interface i1
{
	double pi=3.14;
	void method1();
}
 interface i2 extends i1
{
	void method2();
}
class MyBase
{
	void myBaseMethod()
	{
		System.out.println("call to myBaseMethod");
	}
	}

public class InterfaceInh extends MyBase implements i2 {
	public double circumference(double r)
	{
		return(2*pi*r);
	}
	public void method2()
	{
		System.out.println("Call to Method2");
	}
	public void method1()
	{
		System.out.println("Call to Method1");
	}
	
	public static void main(String[] args) {
	InterfaceInh obj=new InterfaceInh();
			double ans=obj.circumference(4);
			System.out.println("Circumference of the circle="+ans);
	}
	}


