package JavaDemo;
 class Car
{
	public int gear;
	public int speed;
	public Car(int gear,int speed)
	{
		this.gear=gear;
		this.speed=speed;
		}
	public void traffic(int v1)
	{
		System.out.println("Speed in traffic: "+v1);
		
		}
	public void highway(int v2)
	{
		System.out.println("Speed on the highway: "+v2);
		
	}
	public void display()
	{
		System.out.println("No.of gears: "+gear+
				"\nSpeed of the Vehicle: "+speed);
	}
}
 class Swift extends Car
 {
	 public int price;
	 public Swift(int gear,int speed,int price)
	 {
		 super(gear,speed);
		 this.price=price;
	 }
	 public void display()
	 {
		 super.display();
		 System.out.println("Price of the Vehicle is: "+price);
	 }
 }
public class InheritanceDemo {
	public static void main(String[] args) {
Swift s=new Swift(6,200,800000);
s.display();
s.traffic(40);
s.highway(80);
	}
}

	
		
