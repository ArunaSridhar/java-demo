package JavaDemo;
import java.util.*;

public class MapDemp {

	public static void main(String[] args) {
		System.out.println("-----HashMap-----");
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(01, "AAA");
		hm.put(02, "BBB");
		hm.put(03, "CCC");
		hm.put(04, "DDD");
		hm.put(05, "EEE");
		System.out.println("The size of the HashMap is:"+hm.size());
		System.out.println("The item at Key Position 03 is"+hm.get(03));
		System.out.println("The Elements of the HashMap Before Removal are"+hm);
		Set<Integer>allKeys=hm.keySet();
		System.out.println(allKeys);
		for(Integer keys:allKeys)
		{
			System.out.println("The Key Values are:"+hm.get(keys));
		}
		hm.remove(04);
		System.out.println("The Elements of the HashMap after removal are:"+hm);
		System.out.println("-----TreeMap-----");
		TreeMap<Integer,String> tm=new TreeMap<>();
		tm.put(333, "Baskar");
		tm.put(111, "Radha");
		tm.put(444, "Suja");
		tm.put(222, "Ishwar");
		System.out.println("The size of the TreeMap is:"+tm.size());
		System.out.println("The Element at KeyPosition 333 is:"+tm.get(333));
		System.out.println("The Elements of the TreeMap Before Removal are"+tm);
		tm.remove(222);
		System.out.println("The Elements of the TreeMap After removal are:"+tm);

	}

}
