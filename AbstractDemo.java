package JavaDemo;
abstract class Shape
{
	protected int unit;
	abstract protected float calcArea();
	void display()
	{
		System.out.println("Display Method in Abstract Class");
	}
}
class Circle extends Shape
{
	public Circle()
	{
		unit=12;
	}
	public float calcArea()
	{
		return (float)(3.14*unit*unit);
	}
	}
class Square extends Shape
{
	public Square()
	{
		unit=3;
	}
	public float calcArea()
	{
		return (unit*unit);
	}
	}

public class AbstractDemo {
	public static void main(String args[])
	{
	
	 Shape c=new Circle();
	// Circle c=new Circle();
			c.display();
	Square s=new Square();
	System.out.println("Area of the square="+s.calcArea()+" "+c.calcArea());
	s.display();
	}

}
