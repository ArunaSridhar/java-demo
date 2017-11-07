package JavaDemo;

import java.util.TreeSet;
import java.util.Iterator;

public class TreesetDemo {
	public static void main(String args[])
	{
		TreeSet<String> ts= new TreeSet<>();
		ts.add("Devi");
		ts.add("Badri");
		ts.add("Aruna");
		String ts1=new String("Chitra");
		ts.add(ts1);
		System.out.println("The size of the treeset is:"+ts.size());
		System.out.println("The Treeset Values are:"+ts);
		ts.remove(ts1);
		System.out.println("The size of the treeset after removal is:"+ts.size());
		Iterator i=ts.iterator();
		while(i.hasNext())
		{
		System.out.println("The Hashset Vaues after removal are:"+i.next());
		}
		
		
		
	}

}
