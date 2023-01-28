package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample5
{
	public static void main(String[] args) 
	{
		HashSet hs=new HashSet();
		hs.add("Divya");
		hs.add(101);
		hs.add(102);
		hs.add(103);
		hs.add(104);
		hs.add(105);
		hs.add(null);
		hs.add(89.3f);
		
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		System.out.println(hs.contains(102));
		
		//remove
		hs.remove(213);
		System.out.println(hs);
		
		System.out.println("Print data using iterator cursor");
		Iterator itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("Print all data using for each loop");
		for(Object s1:hs)
		{
			System.out.println(s1);
		}
	}

}
