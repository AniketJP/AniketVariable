package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample4 
{
	public static void main(String[] args)
	{
		HashSet hs=new HashSet();
		hs.add("Divya");
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50.5f);
		hs.add('O');
		hs.add(null);
		
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		System.out.println(hs.contains(12));
		
		System.out.println("Print all data using Iterator cursor");
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
