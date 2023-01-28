package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample3
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
		hs.add(106);
		
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.contains(null));
		System.out.println(hs.isEmpty());
		
		//remove/delete
		hs.remove(102);
		System.out.println(hs);
		
		System.out.println("Print all data using Iterator curosor");
		Iterator itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());

		}
		System.out.println("print data using for each loop");
		for(Object s1:hs)
		{
			System.out.println(s1);
		}
	}

}
