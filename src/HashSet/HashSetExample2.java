package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample2 
{
	public static void main(String[] args)
	{
		HashSet hs=new HashSet();
		hs.add(0);
		hs.add(1);
		hs.add(2);
		hs.add("Divya");
		hs.add('O');
		hs.add(5);
		hs.add(null);
		
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		System.out.println(hs.contains(5));
		//remove
		hs.remove("Divya");
		System.out.println(hs);
		
		System.out.println("Print all data using iterator cursor");
		Iterator itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("Print all data using for each loop ");
		for(Object s1:hs)
		{
			System.out.println(s1);
		}
		
	}

}
