package JavaDemo;

public class StaticDemo {
int a;
static int b;
public StaticDemo()
{
	b++;
}
void display()
{
	System.out.println("The value of a: "+a+"\nThe value of b: "+b);
}
public static void decrement()
{
	b-=1;
	System.out.println("The decremented value of Static Variable is: "+b);
}
	public static void main(String[] args) {
		StaticDemo s1=new StaticDemo();
		s1.display();
		StaticDemo s2=new StaticDemo();
		s2.display();
		StaticDemo.decrement();

	}

}
