package JavaDemo;
import java.util.*;
public class Hashsetdemo {

	public static void main(String[] args) {
		HashSet<Integer> hs= new HashSet<>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		Integer hs1=new Integer(4);
		hs.add(hs1);
		System.out.println("The size of the hashset is:"+hs.size());
		System.out.println("The Hashset Values are:"+hs);
		hs.remove(hs1);
		System.out.println("The size of the treeset after removal is:"+hs.size());
		Iterator i=hs.iterator();
		while(i.hasNext())
		{
		System.out.println("The Hashset Vaues are:"+i.next());
		}

	}

}
