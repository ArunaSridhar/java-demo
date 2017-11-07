package JavaDemo;
import java.util.*;

public class ListDemo {
	public static void main(String args[])
	{
		System.out.println("-----Array List-----");
		ArrayList<String> al=new ArrayList<>();
		al.add("Apple");
		al.add("Mango");
	al.add("Papaya");
	al.add("Lemon");
	al.add("Orange");
	System.out.println("The size of the array is:"+al.size());
	System.out.println("The elements of the Array list are:"+al);
	System.out.println("The list item at position 3 is:"+al.get(3));
	al.remove(2);
	System.out.println("The ArrayList items after removal are:");
	ListIterator i=al.listIterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	System.out.println("-----Linked List-----");
	LinkedList<String> ll=new LinkedList<>();
	ll.add("AAA");
	ll.add("BBB");
	ll.add("CCC");
	ll.add("DDD");
	ll.add("EEE");
	System.out.println("The size of the Linkedlist is:"+ll.size());
	System.out.println("The elements of the Linked list are:"+ll);
	System.out.println("The list item at position 4 is:"+al.get(2));
	ll.remove(1);
	System.out.println("The LinkedList items after removal are:");
	ListIterator j=ll.listIterator();
	while(j.hasNext())
	{
		System.out.println(j.next());
	}

}
}
